package lesson08;

class Car1{
	int num;
	double gas;
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car1 car1;
		car1=new Car1();
		
		car1.num=1234;
		car1.gas=20.5;
		
		System.out.println("車のナンバーは"+car1.num+"です．");
		System.out.println("ガソリン量は"+car1.gas+"です．");
	}

}
