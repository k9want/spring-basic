package chapter7;

import java.util.Vector;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product() {}
}

class Tv7 extends Product {
    Tv7() {
        super(100);
    }

    public String toString() {
        return "tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }

}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector boughtProduct = new Vector(); //Vector 객체 사용
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        boughtProduct.add(p);
        System.out.println(p.toString() + " 구매완료");
    }

    void refund(Product p) {
        if (boughtProduct.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을 반품");
        } else {
            System.out.println("구입한 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String boughtProductList = "";

        if (boughtProduct.isEmpty()) {
            System.out.println("구입한 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < boughtProduct.size(); i++) {
            Product p = (Product) boughtProduct.get(i);
            sum += p.price;
            boughtProductList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입한 물품의 총 금액 : " + sum);
        System.out.println("구입한 제품 : " + boughtProductList);
    }
}



public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Computer c = new Computer();
        Tv7 t = new Tv7();
        b.buy(t);
        b.buy(c);
        b.buy(new Audio());
        System.out.println("현재 남은 돈 : "+ b.money);
        System.out.println("현재 남은 보너스 포인트 : " + b.bonusPoint);
        b.summary();

        System.out.println();
        b.refund(t);
        b.summary();
        System.out.println("현재 남은 돈 : "+ b.money);
        System.out.println("현재 남은 보너스 포인트 : " + b.bonusPoint);
    }
}
