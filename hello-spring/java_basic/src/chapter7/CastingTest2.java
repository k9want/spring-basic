package chapter7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; //컴파일은 되는데 실행시에 에러 발생이유 주의!! 컴파일 시에는 참조변수간의 타입만 체크하기 때문에 생성될 인스턴스의 타입에 대해서는 모른다.
        fe.drive();
        car2 = fe;
        car2.drive();

    }
}
