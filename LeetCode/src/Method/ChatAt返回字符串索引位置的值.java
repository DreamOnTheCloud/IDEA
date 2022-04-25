package Method;

public class ChatAt返回字符串索引位置的值 {
    public char charAtUSE(String[] charTest){
        /*
            charAt针对字符串每个元素的下标索引输出其值,只有字符串才有charAt方法
            其返回值是一个char类型的单个字符(charAt在字符串中的索引),找不到索引的位置直接报错无返回值
        */
        return charTest[1].charAt(5); //返回字符串数组中第二个元素的第五个索引,若没有直接报错
    }

    public static void main(String[] args) {
        System.out.println(new ChatAt返回字符串索引位置的值().charAtUSE(new String[]{"sad", "assadd"}));
    }
}
