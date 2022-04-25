package Project.Grande;
//测试类
//何为方法:方法一旦被调用直接顺序执行其中每一项,并将最终结果(返回值)赋值给我自己的变量
//最终结果就是我们所说的返回值
public class GrandeTest {

    public static void main(String[] args) {
        int[] arr = GrandeKit.Score(); //执行完方法并获取数组
        GrandeKit.max(arr); //将获取到的数组作为参数传到另一个方法中去加工
    }
}
