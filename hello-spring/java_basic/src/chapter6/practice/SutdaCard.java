package chapter6.practice;

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    SutdaCard(){
        this(1, true);
    }

    String info() {
        if (isKwang) {
            return num + "K";
        }
        return num + "";
    }
}
