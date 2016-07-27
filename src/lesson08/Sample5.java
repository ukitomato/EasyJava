package lesson08;

class Car5{
	int num;
	double gas;
	
	void setNumGas(int n, double g){
		num=n;
		gas=g;
		System.out.println("車のナンバーを"+num+"にガソリン量を"+gas+"しました．");
	}
}
public class Sample5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car5 car1=new Car5();
		
		int number =1234;
		double gasoline=20.5;
		
		car1.setNumGas(number, gasoline);
	}

}
