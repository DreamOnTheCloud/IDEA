package a_2ProcessControl;

public class BreakAndContinue{
    /*
        【break】
            结束当前(内层包裹就只结束内层)循环,退出循环
        【continue】
            跳过本次循环,循环继续达到指定条件跳过
     */

    public static void main(String[] args) {
        //质数的优化
        long start = System.currentTimeMillis();
        int count = 0;
        label:for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    continue label; //如果发现不合格的数,直接跳出外层循环,或者出去的数才有资格count++
                }
            }
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数为: " + count);
        System.out.println("程序执行时间为: " + (end - start));
    }
}
