package Method;

public class Split查找包含数量 {
    public static void main(String[] args) {
        /**
            参数:要查找的值在字符串中所包含的数量
            split查找字符串里所包含的某个值的个数
            返回值为个数加一
         */

        String str2 = "改革春风风吹满地";
        System.out.println(str2.split("风").length);
    }
}
