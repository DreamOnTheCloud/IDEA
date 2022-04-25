package ArrayStill.练习;

import java.util.Scanner;

public class YanghuiTriangle {

    public static void main(String[] args) {
        //动态声明二维数组,并给外部开辟的空间定义长度为10,里面目前存的是空引用
        int[][] triangle = new int[10][];

        for (int i = 0 ; i < triangle.length ; i ++){ //循环外部空间,也就是循环空引用
            triangle[i] = new int[i + 1]; //为每次的外部空间开辟内部空间,内部空间大小为递增

            for (int j = 0 ; j <= i; j++){
                if(j == 0 || j == i){
                    triangle[i][j] = 1; //每一行的第一列和最后一列都等于1
                }else{
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1]; //中间数赋值
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}