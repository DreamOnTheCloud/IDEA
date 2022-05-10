package a_1面向对象基础.类与对象;

/**
    【方法】
        描述该类所具有的功能,比如Scanner的nextInt()、Math里的sqrt、Arrays里的sort等等

    【方法举例】
         public void eat(){}
         public void sleep(int hour){}
         public String getName(){}
         public String getNation(String nation){}

    【方法声明】

         权限修饰符 + 返回值 + 方法名(形参列表){
             方法体
        }

    【类里的方法可以用本类里的属性,哪怕是private】
 */
public class Method {


    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "张宇"; //设置属性name
        u1.eat();
        u1.sleep(8); //传进去参数
        System.out.println(u1.getName());//获取姓名方法,返回姓名
        System.out.println(u1.getNation("中国"));//获取国家字符串类型参数,返回所属国家
    }
}

class User{
    String name;
    int age;
    boolean isNan;

    /**
     * 吃方法:无返回值无参数
     */
    public void eat(){
        System.out.println("客户吃东西");
    }

    /**
     * 睡方法:无返回值有参数
     * @param hour 参数睡了几个小时,调用时传值进去
     */
    public void sleep(int hour){
        System.out.println("客户每天睡" + hour + "小时");
    }

    /**
     * 获取姓名属性方法:有返回值无参数
     * @return 该方法的返回值为字符串类型的,表示方法执行完毕有结果的,返回属性name的值
     */
    public String getName(){
        return name;
    }

    /**
     * 有返回值有参数方法
     * @param nation 参数为国际
     * @return 返回客户来自那个国家
     */
    public String getNation(String nation){
        return "我来自" + nation;
    }
}