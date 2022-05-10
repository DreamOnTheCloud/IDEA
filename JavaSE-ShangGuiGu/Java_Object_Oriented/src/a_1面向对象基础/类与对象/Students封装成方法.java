package a_1面向对象基础.类与对象;

/**
      ①创造类,设计类的属性与方法
      ②写测试类(main方法),实例化对象或者是对象数组
      ③定义各种需要的方法封装调用即可
      ④调用各种方法达到目的
 */

public class Students封装成方法 {

    public static void main(String[] args) {  //创建测试类
        //创建Stu类型的对象数组,再堆内存开辟了20个连续的空间用来存放Stu类型的对象
        Stu[] s1 = new Stu[20];

        for (int i = 0; i < s1.length; i++) {
            //循环为每个Stu类型的数组赋值,值为对象类型,每个元素都有自己的属性,方法
            s1[i] = new Stu();
            s1[i].number = i + 1; //为每个对象数组赋值
            s1[i].score = (int)(Math.random() * (100 - 20 + 1) + 20);
            s1[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
        }

        //调用打印输出全部对象方法
        Students封装成方法 c = new Students封装成方法(); //实例化本类的对象,调用本类的方法
        c.print(s1);
        System.out.println("******************************************");
        c.searchByState(s1,6);
        System.out.println("******************************************");
        c.bubble(s1);
        c.print(s1);

    }

    /**
     * 遍历Stu类型数组
     * @param s1  参数为数组,功能: 遍历
     */
    public void print(Stu[] s1){
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i].info());
        }
    }


    /**
     * 根据年级查找学生(打印的学生为对少年级的)
     * @param s1 参数Stu类型数组
     * @param state 参数为要查找的年级
     */
    public void searchByState(Stu[] s1, int state){
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].state == state){
                System.out.println(s1[i].info());
            }
        }
    }

    /**
     * 冒泡排序根据成绩排序
     * @param s1 参数为学生类型的数组
     */
    public void bubble(Stu[] s1){
        for (int i = 1; i < s1.length; i++) {  //外层循环的是总轮数
            for (int j = 0; j < s1.length - i; j++) {  //内层循环的是每轮比较的次数(每轮少一个)
                if (s1[j].score > s1[j + 1].score){
                    Stu temp = s1[j];
                    s1[j] = s1[j + 1];
                    s1[j + 1] = temp;
                }
            }
        }
    }
}



class Stu{  //创建Stu类,学生类

    //类的属性,实例化对象后就是具体对象的属性
    int number;
    int state;
    int score;

    //类的方法只要是本类的对象都能用
    public String info(){
        return "学号" + number + "\t年级" + state + "\t成绩" + score;
    }
}