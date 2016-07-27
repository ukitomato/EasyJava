package lesson03;

import java.io.*;
public class Sample4 {

	public static void main(String[] args) throws IOException 
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字列を入力して下さい．");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str + "が入力されました．");
		

	}

}
