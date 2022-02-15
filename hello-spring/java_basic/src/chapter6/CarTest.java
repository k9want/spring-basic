package chapter6;

public class CarTest {
    public static void main(String[] args) {
        
        // 기본 생성자로 하는 경우보다는
        Car c1 = new Car();
        c1.color = "red";
        c1.gearType = "manual";
        c1.door = 3;
        System.out.println("c1.color + c1.gearType + c1.door = " + c1.color+" " + c1.gearType+" " + c1.door);
        
        // 매개변수가 있는 생성자를 만들어서 초기화하는 것이 더 효율적이고 직관적이다. 
        Car c2 = new Car("white", "auto", 4);
        System.out.println("c2.door,c2.gearType,c2.color = " + c2.door+" " + c2.gearType+" " + c2.color);
        
    }
}
