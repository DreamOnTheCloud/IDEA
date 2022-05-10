package a_2ProcessControl;

public class PrimeNumber {
    /*
        100以内质数的输出,什么是质数
        只能被一和他本身除尽,从2开始,到n - 1所有的数都除不尽
        【针对问题】
            有一个数,递增或递减趋势,另外有一组数
            期间每个数与一组数的任何一个发生过某种关系我们的判断值就改为false
            一次没发生过的就是我们要的素数,直接输出
        【优化】
            ①变为false直接break不在判断
            ②尽多减少我们知道的肯定不需要的那一组数里值
            ③使用计数器
     */
    public static void main(String[] args) {
        //获取当前时间距离1970-01-01 00:00:00距离今天的毫秒数
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 2 ; i <= 100000 ; i++){ //质数从二到100, 1 2 3 4 5 6 7 8 9 10 11.....4进去发现可以除的尽2所以变为false 4不输出
            boolean isFlag = true; //定义用于判断的布尔值变量
            for (int j = 2 ; j <= Math.sqrt(i) ; j++){  //j小于等于开方,一个数除的尽另一个数肯定还有一个数作为结果我们直接开放到中间后面的不去判断
                if (i % j == 0){ //如果i / j 每次除尽的话,就将判断值改为false
                    isFlag = false;
                    break;//只要有一次不干净了(除尽了直接false不再去判断)
                }
            }
            if (isFlag == true){ //一次没改过的就是干净的直接输出就是我们要的质数
//                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("质数个数为: " + count);
        System.out.println("程序运行时间: " + (end - start));
    }
}
