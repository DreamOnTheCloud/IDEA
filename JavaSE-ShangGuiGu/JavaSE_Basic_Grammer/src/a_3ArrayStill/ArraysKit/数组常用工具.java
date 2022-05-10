package a_3ArrayStill.ArraysKit;

public class 数组常用工具 {

    /**
     * 【1.equals】方法用于比较两个整形数组是否相等
     * 【2.Arrays.toString(数组名)】就是将一个数组拆分,拼成一个字符串打印出来
     * 【3.Arrays.Fill(数组名 , 替换的值)】 将字符串全体替换为什么
     * 【4.Arrays.Sort(数组名)】 数组排序
     * 【5.Arrays.BinarySearch(数组名,要找的值)】 返回值就是索引位置
     * @param a
     * @param b 参数为两个整形数组
     * @return 返回值boolean类型的,相等true,否则false
     */
    public static boolean equals(int [] a , int [] b){
        if(a == b){
            return true;  //首先走捷径看看地址是否相等,相等的话直接返回true
        }

        if (a == null || b == null){
            return false; //有一个为空返回false
        }

        int len = a.length;
        if (a.length != b.length){
            return false; //长度不同返回false
        }

        //最后比较值
        for (int i = 0 ; i < a.length ; i++){
            if (a[i] == b[i]){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(equals(new int[]{1,2,3,4} , new int[]{1,2,3,4}));
    }
}
