@default_properties
Feature: Calculate The Next Generation Cell State

  Scenario Outline: live cell with less than two live neighbours, dies.
    Given <state> cell with <number> neighbors
    When I calculate the next generation
    Then the cell should be <future>
    Examples:
      | state   | number | future |
      | "alive" | 0      | "dead" |
      | "alive" | 1      | "dead" |

  Scenario Outline: live cell with more than three live neighbours, dies.
    Given <state> cell with <number> neighbors
    When I calculate the next generation
    Then the cell should be <future>
    Examples:
      | state   | number | future |
      | "alive" | 4      | "dead" |
      | "alive" | 5      | "dead" |
      | "alive" | 6      | "dead" |
      | "alive" | 7      | "dead" |
      | "alive" | 8      | "dead" |

  Scenario Outline: live cell with two or three live neighbours stays alive.
    Given <state> cell with <number> neighbors
    When I calculate the next generation
    Then the cell should be <future>
    Examples:
      | state   | number | future  |
      | "alive" | 2      | "alive" |
      | "alive" | 3      | "alive" |

  Scenario Outline: dead cell with exactly three live neighbours becomes a live cell.
    Given <state> cell with <number> neighbors
    When I calculate the next generation
    Then the cell should be <future>
    Examples:
      | state  | number | future  |
      | "dead" | 0      | "dead"  |
      | "dead" | 1      | "dead"  |
      | "dead" | 2      | "dead"  |
      | "dead" | 3      | "alive" |
      | "dead" | 4      | "dead"  |
      | "dead" | 5      | "dead"  |
      | "dead" | 6      | "dead"  |
      | "dead" | 7      | "dead"  |