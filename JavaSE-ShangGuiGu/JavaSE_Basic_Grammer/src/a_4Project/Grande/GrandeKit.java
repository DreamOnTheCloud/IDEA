package a_4Project.Grande;

import java.util.Scanner;

//工具类封装不同的方法,供外部调用
//参数是调用方法时传进去的值,在方法中加工参数
//返回值是方法执行完毕后的结果,我们可以定义变量来接受我们的返回值
public class GrandeKit {
    private static Scanner sc = new Scanner(System.in);

    /**
     * 此方法用于根据学生人数创建一个跟学生人数一样大的数组,并将学生的成绩存进去
     *
     * @return 返回值是一个存满学生成绩的数组
     */
    public static int[] Score() {
        System.out.println("请输入学生人数: "); //导入人数
        int Stu = sc.nextInt();
        int[] arr = new int[Stu]; //动态创建一维数组 , 长度就是学生的人数

        //导入分数并存入数组
        for (int i = 1; i <= arr.length; i++) {  //从一开始的,数组的下标是从零开始的记住的
            System.out.println("请输入第" + i + "个学生的成绩: ");
            int score = sc.nextInt();
            arr[i - 1] = score; //将成绩复制到数组里面(一次排列)
        }
        return arr; //返回数组此时数组里面已经有了值
    }

    /**
     * 该方法用于从一个一维数组中获取最大值，并根据最大值判断每个学生的成绩等级为哪一级
     *
     * @param arr 参数是一个一维数组
     * @return 返回值是最大值
     */
    public static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = max > num ? max : num; //取出最大值
        }
        System.out.println("最高分为: " + max);


        for (int grande : arr) {
            String Grande = grande > (max - 10) ? "A" : grande > (max - 20) ? "B" : grande > (max - 30) ? "C" : "D";
            System.out.println("Score is " + grande + " Grande is " + Grande);
        }
        return 0;
    }
}
