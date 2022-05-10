package a_1面向对象基础.类与对象;

public class MandN方阵打印 {

    /**
     *
     * @param rows 矩阵的行数
     * @param cols 矩阵的列数
     * @return 返回的时矩阵的面积(矩阵面积为长×宽)
     */
    public int printMatrix(int rows, int cols){

        //行数
        for (int i = 0; i < rows; i++) {

            //列数
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("矩阵面积为: ");
        return rows * cols;
    }

    public static void main(String[] args) {
        //意思就是new出来的类在堆内存,直接调用方法输出
        System.out.println(new MandN方阵打印().printMatrix(9, 9));   //实例化本类对象,在main方法里引用
    }
}
