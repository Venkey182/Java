public class EmpParameterized {
    
        String name;
        int age;
        public EmpParameterized(){      //This constructor calling default when inherited so super method call parent
            this.name="Happy";
            this.age=55;
        }
        public EmpParameterized(String name){ // not used when pass parameter based
            this.name=name;
            this.age=45;
        }
        public EmpParameterized(int age){
            this.age=age;
        }
        public EmpParameterized(String name, int age){
            this.name=name;
            this.age=age;
        }
    }
    class worker1 extends EmpParameterized {
        int salary;
        int rating;
        public worker1(){
            this.salary=10000;
            this.rating=3;
        }
        public worker1(int salary){ //JVM comes default super() method calling parent class but not inherited constructor
            this.salary=salary;
            this.rating=4;
        }
        public worker1(int salary, int rating){
            this.salary=salary;
            this.rating=rating;
        }
    }
    class EmpApp1{
        public static void main(String[] args) {
            worker1 w =new worker1(50000); // we're passing  parameterized so call  parameter constructor
            System.out.println((w.name));
            System.out.println((w.age));
            System.out.println(w.rating);
            System.out.println((w.salary));


        }
    }


