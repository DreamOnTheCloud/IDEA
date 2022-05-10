package Question;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;
import java.util.Scanner;

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
            /*
                  代码解析:
                      双层循环每个一维数组里的值,令每一项一维数组内容相加,结果赋值给第一个
                      比较所有轮(每一组一维数组的累加值),取最大赋值给[0][0]
            */
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
        /*
              代码解析:
                  使每一轮的字符串数组里的每一项字符串split.(" ").length长度(因为单词的总长度就是空格 + 1)
                  利用Math.max比较出最大的一项赋值给max即可
        */

    public static void main(String[] args) {
        System.out.println(new Solution2114().mostWordsFound(new String[]{"s a s c c c ca a" , "sad as sa sa sa as"}));
    }
}

class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //定义两个字符串
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        for (int i = 0 ; i < word1.length ; i++){
            s1.append(word1[i]); //s1存放拆成字符串的字符串数组word1
        }
        for (int i = 0 ; i < word2.length ; i++){
            s2.append(word2[i]); //s2存放拆成字符串的字符串数组word2
        }
        if (new String(s1).equals(new String(s2))) { //比较两组字符串
            return true;
        }else {
            return false;
        }
    }
        /*
              代码解析:
                  首先将字符串数组的每一项字符串合并起来赋值给一个StringBuffer类型的字符串变量(StringBuffer对象.append.(每一项字符串))
                  再将两个StringBuffer类型的对象比较即可
        */
    public static void main(String[] args) {
        System.out.println(new Solution1662().arrayStringsAreEqual(new String[]{"SDA","SAD"} , new String[]{"SD","ASAD"}));
    }
}

class Solution2185 {
    /**
     * 判断字符串每个元素的前缀是不是某个字符
     * @param words
     * @param pref 参数为一个字符串与一个字符串数组
     * @return 返回值为匹配的数量
     */
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].startsWith(pref)){ //直接将字符串的每一项拿出来用words[i].starts.With(pref);去逐个匹配是否相等
                count++;
            }
        }
        return count;
    }
        /*
              代码解析:
                  利用starts.With(pref);方法直接去判断字符串数组里的每一项字符串前缀是否为我们对应的pref
                  相反ends.With(pref);  方法判断后缀是否一致
        */

    public static void main(String[] args) {
        System.out.println(new Solution2185().prefixCount(new String[]{"ass","ass","ads"} , new String("as")));
    }
}

class Solution1929{
    /**
     * 将数组1赋值给数组2两遍然后打印出来
     * @param nums 参数为数组1
     * @return 返回值为数组2
     */
    public int[] getConcatenation(int[] nums){
        nums = Arrays.copyOf(nums , nums.length * 2);
        System.arraycopy(nums, 0, nums, nums.length / 2, nums.length / 2);
        return nums;
        /*
              代码解析:
                nums = Arrays.copyOf(nums , nums.length * 2)目标数组值 = 原数组的值,长度等于原数组的两倍
                System.arraycopy(要复制的数组,从数组的哪里开始复制,目的数组,目的数组放置的起始位置索引,复制的长度)
                System.arraycopy(长度为 * 2后的原数组 , 要复制的起始位置是从0开始 , 目标数组 , 存放的位置 , 要复制的长度)
              假设:
                  Arrays.copyOf作用:
                    【1】我们数组是  int[] nums = {1, 2, 3};
                    【2】第一行代码  nums = Array.copyOf(arr , arr.length * 2);
                    【3】数组内部变  nums = {1, 2, 3, null, null, null}
                  System.arraycopy作用:
                    【1】要从数组arr复制,此时数组值为{1, 2, 3, null, null, null}
                    【2】从第零个索引开始复制
                    【3】目标数组(要复制到的数组)是arr(自己本身但是后面有一半空间是null)
                    【4】复制完成我们将要放到哪里呢?置放的起始位置为nums.length/2 刚刚好是那一半空的
                    【5】要复制的长度就是我们的前三位,放到num.length / 2 的位置不就一样了吗
        */
    }

    public static void main(String[] args) {
        System.out.println(new Solution1929().getConcatenation(new int[]{1,2,3}));
    }
}

class Solution1920 {
    /**
     * @param nums 整形数组
     * @return 另一个整形数组(使 ans[0] = nums[nums[0]])依次排列
     */
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[nums[i]]; //核心:使新数组ans[0] = nums[num[i]] nums零上的具体值作为nums的下标值赋给ans
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1920().buildArray(new int[]{0,2,1,5,3,4}));
    }
}

class Solution1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
        /*
              代码解析:
                  首先考虑第零项都是一样的,所以不用管我们从一开始
                  nums[1] = nums[1] + nums[1 - 1]  第零项加第一项
                  nums[2] = nums[2] + nums[2 - 1]  第一项加第二项
        */

    public static void main(String[] args) {
        System.out.println(new Solution1480().runningSum(new int[]{12,5,4,8,6,45}));
    }
}


