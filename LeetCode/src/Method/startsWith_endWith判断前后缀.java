package Method;

public class startsWith_endWith判断前后缀 {
    /**
          startsWidth此方法用于匹配一个字符串的前缀是否为另一个字符串
          @param str
          @param pref
          @return 返回值为整形的结果(有几项前缀是以某字符串开头的)
     */
    public static int startsWidth(String []str , String pref){
        int count = 0;
        for (int i = 0 ; i < str.length ; i++){
            if (str[i].startsWith(pref)){ //取出数组字符串的每一项去与字符串pref比较看是否前缀为pref
                count++;
            }
        }
        return count;
    }


    /**
     startsWidth此方法用于匹配一个字符串的前缀是否为另一个字符串
     @param str
     @param pref
     @return 返回值为整形的结果(有几项前缀是以某字符串开头的)
     */
    public static int endsWith(String []str , String pref){
        int count = 0;
        for (int i = 0 ; i < str.length ; i++){
            if (str[i].endsWith(pref)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(startsWith_endWith判断前后缀.startsWidth(new String[]{"sad","sad"} , new String("sa")));
        System.out.println(startsWith_endWith判断前后缀.endsWith(new String[]{"sad","saa"} , new String("sa")));
    }
}
