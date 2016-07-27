package lesson10;

class Car8 {
    private int num;
    private double gas;
    private String name;

    public Car8() {
        num = 0;
        gas = 0.0;
        name="名無し";
        System.out.println("車を作成しました");
    }

    public void setCar8(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました");
    }

    public void setName(String nm) {
        name =nm;
        System.out.println("名前を"+name+"としました");
    }

    public void show8() {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
        System.out.println("名前は"+name+"です");
    }
}
class Sample8 {
    public static void main(String[]args) {
        Car8 car1;
        car1 = new Car8();
        car1.show8();
        int number =1234;
        double gasoline=20.5;
        String str="1号車";

        car1.setCar8(number, gasoline);
        car1.setName(str);
        car1.show8();
    }
}
