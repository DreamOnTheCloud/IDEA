package BasicGrammer;

/*
* 【输入三部曲】
*       导包          :import java.util.Scanner;
*       实例化对象     :Scanner 对象名 = new Scanner(System.in); 对象的名
*       接收指定类型的值:对象名.nextXXX();调用方法,获取输入的值后赋值给某个变量接收
*
* */
import java.util.Scanner;
public class Scanner应用 {
    public static void main(String[] args) {
        //【1马雨涵的信息】----------------------------------------------------------------------------------
        char a = '\n';//定义转移字符(换行在下面用)
        Scanner information = new Scanner(System.in); //实例化Scanner类型的对象information
        System.out.println("请输入姓名:");
        String name = information.next(); //接收字符串类型的只有两个方法next与nextLine 区别:nextLine接收空格与回车
        System.out.println("请输入性别(男/女):");
        String sexTemp = information.next();
        char sex = sexTemp.charAt(0);//获取字符串的第一个值,并赋值给sex
        System.out.println("请输入年龄:");
        int age = information.nextInt();
        System.out.println("请输入体重:");
        double weight = information.nextDouble();
        System.out.println("你是否看上我了(true/false)?");
        boolean isLove = information.nextBoolean();
        System.out.println("姓名:" + name + a + "性别:" + sex + a + "年龄:" + age + a + "体重" + weight + a + "feel:" + isLove + a);
    }
}
