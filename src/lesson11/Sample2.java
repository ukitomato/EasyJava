package lesson11;

class Car2 {
    private int num;
    private double gas;

    public Car2() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");
    }

    public Car2(int n, double g) {
        num =n;
        gas =g;
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
    }


    public void setCar2(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました");
    }

    public void show2() {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }

}

//レーシングカークラス
class RacingCar2 extends Car2 {
    private int course;

    public RacingCar2() {
        course =0;
        System.out.println("レーシングカーを作成しました");
    }
    public RacingCar2(int n, double g,int c) {
        super(n,g);
        course =c;
        System.out.println("コース番号"+course+"のレーシングカーを作成しました");
    }
    public void setCourse2(int c) {
        course =c;
        System.out.println("コース番号を"+course+"にしました");
    }
}

class Sample2 {
    public static void main(String[] args) {
        RacingCar2 rccar1 = new RacingCar2(1234,20.5,5);
    }
}
