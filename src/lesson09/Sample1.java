package lesson09;

class Car1 {
int num;
double gas;

void show()
{
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
}
}

class Sample1
{
public static void main(String[] args)
{
        Car1 car1 = new Car1();

        car1.num=1234;
        car1.gas=20.5;
        car1.show();
}

}
