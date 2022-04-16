package BasicGrammer;
import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.*;
/*
* 【1】Java程序 编写 --> 编译 -->运行过程
*       编写:将代码保存在.java结尾的原文件中
*       编译:使用javac命令编译我们的源文件,编译完成后生成.class字节码文件
*       运行:使用java命令解释运行我们的字节码文件
*     ⭐注意:一个源文件中有几个类编译后就会有几个字节码文件
* 【2】在一个java源文件中可以有多个class类,但只能有一个public的类,并且此类必须与文件名相同
* 【3】main方法为程序的入口格式固定
* 【4】应用程序 = 数据结构 + 算法  数据结构用来存值,算法出功能
* 【5】面向对象编程
*       两大要素:类与对象
*       三大特征:封装,继承,多态
*/
public class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入家庭住址:");
        String address = sc.next();
        System.out.println("姓名:" + name + "\n年龄:" + age + "\n地址:" + address);

        Variable();

    }
    public static void Variable() {  //静态方法在本类的调用
        System.out.println("as");
    }


    class person{  //第二个类可以有无数个类,但只能有一个public class 与文件同名

    }
}
