package chapter6;

class Car {
    String color;
    String gearType; //auto(자동) , manual(수동)
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
