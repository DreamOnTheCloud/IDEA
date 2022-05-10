package 面向对象基础.类与对象;

public class TowPersonTest {
    public static void main(String[] args) {
        //实例化Person2的类的对象,对象存在堆内存默认属性为初始化值需要我们去设置
        //堆内存对象创建完毕后将所在的首地址位置返回给前面的引用变量p1
        //再通过首地址p1.属性/方法去设置属性或调用其方法
        Person2 p1 = new Person2();
        p1.age = 5;   //设置p1的年龄为5
        p1.showAge(); //调用展示年龄方法,输出其年龄
        p1.study();   //调用学习方法使人去学习
        p1.addAge(3); //调用年龄增加方法使年龄增加3岁
        p1.showAge();   //再次显示增加后的年龄

        //实例化第二个人类的对象,此时它的所有属性都为初始值
        //人类p1设置了但是与p2无关,因为人类就像一张应聘模板p1写完了自己的信息(设置属性的过程)
        //但是p2还没有写(暂时还是一张白纸),堆内存有两块人类的空间p1/p2,它们各自的信息不冲突
        Person2 p2 = new Person2();
        p2.addAge(20); //初识年龄都是0,我直接调用p2的增加年龄方法出来就是20岁
        p2.showAge();
        p1.showAge(); //p2增加再多的年龄p1也不会变(同理)

    }
}

class Person2{
    String name;
    int age;
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println(age);
    }

    /**
     * 年龄增加方法
     * @param i 参数为年龄增加的值
     * @return 返回增加后的年龄
     */
    public int addAge(int i){
        age += i;
        return age;
    }
}