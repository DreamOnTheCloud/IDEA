import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        String food[] = new String[10]; //定义用于存放食物的数组,长度10
        String flag = ""; //定义字符串flag用于判断是否退出循环,也用于接收用户输入的值存入数组
        int count = 0; //定义累加器用于数组下表的索引
        Scanner input = new Scanner(System.in);
        while (!(flag.equals("quit"))){
            System.out.println("请输入第" + count +  "个石材:");
            food[count] = input.next(); //向数组里添加输入的食材
            System.out.println("是否继续添加石材 'quit' 退出");
            flag = input.next();
            count++;
        }
        System.out.println(Arrays.toString(food));
    }
}
