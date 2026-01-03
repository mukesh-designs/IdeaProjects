class Student {
    int rollno;
    String Name;
    int marks;
}

public class StringArray {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.Name = "Navin";
        s1.marks = 67;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.Name = "Mukesh";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.Name = "kiran";
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0; i<students.length; i++){
        //     System.out.println(students[i].Name + " : "+students[i].marks);
        // }
        for(Student stud: students){
            System.out.println(stud);
        }
    }
}
