package link.table;

public class TestLinkList {
    public static void main(String[] args) {
        Student st1 = new Student("2001" , "张三" , 18);
        Student st2 = new Student("2002" , "李四" , 19);
        Student st3 = new Student("2003" , "王五" , 20);
        LinkList<Student> 学生 = new LinkList<>();
        学生.addFirst(st1);
        学生.addFirst(st2);
        学生.addFirst(st3);
        System.out.println(学生.toString());
    }
}
