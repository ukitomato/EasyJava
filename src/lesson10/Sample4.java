package lesson10;

import java.io.*;
class Sample4 {
    public static void main(String []args)throws IOException
    {
        System.out.println("文字列を入力してください");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();
        System.out.println("追加する文字列を入力してください");
        String str2=br.readLine();
        StringBuilder ss =new StringBuilder(str1);
        ss.append(str2);
        System.out.println(str1+"に"+str2+"を追加すると"+ss+"です");
    }
}
