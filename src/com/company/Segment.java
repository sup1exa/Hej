package com.company;

public class Segment {
    private Point point1,point2;
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
    public String toSvg(){
        String ans;
        ans = "<line x1 = ";
        ans += '"';
        ans += Math.min(first.x,second.x);
        ans += '"';
        ans += " x2 = ";
        ans += '"';
        ans += Math.max(first.x,second.x);
        ans += '"';
        ans += " y1 = ";
        ans += '"';
        ans += Math.min(first.x,second.x);
        ans += '"';
        ans += " y2 = ";
        ans += '"';
        ans += Math.max(first.x,second.x);
        ans += '"';
        ans += " stroke = ";
        ans += '"';
        ans += "red";
        ans += '"';
        ans += " stroke-width = ";
        ans += '"';
        ans += 5;
        ans += '"';
        ans+="/>";
        return ans;
    }

}
