package game;

public class Cell {
    private int numOfNeighbours = 0;
    private boolean isAlive;

    public Cell(boolean isAlive, int numOfNeighbours) {
        this.isAlive = isAlive;
        this.numOfNeighbours = numOfNeighbours;
    }

    public int getNumOfNeighbours() {
        return numOfNeighbours;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