class Solution2011 {
    /**
     *
     * @param operations 运算符号
     * @return x结构
     */
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0 ; i < operations.length ; i++){  //循环数组的每一项操作符号
            switch (operations[i]){ //匹配到了符号做出相应运算
                case "++X":
                case "X++":
                    x += 1;
                    break;
                case "--X":
                case "X--":
                    x -= 1;
                    break;
            }
        }
        return x;
    }
        //循环匹配数组的每个下标得到是什么符号
    public static void main(String[] args) {
        System.out.println(new Solution2011().finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
}


class Solution32 {
    /**
     * 传进来一个32位的整数,将其反转,判断反转后的结果是否超出32位,超出的话直接返回0,否则返回反转后的结果
     * @param x
     * @return
     */
    public int reverse(int x) {
        StringBuffer str = new StringBuffer();
        str.append(x);
        if (str.charAt(0) == '-'){
            char y = str.charAt(0);  //如果第一位是负数的话就将符号赋值给y
            str.deleteCharAt(0);  //然后把里面的负号删除
            str.reverse();  //反转字符串数组
            str.insert(0 , y); //插入方法向StringBuff 的第一个位置插入0,也就是我们的负数
        }else {
            str.reverse(); //若是正数直接反转
        }
        int res = Double.parseDouble(str.toString()) > Integer.MAX_VALUE || Double.parseDouble(str.toString())   < Integer.MIN_VALUE ? 0 : Integer.parseInt(String.valueOf(str));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution32().reverse(1534236469));
    }
}

class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        int nums = 0;
        //首先判断宝石类型jewels和拥有的石头stones是否为零，只要任意一个为零，则证明拥有的宝石数量为零，直接结束，节约不必要的内存开销
        //1.宝石类型为零，证明石头都是石头
        //2.拥有石头为零，那肯定就不用后续判断了，基本条件都不符合
        if(jewels.length() == 0 || stones.length() == 0){
            return nums;
        }
        for(int i = 0; i < stones.length(); i++){
            //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1
            char index = stones.charAt(i);
            //因为jewels不重复，所以用indexOf函数返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回-1
            if(jewels.indexOf(index) != -1){
                //!= -1 则证明是宝石，宝石数量累加1
                nums++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(new Solution771().numJewelsInStones(new String("asd") , new String("handshakes")));
    }
}

class Solution旋转图形 { //旋转矩阵

    public void rotate(int[][] matrix) {
        int[][] myMatrix = new int[matrix.length][matrix[0].length];//由于是方阵所以长度与老数组一样
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                myMatrix[i][j] = matrix[i][j]; //复制一份与参数一样的数组
            }
        }

        //开始根据规律改变参数数组,逮到规律挨个覆盖原值即可
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][matrix[i].length - i - 1] = myMatrix[i][j];
            }
        }
    }
}



class Solution59{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字:");
        int len = scanner.nextInt(); //键盘读入 ？ * ？ 的矩阵,并让他作为数组的长度
        int[][] arr = new int[len][len]; //定义二维数组长度为读进来的数,因为是方阵(行列相等)
        int s = len * len; //所有的元素总个数
        /**
             定义指针方向【k = 1右】 【k = 2下】 【k = 3左】 【k = 4上】
         */
        int k = 1; //令k的初值为 1 因为从左到右开始的
        int i = 0, j = 0; //定义下标引用
        for (int m = 1; m <= s; m++) {  //m的值从一开始循环到m本身就是所有的元素
            if (k == 1) { //判断指针是否从左开始
                if (j < len && arr[i][j] == 0) { //判断条件是否成立j < len否则超出,未赋值的处置必须为零
                    arr[i][j++] = m; //行不变列变从左到右依次赋值,超出条件时k向下 = 2
                } else {
                    k = 2; //k为2时m会多出一次循环,所以个别的值要回溯到上一个
                    i++;   //i++下一个索引
                    j--;   //根据m循环j多出一个回溯到上一个j
                    m--;   //根据m循环m多出一个回溯到上一个m
                }
            } else if (k == 2) { //为2时向下赋值
                if (i < len && arr[i][j] == 0) {
                    arr[i++][j] = m; //直接根据下标赋值从上向下i累加j不变
                } else {
                    k = 3;  //否定回溯过去
                    i--;
                    j--;
                    m--;
                }
            } else if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j--] = m;  //从右向左跟第一个反过来,直接i不变 j--
                } else {
                    k = 4;   //否定回溯过去
                    i--;
                    j++;
                    m--;
                }
            } else if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i--][j] = m;  //从下想上直接j不变 i--
                } else {
                    k = 1;  //超出回溯直接第二圈
                    i++;
                    j++;
                    m--;  //第二圈直接顺下来
                }
            }
        }
        for (int l = 0; l < arr.length; l++) {
            for (int n = 0; n < arr[l].length; n++) {
                System.out.print(arr[l][n] + " ");
            }
            System.out.println();
        }
    }
}







