package BasicGrammer;

public class MathRandom随机数 {
    public static void main(String[] args) {
        //我们都知道每种语言都有属于自己的随机数,然而Java里面的随机数就是
        //Math.random(); 获取一个 Double类型的随机数从[0.0 , 1.0)左闭右开的一个0.0到1.0的区间
        //然而我们想要自己定义的值并不是他单纯的 [0.0 , 1.0),公式为
        //【公式】 假设我们需要得到整形的[a , b) 那么:(int)(Math.random() * (b - a + 1) + a)
        //【假设】 我们需要 1 到 10 [1 , 10)的区间随机数 那么:(int)(Math.random() * (10 - 1 + 1) + 1)
        int num = (int)(Math.random() * (100 - 10 + 1) + 10);
        //解析:[10 , 100)前面 0 * (100 -10 + 1) + 10 = 10 后面1 * (100 - 10 + 1) + 10 = 101取到100
        System.out.println(num);
    }
}
