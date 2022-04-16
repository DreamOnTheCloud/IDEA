package jspSamples.unit5.javaBeanSamples;

public class Person {
    private String name = "ZhangSan";
    private String sex = "man";
    private int age = 20;
    private boolean isMarried = true;

    public Person() {
        //Not Arguments Method
    }

    //setter and getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
