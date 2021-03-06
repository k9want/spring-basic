package chapter12;

enum Direction {EAST, SOUTH, WEST, NORTH}


public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 :" + d1);
        System.out.println("d2 :" + d2);
        System.out.println("d3 :" + d3);

        System.out.println("d1 == d2 " + (d1 == d2));
        System.out.println("d1 == d3 " + (d1 == d3));
        System.out.println("d1.equals(d3) " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) " + d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) " + d1.compareTo(d2));

        switch (d1) {
            case EAST:
                System.out.println("EAST");
                break;
            case WEST:
                System.out.println("West");
                break;
            case SOUTH:
                System.out.println("South");
                break;
            case NORTH:
                System.out.println("North");
                break;
        }

        Direction[] valuesArr = Direction.values();

        for (Direction d : valuesArr) {
            System.out.printf("%s %d%n",d.name(), d.ordinal());
        }
    }
}
