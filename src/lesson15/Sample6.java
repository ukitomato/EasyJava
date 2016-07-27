package lesson15;

class Car5 implements Runnable {
    private String name;

    public Car5(String nm) {
        name=nm;
    }
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(name+"の処理をしています");
        }
    }
}
class Sample6 {
    public static void main(String[] args) {
        Car5 car1=new Car5("1号車");
        Thread th1=new Thread(car1);
        th1.start();

        for(int i=0;i<5;i++) {
            System.out.println("main()の処理をしています");
        }
    }
}
