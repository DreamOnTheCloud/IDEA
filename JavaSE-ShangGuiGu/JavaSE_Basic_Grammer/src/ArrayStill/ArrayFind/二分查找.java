package ArrayStill.ArrayFind;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 二分查找 {

    public static void main(String[] args) {
        //核心就是对半砍,砍出来的结果,条件就是数组必须有序,否则不行
        int[] nums = new int[]{78,45,-45,88,-95,-43,1,66,-250,-6,45,125,786};
        //对数组排序,无序数组无法二分
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //定义要找的目标值
        int dest = -250;
        //定义出头值
        int head = 0;
        //当以最终的值用来结束
        int end = nums.length - 1;
        //定义是否找到的判断变量
        boolean isFlag = true;

        while (head <= end){   //进入循环条件为开头不大于最后
            //核心中间索引值
            int middle = (head + end) / 2;

            //第一种情况: 找到目标位置
            if (nums[middle] == dest){
                System.out.println("找到目标位置 " + dest + "\n索引值为: " + middle);
                isFlag = false; //开关为false
                break;
            }

            //第二种情况: 目标值小于中间位置的值(在中间数轴的左测)
            else if (dest < nums[middle]){
                end = middle - 1; //直接砍一半砍末尾,砍完重新定义中间值
            }

            //第三种情况: 目标值大于中间位置的值(在中间数轴的右侧)
            else {
                head = middle + 1; //直接前面砍一半接着循环
            }
        }

        if (isFlag){
            System.out.println("没有目标位置索引");
        }
    }
}
