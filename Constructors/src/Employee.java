public class Employee extends Object{
    String name;
    int age;
    int salary;
    void work(){
        System.out.println("Emp " + name + " with salary " + salary + " is working. He age is "+ age);
    }
    public Employee(){
        super();
    }
}
