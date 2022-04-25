package ArrayStill.概念;

import java.sql.SQLOutput;

public class 二维数组初始化与内存 {
    public static void main(String[] args) {
        /**解析二维数组初始值*/
        //动态创建整形二维数组number,外层长度为2,内层为3
        int[][] number = new int[2][3];
        System.out.println(number);   //数组名存外层开辟的那块连续空间的首地址
        System.out.println(number[0]);//数组名加索引拿到元素(此时的元素里存的还是一维数组)所以存每个内层一维数组所对应的首地址
        System.out.println(number[0][1]);//数组名(首地址)加索引拿到外层一维数组(存内层首地址),在加索引拿到元素
        System.out.println("*********************************************************************************");

        //创建字符串类型二维数组string,外层长度为2,内层长度为2
        String[][] string = new String[2][2];
        System.out.println(string); //打印指向外层连续空间的首地址
        System.out.println(string[1]); //打印指向内层连续空间的某个首地址
        System.out.println(string[0][1]);//打印元素

        //动态创建二维数据
        int[][] arr = new int[2][];
        System.out.println(arr[0]); // null只开辟了外层没赋值
    }
}
