public class SuperKeyword {
    String name = "Raja";
    void eat(){
        System.out.println(name + " is eating");
    }
}
class lion extends SuperKeyword{
    String name = "Lion";

    @Override
    void eat() {
        super.eat();//it's call parent method
        System.out.println(name + " is eating meat");
    }
    void display(){
        System.out.println(super.name);//it's call the parent name
        System.out.println(name);
    }
}
class App{
    public static void main(String[] args) {
        lion l = new lion();
        l.eat();
        l.display();
    }
}

