package lesson15;

class Sample5 {
    public static void main(String[] args) {
        Car car1=new Car("1号車");
        car1.start();

        try {
            car1.join();
        }
        catch(InterruptedException e){}

        System.out.println("main()の処理を終わります");
    }
}
