package lesson10;

class Sample7 {
    public static void main(String[] args) {
        Car car1;
        System.out.println("car1を宣言しました");
        car1 = new Car();
        car1.setCar(1234, 20.5);

        Car car2;
        System.out.println("car2を宣言しました");

        car2 = car1;
        System.out.println("car2にcar1を代入しました");

        System.out.println("ca1がさす");
        car1.show();
        System.out.println("car2がさす");
        car2.show();

        System.out.println("car1がさす車に変更を加えます");
        car1.setCar(2345, 30.5);

        System.out.println("ca1がさす");
        car1.show();
        System.out.println("car2がさす");
        car2.show();
    }
}
