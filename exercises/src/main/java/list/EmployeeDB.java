package list;
//i) boolean addEmployee(Employee e) ii) boolean deleteEmployee(int empId)
//// iii) String showPaySlip(int empId) iv) Employee[] listAll()
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
    List<Employee> employeesDb=new ArrayList<>();
    public boolean addEmployee(Employee e){
        return employeesDb.add(e);
    }
    public boolean deleteEmployee(int emp_id) {
        boolean isRemoved = false;
        Iterator<Employee> employeeIterator = employeesDb.iterator();
        while (employeeIterator.hasNext()) {
            Employee emp = employeeIterator.next();
            if (emp.getEmp_id() == emp_id) {
                isRemoved = true;
                employeeIterator.remove();
            }
        }
        return isRemoved;
    }
    public String showPaySlip(int emp_id) {
        String paySlip = "Invalid employee id";

        for (Employee e : employeesDb) {
            if (e.getEmp_id() == emp_id) {
                paySlip = "Pay slip for employee id " + emp_id + " is " +
                        e.getEmp_salary();
            }
        }

        return paySlip;
    }

    public Employee[] listAll() {
        Employee[] empArray = new Employee[employeesDb.size()];
        for (int i = 0; i < employeesDb.size(); i++)
            empArray[i] = employeesDb.get(i);
        return empArray;
    }
}
