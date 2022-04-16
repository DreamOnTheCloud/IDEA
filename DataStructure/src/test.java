import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String [] args){
        //定义询问数组长度并创建一个数组
        Scanner input = new Scanner(System.in);
        String arr[] = new String[10]; //定义一个数组长度为输入的值
        boolean flag = true;//定义判断是否继续循环
        int index = 0;
        //定义循环次数为数组长度-1(即数组最后一个下标)
        while (flag){
            System.out.println("请输入第" + index + "个元素:");
            arr[index] = input.next(); //为数组赋值
            System.out.println("是否继续循环 \"quit\" 退出");
            index++;
            flag = !(input.next().equals("quit"));//将后面的值赋给flag
        }
        System.out.println(Arrays.toString(arr));
        String newArr [] = new String[arr.length];//定义新数组用来存旧数组修改后的值,长度 = 旧数组
        for (int i = 0; i <= arr.length - 1; i++){
            newArr[i] = arr[i] + "已制作完成";
            if (i == 2){
                break;
            }
        }
        System.out.println(Arrays.toString(newArr));
        //数组的位置转移
        String temp = newArr[0];//将第一个值保存
        for (int i = 0; i <= newArr.length - 2; i++){
            /*为什么是newArr.length - 2,因为最后一个值是length - 1
            *我们最后一个值要赋值为第一个临时变量*/
            newArr[i] = newArr[i+1]; //前面的值赋给后面
        }
        newArr[newArr.length - 1] = temp;
        System.out.println(Arrays.toString(newArr));
    }
}
