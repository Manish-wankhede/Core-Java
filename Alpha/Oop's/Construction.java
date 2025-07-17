public class Construction {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Manish");
        Student s3 = new Student(123);
    }
}

class Student{
    String name;
    int roll_no;

    Student(){
        System.out.println("Construction is called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll_no){
        this.roll_no = roll_no;
    }
}
