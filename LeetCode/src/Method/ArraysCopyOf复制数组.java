package Method;

import java.util.Arrays;

public class ArraysCopyOf复制数组 {
    public static void main(String[] args) {
        /*
              Arrays.copyOf(要复制的数组 , 本数组长度) 目标数组值 = 原数组的值,定义目标数组长度
              System.arraycopy(要复制的数组,从数组的哪里开始复制,目的数组,目的数组放置的起始位置索引,复制的长度)
         */
        String a[] = {"张宇", "马雨涵"};
        String b[] = Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(b));

        //数组c = (要复制数组b , 从数组b的第0个索引位置开始复制 , 复制到arr3 , 从数组arr3的第2个索引位置开始放 , 复制数组b从开始到后面2个的索引值)
        String arr3[] = new String[10];
        System.arraycopy(b , 0 , arr3 , 2 , 2);
        System.out.println(Arrays.toString(arr3));
    }
}
