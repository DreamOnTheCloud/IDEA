package Question;

public class LeetCode {
}

class Solution1672 {
    /**
     * Create the "maxWealth" method use find the most wealth person
     * @param accounts Parameter --> (integer 2D Array)
     * @return 返回值为整数(二维数组里一维数组累加和最多的一项)
     */
    public int maxWealth(int[][] accounts) {
        for (int i = 0; i < accounts.length; i++){  //外层决定二维数组长度(包含多少个一维数组)
            //从i,0 开始j的值必须从一开始,否则0,0 += (0,0) (0,1)重复加了一遍0,0
            for (int j = 1; j < accounts[i].length; j++){ //内层循环决定每个一维数组中元素的个数
                //每组一维数组下来之后做内部加法运算,相加结果给到account[i][0](每组一维数组的第一个元素)
                accounts[i][0] += accounts[i][j];
                //第一次0,0 += (0,1) , (0,2) ....
                //第二次1,0 += (1,1) , (1,1) ....
                //第三次2,0 += (2,1) , (2,2) ....
            }
            //内层每次加完都会在外层这里做一次赋值,最后将总和最大的一维数组放在accounts[0][0]里面
            accounts[0][0] = Math.max(accounts[0][0],accounts[i][0]);
        }
        return accounts[0][0];
    }

    public static void main(String[] args) {
        System.out.println(new Solution1672().maxWealth(new int[][]{{1,5,8},{10,56,44,10}}));
    }
}


class Solution2114{
    /**
     * sentences Method use please Most Words of Array 求出一维数组中单词最多的一项
     * @param sentences One-dimensional array of String type
     * @return The most words
     */
    public int mostWordsFound(String[] sentences) {
        //sum用于统计每组charAt()里空格总和 flag用于判断是否为空格 oneMax用于保存每组的单词数 Max用于比较出最多的单词数
        int sum = 0;
        char flag ;
        int oneMax = 0;
        int Max = 0;
        for (int i = 0; i < sentences.length; i++){//i循环数组元素的下标
            for (int j = 0; j < sentences[i].length(); j++){//j循环单个元素里面每个值的下标
                flag = (sentences[i].charAt(j)); //核心【1】赋值字符串的每一项给flag去判断是否为空格
                if (flag == ' '){
                    sum++; //flag每有一个空格sum + 1
                }
                oneMax = (sum + 1); //核心:oneMax存放每组的单词数量
            }
            Max = Math.max(Max , oneMax); //核心:每组的单词数量都与Max作比较最后保留最大值
            oneMax = 0;
            sum = 0;
        }
        return Max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2114().mostWordsFound(new String[]{"s a s a a" , "sad as sa sa sa as"}));
    }
}


class Solution2114_2{
    /**
     * sentences Method use please Most Words of Array 求出一维数组中单词最多的一项
     * @param sentences One-dimensional array of String type
     * @return The most words
     */
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++){
            int sum = sentences[i].split(" ").length; //核心:sentences的每个元素中含有几个空格,直接返回其长度sentence[i].split(" ").length
            max = Math.max(sum , max);//核心:max每次作比较返回最多的单词数量
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2114().mostWordsFound(new String[]{"s a s c c c ca a" , "sad as sa sa sa as"}));
    }
}

class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //定义两个字符串
        String s1 = null;
        String s2 = null;
        for (int i = 0 ; i < word1.length ; i++){
            s1 += word1[i]; //s1用来存放字符串数组的每组数值
        }
        for (int i = 0 ; i < word2.length ; i++){
            s2 += word2[i];
        }
        if (s1.equals(s2)) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution1662().arrayStringsAreEqual(new String[]{"SDA","SAD"} , new String[]{"SD","ASAD"}));
    }
}