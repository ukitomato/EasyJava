package lesson11;

class Car9 {
    protected int num;
    protected double gas;

    public Car9() {
        num=0;
        gas=0.0;
        System.out.println("車を作成しました");
    }
}

class RacingCar9 extends Car9 {
    private int course;

    public RacingCar9() {
        course=0;
        System.out.println("レーシングカーを作成しました");
    }
}
class Sample9 {
    public static void main(String[] args) {
        Car9[] cars;
        cars=new Car9[2];

        cars[0]=new Car9();
        cars[1]=new RacingCar9();

        for(int i=0;i<cars.length;i++){
            Class cl=cars[i].getClass();
            System.out.println((i+1)+"番目のオブジェクトクラスは"+cl+"です");
        }
    }
}
