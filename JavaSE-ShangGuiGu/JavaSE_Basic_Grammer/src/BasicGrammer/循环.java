package BasicGrammer;

public class 循环 {
    /*
        【for循环结构】
        初始化循环变量: 判断是否可以进入循环
        判断循环条件:  是否满足循环条件是否执行循环
        循环体部分:    达成条件执行的代码
        循环迭代部分:   循环变量的变化
        for(初始化循环变量 ; 判断循环条件 ; 循环迭代部分 ){
        循环体部分
        }
  */
    public static void main(String[] args) {
        //循环练习1 2 3执行三次结果为abcbcbc
        int num = 1;
        for (System.out.print("a"); num <= 3; System.out.print("c"),num++){
            System.out.print("b");
        }

        //1~150三的倍数 5的倍数 7的倍数输出其他东西,注意即是5的倍数又是三的倍数就全部输出,所以不能if else只能if
        for (int i = 1 ; i <= 150 ; i++){
            System.out.print(i + " ");
            if (i % 3 == 0){
                System.out.print("foo ");
            }
            if (i % 5 == 0){
                System.out.print("biz ");
            }
            if (i % 7 == 0){
                System.out.print("baz");
            }
            System.out.println(); //每一个数值出来后换行
        }
    }
}
