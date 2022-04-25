package java.test;

public class WhileTest {
    public static void main(String[] args) {
        //定义两个整数形的变量并将它们的初始值设为0
        int a = 0;
        int b = 0;
        while (a < 20) {  //定义一个while循环,循环的前提条件为 a的值小于20(不包含20)
            a++;         //a++循环体每执行一次a自加1  a的值为 1 2 3 4 5 6...19   a为20的时候会跳出循环
            b += a;      //b初始值为0, 第一次循环 b 的值为 (b = 0) + (a = 1) = 1 , 第二次 b 的值为 1 + 2  , 第三次 2 + 3.....
            System.out.println("第" + a + "次b的值为" + b);
        }
    }
}
