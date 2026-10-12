public class CopyConstructor {
    String name;
    int age;
    String gender;
    int marks;
    public CopyConstructor(String name, String gender,int age,int marks){
        this.name=name;
        this.marks=marks;
        this.age= age;
        this.gender=gender;
    }
    public CopyConstructor(CopyConstructor ref) {
        this.name = ref.name;
        this.age= ref.age;
        this.gender= ref.gender;
        this.marks = ref.marks;
    }
}
class CopyApp{
    public static void main(String[] args) {
        CopyConstructor c = new CopyConstructor("Uday","male",24,100);
        System.out.println(c.name + " " + c.age + " " + c.gender + " "+ c.marks );
        CopyConstructor s = new CopyConstructor(c);
        c.name= "Venkat";
        c.age = 25;
        c.gender = "male";
       c.marks = 99;
        System.out.println(c.name + " " + c.age + " " + c.gender + " "+ c.marks );

        System.out.println(s.name + " " +s.age + " " + s.gender + " "+ s.marks );

    }
}
