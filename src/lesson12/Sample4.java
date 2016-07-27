package lesson12;

import com.sun.scenario.effect.GaussianShadow;

import java.util.NavigableMap;

interface iVehicle4 {
    void vShow();
}

interface iMaterial {
    void mShow();
}

class Car4 implements iVehicle4, iMaterial {
    private int num;
    private double gas;

    public Car4(int n, double g) {
        num=n;
        gas =g;
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
    }

    @Override
    public void vShow() {
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリン量は"+gas+"です");
    }

    @Override
    public void mShow() {
        System.out.println("車の材質は鉄です");
    }
}
class Sample4 {
    public static void main(String[] args) {
        Car4 car1=new Car4(1234,20.5);
        car1.vShow();
        car1.mShow();
    }
}
