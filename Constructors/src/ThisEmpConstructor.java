public class ThisEmpConstructor {

    String name;
    int age;
    public ThisEmpConstructor(){
        this.name="Omkar";
        this.age=15;
    }
    public ThisEmpConstructor(String name){ // not used when pass parameter based
        this.name=name;
        this.age=45;
    }
    public ThisEmpConstructor(int age){
        this.age=age;
    }
    public ThisEmpConstructor(String name, int age){//This constructor calling when inherited so super method have two parameters call parent
        this.name=name;
        this.age=age;
    }
}
class worker3 extends ThisEmpConstructor {
    int salary;
    int rating;
    public worker3(){ //this reference call now again super calls parent
        this.salary=10000;
        this.rating=3;
    }
    public worker3(int salary){//JVM comes default super() method calling parent class but not inherited constructor
        this();// JVM see this method not to call super now it's call same class default constructor
        this.salary=salary;
        this.rating=4;
    }
    public worker3(int salary, int rating){
        this.salary=salary;
        this.rating=rating;
    }
}
class EmpApp3{
    public static void main(String[] args) {
        worker3 w =new worker3(50000); // we're passing  parameterized so call  parameter constructor
        System.out.println((w.name));
        System.out.println((w.age));
        System.out.println(w.rating);
        System.out.println((w.salary));


    }
}


