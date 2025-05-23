public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;
    private int phno;

    public Employee(String name, int id, double salary, String department,int phno) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.phno = phno;
    }
    public void dispay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
                System.out.println("phone number" + phno);

    }
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 12345, 50000.0, "Engineering",123456789);
        emp.dispay();
    }
}
