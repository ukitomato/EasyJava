package lesson10;

/**
 * Created by Yuki on 2016/07/14.
 */
public class Sample1 {
    public static void main(String []args)
    {
        String str = "Hello";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

        int len = str.length();

        System.out.println(str+"の一番目の文字は"+ch1+"です。");
        System.out.println(str+"の二番目の文字は"+ch2+"です。");
        System.out.println(str+"の長さは"+len+"です。");
    }

}
