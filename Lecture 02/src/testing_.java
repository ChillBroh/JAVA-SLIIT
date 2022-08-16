

class Persons{
    void method(){
        System.out.println("Person");
    }
}
class Emp extends Persons{
    void method(){
        System.out.println("Employee");
    }
}
public class testing_ {
    public static void main(String []args) {
      Persons p1 = new Emp();
      p1.method();
      
      Emp e1 = new Emp();
      e1.method();
      e1.method();
    }
}
