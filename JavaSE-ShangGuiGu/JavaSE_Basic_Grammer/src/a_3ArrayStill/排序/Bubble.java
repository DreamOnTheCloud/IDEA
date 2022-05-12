package ArrayStill.排序;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] a = new int[]{12,56,98,4,-8,5,98,4,65,45,45,4,48,4,-88,5};

        //循环轮数默认少一次,因为最后的一个值肯定是最小的无需比较
        for (int i = 1; i < a.length ; i++) {

            //一定是从第一个比到最后一个,每轮少一个,减i就是-1,-2,-3...第一次不就取不到到后一个了吗?不不不我们下面下标是加一的
            //每轮下来j都从零开始比,且每轮少比一个,因为一次出一个最大值
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        //对数组a进行排序完成,下面进行二分查找(使用前提就是必须是有序数组)
        //五个变量 : 开头,结尾,中间,判断,目标值
        int dest = 998;
        int head = 0;
        int end = a.length - 1;
        boolean isFlag = true;

        //定义循环条件为找完为止
        while (head <= end){
            int middle = (head + end) / 2; //无线生成中间数,注意中间数其实就是有序数组的下标索引

            if (a[middle] == dest){
                isFlag = false; //找到判断值就不干净了
                System.out.println("找到目标: " + dest + "\n索引为: " + middle); //找到输出中间变量是无限变化的,下标永远是中间
                break;
                //找到退出循环
            }

            //目标大于中间值的话我们向有查找直接将我们的head投下标改到中间 + 1
            else if (dest > a[middle]){
                head = middle + 1;
            }

            //目标值小于中间值得话,我=我们就像左边找,直接将结束标签拉到中间减1
            else {
                end = middle - 1;
            }
        }

        if (isFlag){
            System.out.println("抱歉未找到");
        }
    }
}