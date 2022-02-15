package chapter6;
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 1111;

        Data d2 = copy(d);
        System.out.println("d2 = " + d2.x);
        System.out.println("d.x = " + d.x);
    }
    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
