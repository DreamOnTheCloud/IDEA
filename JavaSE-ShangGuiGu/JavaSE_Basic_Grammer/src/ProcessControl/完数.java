package ProcessControl;

public class 完数 {
    public static void main(String[] args) {
        //1000以内的完数
        int count = 0;
        for (int i = 1 ; i < 1000 ; i++){
            count = 0;
            for (int j = 1 ; j <= i/2 ; j++){
                if (i % j == 0){ //如果i / j == 0 每一个约数相加
                    count += j;
                }
            }
            if (count == i){ //判断所有约束与本身是否相等输出
                System.out.println(i);
            }
        }
    }
}
