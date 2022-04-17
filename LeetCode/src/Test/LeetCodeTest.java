package Test;

public class LeetCodeTest {
}

class test1{
    /**
     * 求出整形二维数组里的每一项一维数组累加和
     * @param account 参数整形二维数组
     * @return 返回值为int型的一维数组最大和
     */
    public int maxWealth(int[][] account){
        for (int i = 0; i < account.length; i++){ //循环总一维数组的个数
            //核心,为什么让j的值从1开始,因为我们接下来要从account[i][0] 开始类加每一项一维数组的和
            for (int j = 1; j < account[i].length; j++){
                account[i][0] += account[i][j];//核心:累加每项一维数组的和赋值给到account[i][0]
            }
            account[0][0] = Math.max(account[0][0] , account[i][0]);//核心:将account[0][0]与每一项一维数组的和最比较取最大
        }
        return account[0][0];
    }

    public static void main(String[] args) {
        System.out.println(new test1().maxWealth(new int[][]{{1,5,8},{8,4,6},{10,20},{4,2,6,8}}));
    }
}


class test2{
    /**
     * 找出数组字符串里单词最多的一项(用空格隔开的)
     * @param words 参数字符串数组
     * @return 整形的返回值:返回单词最多的一项
     */
    public int maxWords(String[] words){
        int max = 0;
        for (int i = 0 ; i < words.length ; i++){ //循环遍历字符串
            int num = words[i].split(" ").length; //核心将数组的每一项都拿去判断有多少空格,最后将空格的长度赋值给num
            max = Math.max(max,num); //核心:再用max比较出最大的一项空格数存起来
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new test2().maxWords(new String[]{"a b c v d" , "s sd sd sd sd sd sd"}));
    }
}

class test3{
    /**
     * 判断两组字符串是否相等
     * @param str1
     * @param str2 参数为两个字符串
     * @return 相等返回true 否则false
     */

    public boolean arrayStringsAreEqual(String[] str1, String[] str2) {
        if (str1.length == 0 && str2.length == 0) {
            return true; //判断是否为两个空字符串,是返回true
        }
        //创建两个默认值长度为16的StringButter类型的字符串用于使用它的append方法追加
        StringBuffer word1 = new StringBuffer("");
        StringBuffer word2 = new StringBuffer("");
        for (int i = 0; i < str1.length; i++) {
            word1.append(str1[i]); //追加第一个字符串数组的全部值到word1字符串里
        }
        for (int j = 0; j < str2.length; j++) {
            word2.append(str2[j]); //追加第二个字符串数组的全部值到word2字符串里
        }
        if (new String(word1).equals(new String(word2))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new test3().arrayStringsAreEqual(new String[]{"sa" , "sad"} ,new String[]{"sa" , "sad"}));
    }
}