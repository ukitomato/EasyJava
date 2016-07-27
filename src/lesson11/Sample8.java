package lesson11;

class Car8 {
    protected int num;
    protected double gas;

    public Car8() {
        num=0;
        gas=0.0;
        System.out.println("車を作成しました");
    }
}
class Sample8 {
    public static void main(String[] args) {
        Car8 car1=new Car8();
        Car8 car2=new Car8();

        Car8 car3;
        car3=car1;

        boolean b11=car1.equals(car2);
        boolean b12=car1.equals(car3);

        System.out.println("car1とcar2が同じか調べたところ"+b11);
        System.out.println("car1とcar3が同じか調べたところ"+b12);

    }
}
