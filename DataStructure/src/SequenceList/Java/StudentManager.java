package SequenceList.Java;

import java.util.Scanner;

//class aaa{
//    public void displayStudents(){
//        for (int i = 0, i < students.length, i++){
//            try {
//                Student st = students.get(i);
//                System.out.println("学号:" + );
//            }
//        }
//    }
//}

public class StudentManager {
    public static void main(String[] args) {
        StudentManager sTM = new StudentManager();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入选项");
            System.out.println("1,新增一个学生");
            System.out.println("9,列出所有学生");
            System.out.println("q,退出!");
            String input = sc.nextLine();
            if ("q".equals(input)){
                break;
            }else if ("1".equals(input)){

            }
            else if ("9".equals(input)){

            }
            else {
                System.out.println("输入正确的选项! --" + input);
            }
        }
    }
}
