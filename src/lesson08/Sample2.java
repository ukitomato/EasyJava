package lesson08;
class Car2{
	int num;
	double gas;
	
	void show(){
		System.out.println("車のナンバーは"+num+ "です．");
		System.out.println("ガソリン量は"+gas+"です．");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car2 car1;
		car1=new Car2();
		car1.num=1234;
		car1.gas=20.5;
		car1.show();
		car1.show();
	}

}
