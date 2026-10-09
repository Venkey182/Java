public class StudentShadowing {
    String name;
    int age;
    int marks;
    //shodowing user default parameterized constuctor
//   public StudentShadowing(String name,int age,int marks){
//        name= name;
//        age = age;
//        marks = marks;
//    }

    public StudentShadowing(String name,int age,int marks){
       this.name= name;
      this.age = age;
       this.marks = marks;
    }
    void eat(){
        System.out.println(name + " Student eating food");

    }
    void sleep(){
        System.out.println(name + " Student sleep");

    }

    public static void main(String[] args) {
      StudentShadowing ss = new StudentShadowing("venkat",25,99);
      ss.eat();
      ss.sleep();
    }
}
