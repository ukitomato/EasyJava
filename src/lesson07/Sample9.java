package lesson07;

import java.io.*;

public class Sample9 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int[] test = new int[5];
		System.out.println(test.length+"人の点数を入力してください．");
		
		for(int i=0; i<test.length; i++){
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int s=0; s<test.length-1; s++){
			for(int t=s+1; t<test.length; t++){
				if(test[t] > test[s]){
					int tmp = test[t];
					test[s] = tmp;
					
				}
			}
		}
		for(int j=0; j<test.length; j++){
			System.out.println((j+1)+"番目の人の点数は"+test[j]+"です");
		}
		

	}

}
