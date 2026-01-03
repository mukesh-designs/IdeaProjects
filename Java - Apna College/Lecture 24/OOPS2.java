class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student() {

    }
}

public class OOPS2 {
    public static void main(String args[]) {
        Student s1 = new Student("aman", 24);
        Student s2 = new Student();

        s2.name = "mukesh";
        s2.age = 26;

        s1.printInfo();
        s2.printInfo();
        Student s3 = new Student(s2);
        s3.printInfo();
    }
}
