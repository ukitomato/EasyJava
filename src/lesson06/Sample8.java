package lesson06;

public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean bl = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(bl == false){
					System.out.print("*");
					bl = true;
				}
				else{
					System.out.print("-");
					bl = false;
				}
			}
			System.out.print("\n");
		}

	}

}
