class Student {
    String name;
    int rollno;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

class Static{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JVM";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
    }
}