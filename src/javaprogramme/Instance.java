package javaprogramme;

public class Instance{

    /**
     * 1. Write a Java programme using the following steps.
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme
     */

    int c = 10;
    String name = "Chintan Zaveri";

    public static void main(String[] args){
        Instance obj = new Instance();
        System.out.println(obj.c);
        System.out.println(obj.name);

    }

    public void myMethod(){
        Instance a = new Instance();
        System.out.println(a.name);
    }


}
