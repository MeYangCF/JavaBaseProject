package chapter03;

/**
 * 演示字符串转基本数据类型的细节
 */
public class c3_StringToBasicDetail {

    //编写一个main方法
    public static void main(String[] args) {

        String str = "hello";
        //转成int
        int n1 = Integer.parseInt(str);
        System.out.println(n1);
    }
}