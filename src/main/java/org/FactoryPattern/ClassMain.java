package org.FactoryPattern;

public class ClassMain
{
    public static void main(String[] args)
    {
        System.out.println("Inside the main method bro");
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circleObj=shapeFactory.getShape("CIRCLE");
        circleObj.draw();

        Shape RectangleObj=shapeFactory.getShape("RECTANGLE");
        RectangleObj.draw();
    }
}
