public class EmSuperParameterized {

    String name;
    int age;
    public EmSuperParameterized(){
        this.name="Happy";
        this.age=55;
    }
    public EmSuperParameterized(String name){ // not used when pass parameter based
        this.name=name;
        this.age=45;
    }
    public EmSuperParameterized(int age){
        this.age=age;
    }
    public EmSuperParameterized(String name, int age){//This constructor calling when inherited so super method have two parameters call parent
        this.name=name;
        this.age=age;
    }
}
class worker2 extends EmSuperParameterized {
    int salary;
    int rating;
    public worker2(){
        this.salary=10000;
        this.rating=3;
    }
    public worker2(int salary){//JVM comes default super() method calling parent class but not inherited constructor
        super("Prasad", 4000);
        this.salary=salary;
        this.rating=4;
    }
    public worker2(int salary, int rating){
        this.salary=salary;
        this.rating=rating;
    }
}
class EmpApp2{
    public static void main(String[] args) {
        worker2 w =new worker2(50000); // we're passing  parameterized so call  parameter constructor
        System.out.println((w.name));
        System.out.println((w.age));
        System.out.println(w.rating);
        System.out.println((w.salary));


    }
}


