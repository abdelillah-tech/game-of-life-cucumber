package game;

public class RuleMaster {
    public void calculateTheNextGen(Cell cell) {
        cell.setAlive(nextGenIsAlive(cell));
    }

    public boolean nextGenIsAlive(Cell cell) {
        if(cell.isAlive() && hasTwoLivingNeighbours(cell)) return true;
        if(hasThreeLivingNeighbours(cell)) return true;
        return false;
    }

    public boolean hasTwoLivingNeighbours(Cell cell) {
        return cell.getNumOfNeighbours() == 2;
    }

    public boolean hasThreeLivingNeighbours(Cell cell) {
        return cell.getNumOfNeighbours() == 3;
    }
}
