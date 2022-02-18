package chapter7;

class Point7 {
    int x, y;

    public Point7() {
        this(1, 1);
    }

    public Point7(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return " x : "+ x + " y : " + y;
    }
}

class Point3D extends Point7 {
    int z;

    Point3D() {
        this(1,1,1);
    }

    public Point3D(int x, int y, int z) {
//        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + " z : " + z;
    }
}


public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println(p3.getLocation());
    }
}
