package StudentTest;

public class Student {
    //声明三个成员变量
    public String id;
    public String name;
    public String age;

    //创建构造方法
    public Student(String id, String name, String age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        String str = ""; 
        for (int i = 0; i < 10; i++){
            str += "*";
            System.out.println(str);
        }
    }
}
