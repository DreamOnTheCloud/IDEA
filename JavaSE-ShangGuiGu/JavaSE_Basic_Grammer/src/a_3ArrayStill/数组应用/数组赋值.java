package a_3ArrayStill.数组应用;

import java.util.Arrays;

public class 数组赋值 {
}

class ArraySum {
    public static void main(String[] args) {
        int[] score = new int[10];
        int max = score[0];//最大值
        int sum = 0;//和
        int min = 100;//最小值
        for (int i = 0; i < score.length; i++) { //循环数组
            score[i] = (int) (Math.random() * 90) + 10; //生成10到100之间随机数赋值给数组
            sum += score[i]; //累加求和
            if (score[i] > max) { //最大
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
            System.out.print(score[i] + " " + "\n");
        }
        System.out.println("总分数为: " + sum);
        System.out.println("最高分为: " + max);
        System.out.println("最低分为: " + min);
        System.out.println("平均分为: " + sum / score.length);
    }
}

class ArrayCopy {

    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] += array1[i];  //复制数组1 到数组2里
        }
        System.out.println(Arrays.toString(array2));
    }
}

class reverse {

    public static void main(String[] args) {
        String[] str = new String[]{"一", "二", "三"}; //在堆内存开辟一块连续的空间,数组名存的只是空间的首地址,首地址加索引拿到元素
        //数组反转,就是倒着打印而已
        for (int i = str.length - 1; i >= 0; i--) {  //从数组最后一个索引位置开始length - 1 , 使其大于等于零(取到第一个0索引)
            System.out.print(str[i]);
        }
    }
}

class 二维数组转置 {

    public static void main(String[] args) {
        //二维数组反转
        int[][] num = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = num.length - 1; i >= 0; i--) { //外层递减,从最后一个外部一维数组开始
            for (int j = num[i].length - 1; j >= 0; j--) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}








