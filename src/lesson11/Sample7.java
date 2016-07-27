package lesson11;

import java.nio.file.NotLinkException;
import java.util.PropertyPermission;
import java.util.StringJoiner;

class Car7 {
    protected int num;
    protected double gas;

    public Car7() {
        num=0;
        gas=0.0;
        System.out.println("車を作成しました");
    }

    public void setCar8(int n, double g) {
        num = n;
        gas=g;
        System.out.println("ナンバーを"+num+"ガソリン量を" +gas+" にしました");
    }
    public String toString() {
        String str ="ナンバーは:"+num+"ガソリン量:"+gas;
        return str;
    }
}
class Sample7 {
    public static void main(String[] args) {
        Car7 car1=new Car7();
        car1.setCar8(1234,20.5);

        System.out.println(car1);
    }
}
