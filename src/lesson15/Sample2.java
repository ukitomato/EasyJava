package lesson15;

class Sample2 {
    public static void main(String[] args) {
        Car car1=new Car("1号車");
        car1.start();

        Car car2=new Car("2号車");
        car2.start();

        for(int i=0;i<5;i++) {
            System.out.println("main()の処理をしています");
        }
    }
}
