package a_2ProcessControl;

import java.util.Scanner;

public class 循环 {
    /*
        【for循环结构】
        初始化循环变量: 判断是否可以进入循环
        判断循环条件:  是否满足循环条件是否执行循环
        循环体部分:    达成条件执行的代码
        循环迭代部分:   循环变量的变化
        for(初始化循环变量 ; 判断循环条件 ; 循环迭代部分 ){
        循环体部分
        }
  */
    public static void main(String[] args) {
        //循环练习1 2 3执行三次结果为abcbcbc----------------------------------------------------------------------
        int num = 1;
        for (System.out.print("a"); num <= 3; System.out.print("c"),num++){
            System.out.print("b");
        }
        System.out.println();

        //1~150 3的倍数 5的倍数 7的倍数输出其他东西,注意:即是5的倍数又是三的倍数就全部输出,所以不能if else只能if-------------
        for (int i = 1; i <= 150; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0){
                System.out.print("three ");
            }
            if (i % 5 == 0){
                System.out.print("five ");
            }
            if (i % 7 == 0){
                System.out.print("seven");
            }
            System.out.println();
        }

        //输入两数求最大公约数与最小公倍数----------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数: ");
        int num1 = sc.nextInt();
        System.out.println("输入第二个整数: ");
        int num2 = sc.nextInt();
        //最大公约数求法:两数共同最大公约数首先代表两个数都能整除,我们的范围直接定义在最小的数依次向下找即可
        int min = (num1 <= num2) ? num1 : num2;//找到最小值
        for (int i = min ; i >= 1 ; i--){ //循环变量初始化为最小的那个值,条件定位>1因为都不是的话就是1,依次向下减
            if (num1 % i == 0 && num % i == 0){
                System.out.println(num1 + "与" + num2 + "的最大公约数为: " + i);
                break;
            }
        }
        //最新小公倍数
        int max = num2 >= num1 ? num2 : num1;//取出最大作为i的起始值
        for (int i = max ; i <= (num2 * num1) ; i++){ //令i小于等于两数的乘积
            if (i % num1 == 0 && i % num2 == 0){ //i整除两数
                System.out.println(num1 + "与" + num2 + "的最小公倍数为: " + i);
                break;
            }
        }

        //水仙花------------------------------------------------------------------------------------------------
        for (int i = 0 ; i < 1000 ; i++) {
            if ((Math.pow(i / 100 , 3) + Math.pow(i % 10 , 3) + Math.pow(i % 100 / 10 , 3) ) == i) {
                System.out.println(i);
            }
        }

        //从键盘输入不确定的数(死循环首先)-----------------------------------------------------------------------------
        Scanner s = new Scanner(System.in);
        int count = 1;
        for (int i = 0 , j = 0 ; ;){
            System.out.println("输入第" + count + "个数: ");
            int sum = s.nextInt();
            if (sum < 0){
                i ++;
            }else {
                j++;
            }
            if (sum == 0){
                break;
            }
            System.out.println("负数" + i);
            System.out.println("正数" + j);
            count ++;
        }
    }
}
