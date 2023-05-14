package javaprogramme;

public class InstaStatic {
    /** 3. Write a Java programme using the following steps.
     3.1 Declare one instance and one static variable.
     3.2 Declare one instance method.
     3.3 Declare one static method.
     3.4 Call both instance and static variables into both instance and static methods inside the
     print statement.
     3.5 Declare the Main method.
     3.6 Call both instance and static methods into the Main method and run the programme.
     */

    int a = 10;
    static int b = 20;

    public static void main(String[] args){
        InstaStatic obj = new InstaStatic();
        System.out.println(obj.a);
        System.out.println(b);
    }
   public void myMethod(){
        InstaStatic x = new InstaStatic();
        System.out.println(x);
   }
   public void m1(){
        System.out.println(b);
   }


}
