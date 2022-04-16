package StudentTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test111 {
    public static void main(String args[]){
        /**
         * 4、编写一个循环，提示让用户输入一系列的披萨配料，
         * 并在用户输入“quit”是结束循环
         * 并打印之前输入过的披萨配料
         */
        String food[] = new String[10];
        Scanner input = new Scanner(System.in);
        int index = 0;
        String active = " ";
        while(true){
            System.out.println("请输入第" + index + "个food");
            food[index] = input.next();
            System.out.println("是否继续输入 若停止 输入quit");
            active = input.next();
            if(active.equals("quit")){
                break;
            }
            index++;
        }
        System.out.println(Arrays.toString(food));
    }
}
