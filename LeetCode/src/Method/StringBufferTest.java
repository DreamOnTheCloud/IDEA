package Method;

import java.util.Scanner;

public class StringBufferTest {
    /*
         【1】初始化:StringBuffer 对象名 = new StringButter();
             默认长度为16,也可以直接在后面括号里写长度,或者直接初始化赋值,长度为赋值的长度 + 16
         【2】StringButter对象.append(String str); 向对象里追加字符串方法
         【3】StringBuffer对象.setCharAt(int index, char ch); 修改值前面参数为字符串的索引位置,后面是要改变的值
                StringBuffer sb = new StringBuffer("hello");
                sb.setCharAt(1,'E');
                System.out.println(sb);    // 输出：hEllo
         【5】StringBuffer对象.reverse();反转字符串
         【6】StringBuffer对象.deleteCharAt(int index);
                deleteCharAt() 作用是删除指定位置的字符，然后将剩余的内容形成一个新的字符串：
                StringBuffer sb = new StringBuffer("She");
                sb.deleteCharAt(2);
                System.out.println(sb);    // 输出：Sh返回删除后的字符串`
         【7】StringBuffer 对象.delete(int start,int end);
                start开头索引(包含),end结束索引值（不包含）删除指定区域以内的所有字符例如：
                StringBuffer sb = new StringBuffer("hello jack");
                sb.delete(2,5);
                System.out.println(sb);    // 输出：he jack
                sb.delete(2,5);
                System.out.println(sb);    // 输出：heck
*/
    public static void main(String[] args) {
        //追加----------------------------------------------------------------------------------
        StringBuffer str1 = new StringBuffer("张宇"); //长度为 16 + 2 = 18
        String str2 = "马雨涵";
        str1.append(str2);
        System.out.println("追加后的结果:\t" + str1); //追加,参数为一个字符串

        //修改
        str1.setCharAt(1,'鱼');
        System.out.println("修改后的结果:\t" + str1);

        //删除
        str1.delete(1 , 3);
        System.out.println("删除后的结果:\t" + str1);

        str1.deleteCharAt(0);
        System.out.println("删除后的结果:\t" + str1);

        //反转后的结果
        str1.reverse();
        System.out.println("反转后的结果:\t" + str1);

    }
}

