package a_2ProcessControl;

import java.util.Arrays;
import java.util.Scanner;

public class Switch应用 {
    /*
    * 根据Switch表达式中的值,依次匹配各个case中的常量.一旦匹配成功,则进入相应的case结构中调用其执行语句.
    * 当调用完匹配的case语句之后,程序会继续向下执行剩余的case结构中的的语句,直到遇到(break)关键字打断或执行到switch语句结尾
    * default就是switch中的备胎,所有的case都匹配不上时执行default结构
    */
    public static void main(String[] args) {
        //【1将小写的char转为大写的char只针对a,b其余的直接other】----------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符(a,b)中的其中一个");
        String testLowerCase = sc.next(); //输入一个字符串类型的testLowerCase
        char lastLowerCase = testLowerCase.charAt(0); //只拿到字符串里的下标第一个并赋值给char类型的lastLowerCase
        switch (lastLowerCase){ //switch用来接收lastLowerCase的值,下面的case进行匹配
            case 'a':
                lastLowerCase = 'A';
                break;
            case 'b':
                lastLowerCase = 'B';
                break;
            default:
                System.out.println("Other");
        }
        System.out.println(lastLowerCase);

        //【2判断成绩>=60及格 否则不及格 注意(成绩在1~100之间)】------------------------------------------------------------
        System.out.println("输入成绩:");
        int score = sc.nextInt();
        if (score <= 100 && score >= 0){
            switch (score / 10){ //让成绩÷10的话直接取到十位
                //多个case执行语句相同的话,可以合并
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("及格");
                    break;
                    //匹配不上用备胎
                default:
                    System.out.println("不及格");
            }
        }else {
            System.out.println("未知的成绩");
        }
//        最优方案
//        switch (score/60){
//            case 0:
//                System.out.println("不及格");
//            case 1:
//                System.out.println("及格");
//        }

        //【3输入月份输入天数判断是今年的第几天】----------------------------------------------------------------------------
        //(1)输入月与天
        System.out.println("Please input the year:");
        int year = sc.nextInt();
        System.out.println("Please input the month:");
        int month = sc.nextInt();
        System.out.println("Please input the day:");
        int day = sc.nextInt();
        //(2)定义累加变量来储存天数,注意全程没有break,不会中断的,本案例充分的利用了switch的不用break累加和
        //(本体核心)switch 程序找到一个接口之后若没有break的话会向下穿透依次执行
        int sumDay = 0;
        switch (month){
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                //判断是否为闰年
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    sumDay += 29;
                }else {
                    sumDay += 28;
                }
            case 2:
                sumDay += 31; //上面一直向下穿透(累加)直到程序结尾
            case 1:
                sumDay += day; //最后再加上用户输入的day天数
        }
        System.out.println(year + "年的第" + month + "月" + day + "日是今年的第" + sumDay + "天");

        //【4】分数累加奖励,向数组里面存值依次存值
        System.out.println("请输入您的分数:");
        int score2 = sc.nextInt();
        String award[] = new String[10];
        int i = 0;
        switch (score2 / 10){
            case 10:
                award[i] = "BWM";
                i++;
            case 9:
                award[i] = "10w";
                i++;
            case 8:
                award[i] = "旅游";
                i++;
            case 7:
                award[i] = "球鞋";
                i++;
            case 6:
                award[i] = "电影票";
                i++;
            case 5:
                award[i] = "球鞋";
                i++;
            case 4:
                award[i] = "帽子";
                i++;
            case 3:
                award[i] = "滑板";
                i++;
            case 2:
                award[i] = "鱼竿";
                i++;
            case 1:
                award[i] = "小吃";
                i++;
        }
        System.out.println(Arrays.toString(award));
    }
}
