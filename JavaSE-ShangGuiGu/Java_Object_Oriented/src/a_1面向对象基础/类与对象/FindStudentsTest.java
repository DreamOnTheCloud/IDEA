package a_1面向对象基础.类与对象;

public class FindStudentsTest {
    //学生类测试类
    public static void main(String[] args) {

        //生成学生类数组长度为20
        //在堆内存开辟了20快连续空间用来存放Students1类型的对象,首地址值返回给stu
        //通过首地址加索引的格式来为每个空间创建Students对象,再调用每个对象的属性与方法
        Students1[] stu = new Students1[20];


        for (int i = 0; i < stu.length; i++){
            //实例化20个Students1类型的对象,stu[i]表示选中选择从0 ~ 数组长度(全部空间)
            //选中后 = new Students1(); 为每个空间在new出来一个Students类型对象
            stu[i] = new Students1();

            stu[i].number = i + 1; //设置对象的number学号属性从一开始到最后一个对象
            stu[i].state = (int) (Math.random() * (6 - 1 + 1) + 1); //为每个对象的年级属性随机赋值
            stu[i].score = (int) (Math.random() * (100 - 20 + 1) + 20); //为每个对象的成绩属性赋值
            //打印所有学生与学生信息,一次循环打印一个
            System.out.println(stu[i].info());
        }

        System.out.println("******************************************************************************************");

        //打印三年级学生
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].state == 3) {
                System.out.println(stu[i].info());
            }
        }


        System.out.println("******************************************************************************************");

        //排序
        for (int i = 1; i < stu.length; i++) {
            for (int j = 0; j < stu.length - i; j++) {
                if (stu[j].score > stu[j + 1].score){
                    Students1 temp = stu[j];//交换的是地址而不是分数老弟,什么类型的用什么类型来接收
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }

        //排序完毕输出值
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].info());
        }
    }
}


//创建学生类
class Students1{
    int number; //学号
    int state;  //年级
    int score;  //成绩

    public String info(){
        //在本类调用属性并输出
        return "学号" + number + "\t年级" + state + "\t成绩" + score;
    }

}