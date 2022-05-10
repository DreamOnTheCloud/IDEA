package a_1面向对象基础.类与对象;

/**
 * ①创建类,设计类的成员(成员包含属性与方法)
 * ②实例化类的对象Person 对象引用 = new Person(); 新的Person
 * ③通过 “引用.属性” “引用.方法” 来调用"对象"的结构
 *
 * Ⅳ类的设计 + 对象的创建以及功能的调用 = 面向对象落地的实现
 */
public class OnePersonTest {

    public static void main(String[] args) {
        //创建一个类的对象(具体的人),p1引用汽车的地址。通过地址调用方法和属性
        Person1 p1 = new Person1();

        //操作属性 ————> 赋值与调用
        p1.name = "张三";
        p1.age = 22;
        p1.isMale = true;

        //调用类的方法,最后一个是有参数的方法
        p1.eat();
        p1.sleep();
        p1.talk("汉语");
        p1.disPlay();

        //利用构造方法创建第二个对象,在堆内存开辟第二个空间,将地址返回给p2
        Person1 p2 = new Person1("李四", 30, false);

    }
}

/**
 * 创建人类含有三个属性三个方法
 * 类创造好了就像是汽车的图纸,我们要让类变得有意义的话就必须创造出来实实在在的汽车
 */
class Person1{
    //属性(成员变量)
    String name;
    int age = 1; //属性直接再类里定义
    boolean isMale; //是否男性

    //无参构造方法
    public Person1(){

    }
    //三参构造方法，用于快速创建对象的属性
    public Person1(String name , int age , boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    //方法
    public void eat(){  //吃的方法
        System.out.println("人类会吃饭");
    }

    public void sleep(){ //睡觉方法
        System.out.println("人类会睡觉");
    }

    public void talk(String language){  //带参数的方法,方法里定义参数的使用(参数变量属于局部变量)
        System.out.println("人类会说" + language);
    }

    public void disPlay(){
        System.out.println(name + "\n" + age + "\n" + isMale);
    }

}