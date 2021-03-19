class Employee{
    String name,designation;
    int id;
    double salary;
    public Employee(String name,String designation,int id,double salary){
        this.name=name;
        this.designation=designation;
        this.id=id;
        this.salary=salary;
    }

    void updateSalary(double newSalary){
        salary+=newSalary;
    }
    double getSalary(){
        return salary;
    }
    void display(){
        System.out.println(name+" "+designation+" "+id+" "+salary);
    }

}
public class UapHr {
    public static void main(String[] args) {
        Employee emp=new Employee("Emon","Assistant Teacher",18201046,25000.0f);
        emp.getSalary();
        System.out.println("Now salary: "+emp.getSalary());
        emp.updateSalary(5000f);
        emp.display();
    }
}
