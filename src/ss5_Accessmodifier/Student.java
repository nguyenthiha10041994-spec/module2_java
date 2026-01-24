package ss5_Accessmodifier;

public class Student {

    private String name = "John";
    private String classes = "C02";
    public Student() {
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setClasses(String classes) {
        this.classes = classes;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nam");
        s.setClasses("C03");
    }
}