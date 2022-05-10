package a_1面向对象基础.类与对象;

public class CarTest {

    public static void main(String[] args) {
        //①实例化两个汽车类对象c1,c2
        Car c1 = new Car();
        Car c2 = new Car();
        //②通过（对象名.属性）的方式来修改汽车类对象c1的颜色为蓝色（初始值为red）
        c1.color = "blue";
        //③两个对象都调用了类的展示方法
        c1.showCar();
        c2.showCar();
    }
}

class Car{
    //①声明汽车类,属性设置了初始化值
    String color = "red";
    int num = 4 ;

    //②展示汽车方法
    public void showCar(){
        int a = 10;
        System.out.println("color: " + color + "  number: " + num);
    }
}