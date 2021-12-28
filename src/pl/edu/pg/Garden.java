package pl.edu.pg;

public class Garden {
    protected int minIndexI = 2;
    protected int minIndexJ = 2;


    public Garden(int minIndexI, int minIndexJ) {
        this.minIndexI = minIndexI;
        this.minIndexJ = minIndexJ;
    }

    int[][] GardenSize;



    ////////////////////////////////////////////////////////////////////

    public int getMinIndexI() {
        return minIndexI;
    }

    public int getMinIndexJ() {
        return minIndexJ;
    }

   public void setMinIndexI(int minIndexI) {
        this.minIndexI = minIndexI;
    }

    public void setMinIndexJ(int minIndexJ) {
        this.minIndexJ = minIndexJ;
    }
}
