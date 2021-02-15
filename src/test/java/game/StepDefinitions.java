package game;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    private Cell cell;
    private RuleMaster ruleMaster;

    @Given("{string} cell with {int} neighbors")
    public void aliveOrDeadCellWithPossiblySomeAliveNeighbors(String initialLiveState, int numberOfAliveNeighbors){
        ruleMaster = new RuleMaster();
        cell = new Cell(initialLiveState.equals("alive"), numberOfAliveNeighbors);
    }

    @When ("I calculate the next generation")
    public void iCalculateTheNextGeneration()
    {
        ruleMaster.calculateTheNextGen(cell);
    }

    @Then ("the cell should be {string}")
    public void theCellShouldBe(String expectedAliveState)
    {
        String actualAliveState = "alive";
        if (!cell.isAlive()){
            actualAliveState = "dead";
        }
        Assert.assertEquals(expectedAliveState, actualAliveState);
    }
}
