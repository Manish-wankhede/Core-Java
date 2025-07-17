public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(1000);
        System.out.println(e.getEmpId());

        e.setEmpName("Manish");
        System.out.println(e.getEmpName());
    }
}
class Employee{
    private int emp_id; // data hiding
    public String emp_name;

    public void setEmpId(int emp_id1){
        emp_id = emp_id1;
    }
    public int getEmpId(){
        return emp_id;
    }

    public void setEmpName(String emp_name1){
        emp_name = emp_name1;
    }
    public String getEmpName(){
        return emp_name;
    }
}