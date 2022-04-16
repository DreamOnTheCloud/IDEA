package Skill技巧;

public class MySKill {

}

class Skill1{
    public char charAtUSE(String[] charTest){
        /*
            charAt针对字符串每个元素的下标索引输出其值,只有字符串数组与字符串才有charAt方法
            其返回值是一个char类型的单个字符(charAt在字符串中的索引),找不到索引的位置直接报错无返回值
        */
        return charTest[1].charAt(5); //返回字符串数组中第二个元素的第五个索引,若没有直接报错
    }

    public static void main(String[] args) {
        System.out.println(new Skill1().charAtUSE(new String[]{"sad", "assadd"}));
    }
}

class Skill2{
    public static void main(String[] args) {
        //数学里的几个方法Math --> max两数比大小 --> pow求某数平方
        int a = 5;
        int b = 4;
        System.out.println("最大值为" + Math.max(a , b));
        System.out.println("最小值为" + Math.min(a , b));
        System.out.println(a + "的2次方为:" + Math.pow(a , 2));

        //split方法只有字符串才有
        String str[] = {"sad" , "asd"};
        System.out.println(str[1].split("a").length);
    }
}