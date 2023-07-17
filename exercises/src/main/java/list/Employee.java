package list;
//Create an application for employee management having following classes:
// a) Create an Employee class with following attributes and behaviors :
// i) EmpId Int ii) EmpName String iii) EmpEmail String iv) EmpGender char
// v) EmpSalary float vi) GetEmployeeDetails() -> prints employee details
//b) Create one more class EmployeeDB which has the following methods.
// i) boolean addEmployee(Employee e) ii) boolean deleteEmployee(int empId)
// iii) String showPaySlip(int empId) iv) Employee[] listAll()
//I. Use an ArrayList which will be used to store the employees and use
// enumeration/iterator to process the employees.

public class Employee {
    private int emp_id;
    private String emp_name;
    private String emp_email;
    private char emp_gender;
    private float emp_salary;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public char getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(char emp_gender) {
        this.emp_gender = emp_gender;
    }

    public float getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(float emp_salary) {
        this.emp_salary = emp_salary;
    }

    public Employee(int emp_id, String emp_name, String emp_email, char emp_gender, float emp_salary) {
       super();
        emp_id = emp_id;
        emp_name = emp_name;
      emp_email = emp_email;
       emp_gender = emp_gender;
        emp_salary= emp_salary;
    }

    public String getEmployeeDetails() {
        return "Employee [EmpId=" + emp_id + ", EmpName=" + emp_name + ", EmpEmail=" + emp_email
                + ", EmpGender=" + emp_gender + ", EmpSalary=" + emp_salary + "]";
    }
}
