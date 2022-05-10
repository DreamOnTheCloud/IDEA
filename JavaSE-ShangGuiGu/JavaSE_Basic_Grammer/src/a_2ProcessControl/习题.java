package a_2ProcessControl;

import java.util.Scanner;

public class 习题 {
    public static void main(String[] args) {
        //【1判断z的最后值】-------------------------------------------------------------------------
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)){
            /*我们仔细看题 z++代表先比较在自增 所以前面关系表达式成立,成立之后z第一次自增
              看清楚后面是一个赋值表达式,并不是关系表达式将false赋值给y而已所以整体成立*/
            z++; //z++第二次执行所以z此时的值为42
        }
        if ((x = false) || (++z == 43)){  //上面z = 42前面是赋值运算,后面++z 42自加一个 = 43 z第三次自增所以成立
            z++;  //执行z++第四次 43++ 所以z最后的值一定为44
        }
        System.out.println("z:" + z);

        //【2判断成绩】-------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = sc.nextInt();
        //本体核心就是三元运算符的嵌套使用,定义一个变量达成什么条件变量的值是什么,向后嵌套一个值出来后后面在定义下一个条件
        String award = score == 100 ? "BWM一台" : (score <= 99 && score >= 80) ? "IphoneXsMax" : (score < 80 && score >= 60) ?
                "诺基亚" : "挨揍";
        System.out.println("您的成绩为:" + score + "\n奖励为:" +  award);

        //【3三个数比大小】---------------------------------------------------------------------------
        System.out.println("输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数:");
        int num2 = sc.nextInt();
        System.out.println("输入第三个数:");
        int num3 = sc.nextInt();
        //本体核心考验的就是if条件语句的嵌套,先比较前两个数值的大小然后在将第三个数值放到每一个能放的地方都试一遍
        if (num1 > num2){ //先比较随机两个数值
            if (num3 > num1){       //再将第三个数值假设为最大
                System.out.println(num2 + "," + num1 + "," + num3);
            }else if (num3 < num2){ //再将第三个数值假设为最小
                System.out.println(num3 + "," + num2 + "," + num1);
            }else {  //假设第三个在中间
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }else { //此else对应的是第一个if即: num2 > num1
            if (num3 > num2){       //假设第三个数值最大
                System.out.println("结果从小到达依次排序为:" + num1 + "," + num2 + "," + num3);
            }else if (num3 < num1){ //假设第三个数值最小
                System.out.println("结果从小到达依次排序为:" + num3 + "," + num1 + "," + num2);
            }else { //假设在中间
                System.out.println("结果从小到达依次排序为:" + num1 + "," + num3 + "," + num2);
            }
        }

        //【4if判断三数最大值并输出】-----------------------------------------------------------------------
        int max = 0;
        System.out.println("第一个数值:");
        int num4 = sc.nextInt();
        System.out.println("第二个数值:");
        int num5 = sc.nextInt();
        System.out.println("第三个数值:");
        int num6 = sc.nextInt();
        //本题核心考察if分支与短路逻辑运算符的使用
        if (num4 > num5 && num4 > num6){
            max = num4;
        }else if (num5 > num4 && num5 > num6){
            max = num5;
        }else {
            max = num6;
        }
        System.out.println("最大值为:" + max);

        //【5.狗的年龄等于人类的几岁】狗的两岁之前够的年龄是人的10.5倍,后面的年就是人类的4倍-------------------------------------
        System.out.println("请输入狗的年龄:");
        double dogAge = sc.nextDouble(); //获取狗的年龄存到dogAge里面
        double dogPersonAge = 0; //定义狗的岁数与人类的换算
        if (dogAge <= 2 && dogAge > 0){
            dogPersonAge = dogAge * 10.5;
        }else if (dogAge > 5){
            dogPersonAge = (2 * 10.5) + (dogAge - 2) * 4; //先计算狗的前两年10.5倍的,在计算出狗的后几年4倍的
        }else {
            System.out.println("狗还没出生!!!");
        }
        System.out.println("狗的今年" + dogPersonAge + "岁了");

        //【6高富帅】----------------------------------------------------------------------------------
        System.out.println("请输入您的身高(cm):");
        double height = sc.nextDouble();
        System.out.println("请输入您的财产(千万):");
        int wealth = sc.nextInt();
        System.out.println("您帅吗?(true / false)");
        boolean handsome = sc.nextBoolean();
        String resule;
//        String result = (height > 1.8 && wealth > 1 && handsome) ? "我一定要嫁给你" : (height > 1.8 || wealth > 1 || handsome) ?
//                "比上不足比下有余,嫁了吧" : "滚蛋穷狗,你不配";
//        System.out.println(result);
        if (height > 1.8 && wealth > 1 && handsome){
            resule = "我一定要嫁给你";
        }else if (height > 1.8 || wealth > 1 || handsome){
            resule = "比上不足比下有余,嫁了吧";
        }else {
            resule = "滚蛋穷狗,你不配";
        }
        System.out.println(resule);

        //【7随机数彩票游戏】-------------------------------------------------------------------------------------
        //生成随机两位数 [10 , 100] 随机数左侧 (0 * 91) + 10 = 10 右侧 (1 * 91) + 10 = 101
        int ran = (int)(Math.random() * (100 - 10 + 1) + 10);
        int ranSingle = ran % 10;//取到随机数的个位数(第一位)
        int ranTen = ran / 10;   //取到随机数的十位数(第二位)
        for (int i = 1 ; i <= 5 ; i++){ //五次机会
            System.out.println("共有5次机会,请输入您的第" + i + "次机会(随机输入一个十位数):");
            int input = sc.nextInt();
            int inpSingle = input % 10;//获取输入的个位
            int inpTen = input / 10;   //获取输入的十位
            if (ran == input){ //两个相等且顺序相等
                System.out.println("中头奖了老铁,奖励100w");
                break;
            }else if((ranSingle == inpSingle) || (ranTen == inpTen)){ //其中有一个相等顺序也相等
                System.out.println("二等奖50w");
                break;
            }else if ((ranSingle == inpTen) || (ranTen == inpSingle)){ //一个相等但顺序不等
                System.out.println("三等奖10w");
                break;
            }else {
                System.out.println("很遗憾没中奖,您还剩" + (5 - i) + "次机会");
                continue;
            }
        }
        System.out.println("本期中将号码为:" + ran);
    }
}

