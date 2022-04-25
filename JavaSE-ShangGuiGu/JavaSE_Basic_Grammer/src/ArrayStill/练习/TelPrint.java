package ArrayStill.练习;

import java.util.Scanner;

public class TelPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**【第一题】电话号码为 */
        //arr存放在栈里放连续空间的首地址,堆内存存具体值{1,5,4,8,7,9,0,3,2,8},通过索引控制
        int[] arr = new int[]{1, 5, 4, 8, 7, 9, 0, 3, 2, 8};
        int[] index = new int[]{0,1,1,6,7,6,4,8,8,9,1};
        String tel = "";//存在常量池里的字符串
        for (int i = 0; i < index.length; i++) {
            //index数组值作为arr数组的角标
            tel += arr[index[i]]; //将数组index的依次元素作为数组数组arr的下标,最后具体的值赋给tel
        }
        System.out.println(tel);

        /**【第二题】打印最高分并判断等级*/
        //录入学生-------------------------------------------------------------------------------------------------------
        System.out.println("请输入学生人数: ");
        int Stu = sc.nextInt(); // 学生人数
        int[] score = new int[Stu]; //学生人数作为数组长度,动态初始化数组
        int max = score[0];//存最大的成绩
        for (int i = 1 ; i <= score.length ; i++){
            System.out.println("请输入第" + i + "个学生的分数: "); //输入学生的分数
            score[i - 1] = sc.nextInt(); //将每个分数赋值到数组里,i的值是从1开始 下标索引从0开始 所以起始值是i - 1 = 0
            max = max < score[i - 1] ? score[i - 1] : max; //赋值完事后直接找最大,每轮一次
        }
        System.out.println("最高分为:" + max);

        for (int gran : score){ //判断每个分数的等级
            String Grande = gran > (max - 10) ? "A级" : gran > (max - 20) ? "B级" : gran > (max - 30) ? "C级" : "D级";
            System.out.println("Score is: " + gran + "Grande is: " + Grande);
        }
    }
}
