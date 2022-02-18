package chapter7;

class Point7_8 {
    int x = 10;
    int y = 20;

    public Point7_8(int x, int y) {
        //super(); 컴파일러에 의해 자동으로 생성된다.
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return " x : " + this.x +" y : " + this.y;
    }
}


class Point3D_7_8 extends Point7_8 {
    int z = 25;

    public Point3D_7_8() {
        this(10, 20, 30);
    }

    public Point3D_7_8(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + " z : "+ z;
    }
}



public class PointTest2 {
    public static void main(String[] args) {
        Point3D_7_8 p3 = new Point3D_7_8();
        System.out.println(p3.getLocation());
    }
}
