package javaprogramme;

public class TwoInstaStatic {
    /**4. Write a Java programme using the following steps.
     4.1 Declare two instance and two static variables.
     4.2 Declare one instance method.
     4.3 Declare one static method.
     4.4 Call all four instance and static variables into both instance and static methods inside the
     print statement.
     4.5 Declare the Main method.
     4.6 Call both instance and static methods into the Main method and run the programme.
     */
    int a = 10;
    int b = 20;
    static int x = 30;
    static int y = 40;

    public static void main(String[] args){
        TwoInstaStatic obj = new TwoInstaStatic();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(x);
        System.out.println(y);
    }
    public void m1(){
        System.out.print(x + y);
    }

}
