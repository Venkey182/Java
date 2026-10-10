 class EmpChaining {
    String name;
    int age;
    public EmpChaining(){      //This constructor calling default when inherited so super method call parent
        this.name="venkat";
        this.age=25;
    }
    public EmpChaining(String name){ // not used when pass parameter based
        this.name=name;
        this.age=45;
    }
    public EmpChaining(int age){
        this.age=age;
    }
    public EmpChaining(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class worker extends EmpChaining{
    int salary;
    int rating;
    public worker(){  //JVM comes default super() method calling parent class but not inherited constructor
        this.salary=10000;
        this.rating=3;
    }
    public worker(int salary){
        this.salary=salary;
        this.rating=4;
    }
    public worker(int salary, int rating){
        this.salary=salary;
        this.rating=rating;
    }
}
 class EmpAppl{
     public static void main(String[] args) {
         worker w =new worker(); // we're passing zero parameterized so call zero parameter constructor
         System.out.println((w.name));
         System.out.println((w.age));
         System.out.println(w.rating);
         System.out.println((w.salary));


     }
}
