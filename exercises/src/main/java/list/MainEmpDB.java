package list;

public class MainEmpDB {
    public static void main(String[] args) {
        EmployeeDB empDb=new EmployeeDB();
        Employee emp1=new Employee(101,"John","John.s@gmail.com",'M',45000);
        Employee emp2=new Employee(102,"Robert","Robert.s@gmail.com",'M',23500);
        Employee emp3=new Employee(103,"Rosie","Rosie.s@gmail.com",'F',35000);
        Employee emp4=new Employee(104,"Smiley","smiley.s@gmail.com",'F',98000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for(Employee emp : empDb.listAll())
        System.out.println(emp.getEmployeeDetails());

        System.out.println();
        empDb.deleteEmployee(101);

        for(Employee emp : empDb.listAll())
            System.out.println(emp.getEmployeeDetails());

        System.out.println();
        System.out.println(empDb.showPaySlip(103));

    }
}
