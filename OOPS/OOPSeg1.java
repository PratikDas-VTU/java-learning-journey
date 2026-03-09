class Student {
   String name;
   int age;
  
   public void getInfo() {
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
   }
}


public class OOPSeg1 {
   public static void main(String args[]) {
       StudentSuper s1 = new StudentSuper();
       s1.name = "Aman";
       s1.age = 24;
       s1.getInfo();


       StudentSuper s2 = new StudentSuper();
       s2.name = "Shradha";
       s2.age = 22;
       s2.getInfo();
   }
}
