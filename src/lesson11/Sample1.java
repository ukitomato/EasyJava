package lesson11;

class Car1 {
    private int num;
    private double gas;

    public Car1() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");
    }

    public Car1(int n, double g) {
        num =n;
        gas =g;
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
    }


    public void setCar1(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました");
    }

    public void show1() {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }

}

//レーシングカークラス
class RacingCar1 extends Car1 {
    private int course;

    public RacingCar1() {
        course =0;
        System.out.println("レーシングカーを作成しました");
    }

    public void setCourse1(int c) {
        course =c;
        System.out.println("コース番号を"+course+"にしました");
    }
}
class Sample1 {
    public static void main(String[] args) {
        RacingCar1 rccar1;
        rccar1 = new RacingCar1();

        rccar1.setCar1(1234,20.5);
        rccar1.setCourse1(5);
    }
}
