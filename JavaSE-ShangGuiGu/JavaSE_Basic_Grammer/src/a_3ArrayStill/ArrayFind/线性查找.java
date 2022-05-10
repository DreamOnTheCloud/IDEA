package a_3ArrayStill.ArrayFind;

public class 线性查找 {

    public static void main(String[] args) {
        //要查找的值
        int dest = 52;
        //线性查找无需关注顺序,一个一个的找
        int[] arr = new int[]{1,5,3,4,8,79,6,52};
        //定义没有找的后的输出值，初始值为true,找到的话为false
        boolean isFlag = true;
        for (int i = 0 ; i < arr.length ; i++){
            if (dest == arr[i]){
                System.out.println("找到目标索引" + dest + "\n索引为: " + i);
                isFlag = false; //找到为false
            }
        }
        if (isFlag){ //如果一直为true的话就是一直没找到直接输出
            System.out.println("没有此值");
        }
    }
}
