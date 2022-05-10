package a_4Project.Method.FamilyAccountProject;

import java.util.Scanner;

/*
    【工具类】
        将不同的方法封装为类,直接通过调用使用其方法,无需考虑具体的实现细节
 */
public class Utility {
    private static Scanner sc = new Scanner(System.in);

    /**
     * 【1】弹出菜单供用户选择
     */
    public static void menu(){
        System.out.println("---------------简单记账软件---------------");
        System.out.println("\t\t\t\t1收入明细");
        System.out.println("\t\t\t\t2登记收入");
        System.out.println("\t\t\t\t3登记支出");
        System.out.println("\t\t\t\t4退   出");
        System.out.print("\t\t\t\t请选择(1~4):");
    }

    /**
     * 【2】用于菜单界面的选择,从键盘读取一个整形变量判断用户想做出的选择
     * @return 返回值就是我们输入的变量
     */
    public static int readMenu() {
        int choose;
        for (; ;){  //死循环用户输入正确退出
            choose = sc.nextInt();
            if (choose < 0 && choose > 5){
                System.out.println("输入有误,请重新输入: ");
            }else break;
        }
        return choose;
    }

    /**
     * 用于收入与支出的金额输入,并将其作为返回值
     * @return 输入的金钱数量
     */
    public static double readNumber(){
        int n = 0;
        for (; ;){
            n = sc.nextInt();
            if (n < 0 && n > 100000){
                System.out.println("输入有误:");
            }else{
                break;
            }
        }
        return n;
    }

    /**
     * 用于收入与支出的描述,返回值为描述本身
     * @return
     */
    public static String readString(){
        String str = sc.next();
        return str;
    }

    /**
     * 确认退出方法,选择'Y' or 'N'退出
     * @return 是否退出
     */
    public static char readExit(){
        char c;
        for (; ;){
            System.out.println("确认是否退出('Y' or 'N')");
             c = sc.next().charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else {
                System.out.println("输入有误,请重新输入: ");
            }
        }
        return c;  //返回值为c
    }
}



































