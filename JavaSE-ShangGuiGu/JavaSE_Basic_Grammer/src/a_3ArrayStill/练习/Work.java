package a_3ArrayStill.练习;

public class Work {
    public static void main(String[] args) {
        /**一维数组初始化************************************************************************/
        //一维数组动态初始化(即初始化与赋值分开进行)
        int[] number = new int[2];
        //一维数组静态初始化(初始化与赋值同时进行)
        int[] number1 = new int[]{1,2,3};

        /**二维数组初始化************************************************************************/
        //静态初始化(初始化与赋值)
        String[][] str = new String[][]{{"s" , "sa"}, {"s" , "sa"}};
        //动态初始化(赋值分开进行)
        String[][] str1 = new String[2][];

        /**遍历二维数组************************************************************************/
        int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
        for (int i = 0 ; i < arr.length ; i++){  //遍历外层数组 0 1 2
            for (int j = 0 ; j < arr[i].length ; j++){ //遍历内层 0 1 2 , 0 1 , 0 1 2
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /**二维数组求和************************************************************************/
        int[][] numArr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                sum += numArr[i][j];
            }
        }
        System.out.println("二维数组求和: " + sum);
    }
}
