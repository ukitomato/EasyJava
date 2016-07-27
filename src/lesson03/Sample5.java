package lesson03;

import java.io.*;
public class Sample5 {

	public static void main(String[] args) throws IOException 
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力して下さい．");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println(num + "が入力されました");
		

	}

}
