package chapter7;

class Fighter extends Unit implements Fightable {
    @Override
    public void attack(Unit u) {

    }

    @Override
    public void move(int x, int y) {

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y);}
interface Attackable {void attack(Unit u);}

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("Unit클래스의 자손");
        }

        if (f instanceof Fightable) {
            System.out.println("Fightable인터페이스 구현");
        }

        if (f instanceof Attackable) {
            System.out.println("Attackable인터페이스 구현");
        }

        if (f instanceof Movable) {
            System.out.println("Movable인터페이스 구현");
        }

        if (f instanceof Object) {
            System.out.println("Object클래스의 자손");
        }


    }
}
