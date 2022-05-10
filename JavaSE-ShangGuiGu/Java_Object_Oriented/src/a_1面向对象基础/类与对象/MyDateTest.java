package a_1面向对象基础.类与对象;

//声明日期类Date包含年月日三个属性与一个打印生日的方法
public class MyDateTest {

    //①属性直接再类里创建属性方法构造方法,在本类main方法里面实例化对象也行啊老铁
    String year;
    int month;
    int day;

    //②构造方法
    MyDateTest(String year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * 方法①
     */
    public void printBirthday(){
        if ((day > 0 && day < 32) && (month < 23 && month > 0)){
            System.out.println(year + "--" + month + "--" + day);
        }
    }


    /**
     * main方法区域
     * @param args
     */
    public static void main(String[] args) {
        //实例化了两个MyDateTest类型的对象,对象拥有类的属性与使用类方法的权力
        MyDateTest d1 = new MyDateTest("2001",9,15);
        MyDateTest d2 = new MyDateTest("1998",1,17);
        d1.printBirthday();
        d2.printBirthday();
    }
}
