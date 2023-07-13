package SintaxeJava.AnatomiaDeClasses;

public class Myclass {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String firstName = "Matheus";
        String secondName = "Vilela";
        String fullName = fullName(firstName,secondName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String secondName) {
        return "My full name is: " + firstName.concat(" ").concat(secondName);
    }
}