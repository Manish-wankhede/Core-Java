class Student
{
    String name;
    int rollno;
    float percentage;

    Student()
    {
        name = "ABC";
        rollno = 10;
        percentage = 78.50f;
    }
    void display()
    {
        System.out.print("\n Name = "+name);
        System.out.print("\n Roll no = "+rollno);
        System.out.print("\n Percentage = "+percentage);
    }
    public static void main(String args[]) throws Exception
    {
        Student s = new Student();
        s.display();     
    }
    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
    public char[] getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}