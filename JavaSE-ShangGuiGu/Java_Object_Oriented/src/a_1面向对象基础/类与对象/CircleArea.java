package a_1面向对象基础.类与对象;

/**
 * 此类用来求圆形面积
 * 属性为radius为圆的半径
 * 方法为求面积
 */
public class CircleArea {
    double radius;

    /**
     * 求圆的面积
     * @return 返回值为面积
     */
    public double pleaseArea(){
        double Area = 3.14 * Math.pow(radius, 2);  //求出圆的面积公式3.14 * 半径的平方
        return Area; //返回面积值
    }

    //main测试本类的方法直接在本类实例化本类的对象
    public static void main(String[] args) {
        //实例化圆类的对象（在堆内存生成空间）
        //将首地址返回给栈内存的引用变量c1与c2
        //c1与c2实在堆内存两片不同的空间,只是类型都是Circle类的
        CircleArea c1 = new CircleArea();
        //设置c1引用变量的半径属性,将c1内存里的radius属性的初始值0.0改为9,在去求面积
        c1.radius = 9;
        System.out.println("半径为9的圆面积为: " + c1.pleaseArea());

        //再次实例化圆类对象(又在堆空间开辟一块区域)
        //将首地址返回给c2
        CircleArea c2 = new CircleArea();
        //设置c2引用变量的半径属性,将堆内存里的radius属性的初始值0.0改为9,在去求面积
        c2.radius = 64;
        System.out.println("半径为64的圆面积为: " + c2.pleaseArea());


        //在实例化一个c3,在堆内存开辟c3
        CircleArea c3 = new CircleArea();
        //设置堆内存里c3区域的radius属性
        c3.radius = 15;
        //求圆形c3的面积
        System.out.println("半径为15的圆面积为: " + c3.pleaseArea());
    }
}














