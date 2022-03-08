package org.WalkerCC_CompSci;

public abstract class Shape {

    protected Point[] listOfPoints;

    public void GetSideLength(int sideLengthNumber) {
        if (sideLengthNumber >= listOfPoints.length - 1) {
            GetSideLength(listOfPoints[listOfPoints.length - 1], listOfPoints[0]);
        } else if (sideLengthNumber < 0) {
            GetSideLength(listOfPoints[0], listOfPoints[1]);
        } else {
            GetSideLength(listOfPoints[sideLengthNumber], listOfPoints[sideLengthNumber + 1]);
        }
    }

    private double GetSideLength(Point point0, Point point1) {
        //Does the GetSideLength math work stuff
 return listOfPoints.length;
    }

    protected abstract double GetSideLength();

    public Point[] GetPerimeter(){
        //Does the Perimeter Math Work Stuff
 return listOfPoints;
    }



}
