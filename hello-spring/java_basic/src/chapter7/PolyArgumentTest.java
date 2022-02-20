package chapter7;

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
    Product[] boughtProduct = new Product[10]; //구입한 제품을 저장하기 위한 배열 생성
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        boughtProduct[i++] = p;
        System.out.println(p.toString() + " 구매완료");
    }

    void summary() {
        int sum = 0;
        String boughtProductList = "";

        for (int i = 0; i < boughtProduct.length; i++) {
            if(boughtProduct[i] == null){
                break;
            }
            sum += boughtProduct[i].price;
            boughtProductList += boughtProduct[i] + ", ";
        }
        System.out.println("구입한 물품의 총 금액 : " + sum + "원");
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
    }
}
