package com.company;

public class Segment {
    private Point first = new Point(23.5,12.3) ;
    private Point second = new Point(34.1,22.6) ;
    Segment(){}
    void SetFirst(Point first){
        this.first=this.first;
    }
    void SetSecond(Point second){
        this.second=this.second;
    }
    Point GetFirst(){
        return first;
    }
    Point GetSecond(){
        return second;
    }
    double Distance(Point first,Point second){
        return Math.sqrt(Math.pow(second.x-first.x,2) + Math.pow(second.y-first.y,2));
    }
    //String napis(Point first,Point second){
        // return String str1= String.format("%s",'<svg height="210" width="500">
  //<line x1="0" y1="0" x2="20" y2="20" style="stroke:rgb(255,0,0);stroke-width:2" />
      //          Sorry, your browser does not support inline SVG.
//</svg>)'
  //  }
    double haha(Segment a,Point point1){
        a.Distance(a.GetFirst(),a.GetSecond());
        Point point2= new Point()
    }
}
