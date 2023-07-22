package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String coordinatePane = "zero";
        if(x > 0 && y > 0) {
            coordinatePane = "first";
        } else if (x < 0 && y > 0) {
            coordinatePane = "second";

        } else if (x<0 && y < 0) {
            coordinatePane = "third";
        } else if (x > 0 && y < 0) {
            coordinatePane  = "fourth";
        }

        System.out.println(coordinatePane);

    }
}
