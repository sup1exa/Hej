package com.company;

public class  Main {

    public static void main(String[] args) {
        Point point1 = new Point(12.5,23.3);
        Point point2 = new Point(42.5,1.4);
        Segment a = new Segment();
        a.SetFirst(point1);
        a.SetSecond(point2);
        a.Distance(a.GetFirst(),a.GetSecond());
        System.out.println(a.Distance(a.GetFirst(),a.GetSecond()));
        System.out.print(a.toSvg());
    }
}
