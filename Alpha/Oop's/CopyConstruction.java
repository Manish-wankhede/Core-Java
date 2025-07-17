public class CopyConstruction {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Manish";
        s1.roll_no = 66;
        s1.password = "abcd";
        s1.marks[0] = 100; 
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz"; 
        s1.marks[2] = 100;

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll_no;
    String password;
    int marks[];

    // Copy Construction
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll_no = s1.roll_no;
    //     this.marks = s1.marks;
    // }

    //Deep copy Construction
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    
    Student(){
        marks = new int[3];
        System.out.println("Construction is called...");
    }
    
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    
    Student(int roll_no){
        marks = new int[3];
        this.roll_no = roll_no;
    }
}
