package chapter7;

class Shape {
    String color = "black";
    void draw() {
        System.out.println("color - " + color);
    }
}

class Point {
    int x;
    int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return " x :" + x +" y :" + y ;
    }
}

class Circle extends Shape {
    Point center;
    int r;

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    Circle() {
        this(new Point(0,0), 100);
    }
    void draw() {
        System.out.println(center.x+" " + center.y+" "+ r+" "+ color);
    }
}

class Triangle extends Circle {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }
    void draw() {
        System.out.println(p[0].getXY() + p[1].getXY()+ p[2].getXY()+ color);
    }
}



public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {new Point(100, 100), new Point(140, 50), new Point(150, 150)};

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw();
        c.draw();
    }
}
