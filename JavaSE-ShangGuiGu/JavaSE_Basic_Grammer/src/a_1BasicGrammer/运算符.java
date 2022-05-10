package a_1BasicGrammer;

//运算符连接起来的变量或常量称为表达式,算数表达式,关系表达式,逻辑表达式
public class 运算符 {
    public static void main(String[] args) {
        /*【算数运算符】 + - * / % ++ --
               取余运算符的结果符号永远取决于左边的数
               ++ 在前先自加在赋值 , ++在后先赋值在自加
          */
        System.out.println(-5%2);//结果永远取决于左边的操作数
        //int型变量参与除法结果总是正整数
        int num1 = 12;
        int num2 = 5;
        int result = num1 / num2;//结果为2,因为是整形
        double result1 = num1 / num2;//结果2.0整形结果2赋值给浮点型变量为2.0
        double result2 = num1 / (num2 + 0.0);//结果2.4一个表达式中多种数据类型运算结果为最大大数据类型自动提升
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        /*【赋值运算符】 = += -= *= /= %=
        *      例 a += 1 就是 a = a + 1; 将a+1赋值给a
        *      后面的都是相同的道理
        * */
        num1 += num2;
        System.out.println("赋值运算符:" + num1);

        //【实验逻辑运算符】-----------------------------------------------------------------
        int i = 10;
        int j = 20;
        int k = 30;
        //在逻辑与 "&" 中 无论关系表达式的左边或者右边有一边结果为false 那么逻辑表达式的结果为false
        System.out.println((i > j) & (i > k)); //false & false
        System.out.println((i < j) & (i > k)); //true  & false
        System.out.println((i > j) & (i < k)); //false & true
        System.out.println((i < j) & (i < k)); //true  & true
        System.out.println("----------------------------------");
        //在逻辑或 "|" 中 无论关系表达式的左边或者右边有一边结果为
        System.out.println((i > j) | (i > k)); //false | false
        System.out.println((i < j) | (i > k)); //true  | false
        System.out.println((i > j) | (i < k)); //false | true
        System.out.println((i < j) | (i < k)); //true  | true
        System.out.println("----------------------------------");
        //在逻辑异或 "^" 中 相同为false 不同为true
        System.out.println((i > j) ^ (i > k)); //false ^ false
        System.out.println((i < j) ^ (i > k)); //true  ^ false
        System.out.println((i > j) ^ (i < k)); //false ^ true
        System.out.println((i < j) ^ (i < k)); //true  ^ true
        System.out.println("----------------------------------");
        //在逻辑非 "!" 中 反着来
        System.out.println(!((i > j) | (i > k))); //false | false
        System.out.println(!((i < j) | (i > k))); //true  | false
        System.out.println(!((i > j) | (i < k))); //false | true
        System.out.println(!((i < j) | (i < k))); //true  | true

        //逻辑【短路】运算符 短路与 && 前面判断为false的话后面直接不执行
                        //逻辑或 || 前面判断为true 的话后面直接不执行
        int a =10;
        int b = 20;
        System.out.println(a++ < 5 && b++ < 10);
        System.out.println("a:" + a + "b" + b);

        //【三元运算符】
        int num3 = 10;
        int num4 = 20;
        //定义String型的结果用于接收结果
        String resule = num3 > num4 ? "成立" : "不成立";
        System.out.println(resule);
    }
}
