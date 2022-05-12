package 面向对象基础.类与对象;

public class Teachers_Students {
    public static void main(String[] args) {
        //教师类测试
        Teachers t1 = new Teachers("张宇", 21, "语文"); //通过构造器赋值
        t1.say();

        //学生类测试
        Students s1 = new Students("马雨涵", 20, "英语", "跆拳道");
        System.out.println(s1.say());
    }

}

class Teachers{
    private String name;
    private int age;
    private String course; //课程

    //三参构造器
    public Teachers(String n, int a, String c){
        //构造器就像是在为属性赋值
        //实例化本类对象时直接使用构造方法初始化个属性的值,下面在用
        this.name = n;
        this.age = a;
        this.course = c;
    }
    public void say(){
        System.out.println("我是教师" + name + "\n今年" + age + "\n本学期课程为" + course);
    }
}

class Students{
    String name;
    int age;
    String major;
    String interests;

    //构造方法
    public Students(String name, int age, String major, String interests){
        this.name = name;
        this.age = age;
        this.major = major;
        this.interests = interests;
    }
    public String say(){
        return "我是学生" + name + "\n今年" + age + "\n主修" + major + "\n兴趣" + interests;
    }
}