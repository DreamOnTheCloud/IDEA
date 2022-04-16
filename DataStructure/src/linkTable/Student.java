package linkTable;

public class Student {
    private String no;
    private String name;
    private int age;

    public Student(String no, String name, int age) {
        this.age = age;
        this.name = name;
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "[" + this.no + "," + this.name + "," + this.age + "," + "]";
    }
}
