package BasicGrammer;
/*
        Java程序运行:
          【1】Java程序 编写 --> 编译 -->运行过程
                编写:将代码保存在.java结尾的原文件中
                编译:使用javac命令编译我们的源文件,编译完成后生成.class字节码文件
                运行:使用java命令解释运行我们的字节码文件
              ⭐注意:一个源文件中有几个类编译后就会有几个字节码文件
          【2】在一个java源文件中可以有多个class类,但只能有一个public的类,并且此类必须与文件名相同
          【3】main方法为程序的入口格式固定
          【4】应用程序 = 数据结构 + 算法  数据结构用来存值,算法出功能
          【5】面向对象编程
                两大要素:类与对象
                三大特征:封装,继承,多态

        【变量】
           在内存申请一块空间,用来存值。就像开房房子大小就是类型,房号就是变量名(不可重复),里面的人就是变量值
           变量类型  变量名 = 变量值
        【变量作用域】
           局部变量:同一作用域下不可有两个同名的变量局部变量必须先赋值再用,否则编译错误,方法体内
           成员变量:类体内方法体外
        【数据类型】
           整形:Byte(1字节) < short(2字节) < int(4字节) < long(8字节)
           浮点型: (4字节) < double(8字节)
           字符/字符串:char(2字节) / String
           数组:Array  接口:Interface  类:Class
*/
public class 变量与转换 {
    public static void main(String[] args) {
        //1【浮点型变量】默认类型为double-----------------------------------------------
        double d1 = 133.3;
        System.out.println(d1 + 1);
        float f1 = 133.3f;//定义float类型时尾部加f
        System.out.println(f1 + 1);
        //2【字符型变量】只能存一个字符--------------------------------------------------
        /*计算机底层全是二进制流,通过字符集将底层二进制与其所对应的具体值映射出来,
        *每个国家都有属于自己的字符集character,所以同样的二进制数字会被解析为不同的内容(乱码)
        *后来通过UTF-8得到了统一*/
        char c1 = 'a';
        c1 = 'A';
        char c2 = '\n';//转义字符
        System.out.println(c1);
        System.out.println((int)c1); //字符型强制转为int型
        /*3【布尔型变量】用于做判断,只有true与false两个值-----------------------------------------------------*/
        Boolean isChild = true; //判断是否为孩子
        if (isChild){
            System.out.println("\"未成年\"");//isChild为true的话则输出
        }else {
            System.out.println("\"已成年\"");//isChild为false的话输出
        }

        /*【自动类型提升】
              容量小的数据类型与容量大的数据类型做运算时,结果自动提升为容量最大的数据类型
              Byte,char,short做运算时结果必须用int接收
          【强制类型转换】
              大类型转为小类型需要强制转换,要转为什么直接加 "(要转为的类型)值"
              */
//        int i1 = 12;
//        Byte b1 = 5;
//        Byte b2 = i1 + b1;结果不能用更小的之接收,否则可能会丢失数据
        int i1 = 12;
        byte b1 = 5;
        int b2 = i1 + b1;  //要用大的数据类型接收
        float f2 = i1 + b1;//可以用浮点型接收整形的计算结果,结果自己给补零
        System.out.println(b2);
        System.out.println(f2);

        double d2 = 45.66;
        int i2 = (int)d2;//double强制转为int
        System.out.println(i2);

        long l1 = 123;
        short s1 = (short) l1;//long强制转为short
        System.out.println(s1);

        //【String引用数据类型】 //String能与所有的类型作拼接运算,最后结果都是String类型的
        int number = 1001;
        String id = "学号";
        boolean really = true;
        System.out.println(number + id + really);

        //练习String类型与任何类型作 + 运算皆为拼接,结果为String类型
        char charTest = 'a';
        int intTest = 10;
        String stringTest = "hello";
        System.out.println(charTest + intTest + stringTest);  //结果为107hello
        System.out.println(charTest + stringTest + intTest);  //结果为ahello10
        System.out.println(charTest + (intTest + stringTest));//结果为a10hello
        System.out.println((charTest + intTest) + stringTest);//结果为107hello
        System.out.println(stringTest + intTest + charTest);  //结果为hello10a

        //练习char 与 char做运算默认为加法运算 , 除非中间穿插String
        System.out.println('*' + '\t' + '*'); //结果是数值
        System.out.println('*' + "\t" + '*'); //结果字符串
        System.out.println('*' + '\t' + "*"); //前面为数值

        //练习是否能通过编译
        short sho = 5;
        sho = (short) (sho- 2); //因为2是int型的,大转小必须强制
        System.out.println(sho);

        byte b = 3;
//        b = b + 4; //无法通过编译需将int型的4转为byte型
        b = (byte)(b+4);
    }
}
