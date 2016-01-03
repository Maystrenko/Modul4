package Figure;

public class Figure {

    public static double getTriangleSquare(double triangleSideLength, double triangleHeightLength){

        return (triangleSideLength / 2) * triangleHeightLength;
    }

    public static double getRectangleSquare(double rectangleSideALength, double rectangleSideBLength){

        return rectangleSideALength * rectangleSideBLength;
    }

    public static double getCircleSquare(double circleRadius){

        return Math.PI * circleRadius * circleRadius;
    }

    public static void main(String[] args) {

        System.out.println(Figure.getCircleSquare(5.0));
        System.out.println(Figure.getRectangleSquare(5.0, 10.0));
        System.out.println(Figure.getTriangleSquare(10.0, 2.0));

    }

}
