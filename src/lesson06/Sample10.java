package lesson06;

import java.io.*;

public class Sample10 {

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("成績を入力して下さい．（１〜5)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res){
		case 1:
			case 2:
				System.out.println("もう少し頑張りましょう");
				break;
			case 3:
			case 4:
				System.out.println("この調子でがんまりましょう");
				break;
			case 5:
				System.out.println("大変優秀です");
				break;
				default:
					System.out.println("1~5までの成績を入力して下さい");
					break;
		}

	}

}
