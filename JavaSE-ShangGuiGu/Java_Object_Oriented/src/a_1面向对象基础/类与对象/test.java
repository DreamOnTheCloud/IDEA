package a_1面向对象基础.类与对象;

public class test {
    //或者直接在类里定义好半径为类属性,再将方法该为不带参数的方法直接用类属性的半径去求圆的面积
    //double radius = 5;
    //同类里的成员变量,所有方法都可用哪怕是私有的,私有的就是针对本类的
    /**
     * 求圆面积
     * @param radius  半径
     * @return  面积
     */
    private double findArea(double radius){
        double Area = 3.14 * Math.pow(radius, 2);  //元的面积平方公式,求出来圆的面积并赋值给Area
        return Area;  //求出来在返回圆的面积
    }

    //在一个类里面又有测试类(主方法)  又有其他方法,并且其他方法还不是静态的玩法
    public static void main(String[] args) {

        //实例化类的对象,堆空间开辟一块空间首地址值不返回给引用变量
        //直接引用类的方法,并传递进去参数
        System.out.println(new test().findArea(9));
    }
}
