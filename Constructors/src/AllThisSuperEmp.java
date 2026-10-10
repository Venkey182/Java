public class AllThisSuperEmp {

    String name;
    int age;
    public AllThisSuperEmp(){//11
        this(25);//12
        this.name="Omkar";
        this.age=15;
    }
    public AllThisSuperEmp(String name){//9
        this();//10
        this.name=name;
        this.age=45;
    }
    public AllThisSuperEmp(int age){//13
        //14
        this.age=age;
    }
    public AllThisSuperEmp(String name, int age){//7
        this("Anil");//8
        this.name=name;
        this.age=age;                                                   //calling numbering 1-14
    }
}
class worker4 extends AllThisSuperEmp {
    int salary;
    int rating;
    public worker4(){//5
        super("Uday",2000);//6
        this.salary=10000;
        this.rating=3;
    }
    public worker4(int salary){//3
        this();//4
        this.salary=salary;
        this.rating=4;
    }
    public worker4(int salary, int rating){//1
        this(60000);//2
        this.salary=salary;
        this.rating=rating;
    }
}
class EmpApp4{
    public static void main(String[] args) {
        worker4 w =new worker4(50000,5); // we're passing  parameterized so call  parameter constructor
        System.out.println((w.name));
        System.out.println((w.age));
        System.out.println(w.rating);
        System.out.println((w.salary));


    }
}


