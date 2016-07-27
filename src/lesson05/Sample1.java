package lesson05;

import java.io.*;
public class Sample1 {

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力して下さい");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		if(res == 1)
			System.out.println("1が入力されました．");
		
		System.out.println("処理を終了します");

	}

}
