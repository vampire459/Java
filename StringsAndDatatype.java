public class StringsAndDatatype {
    static int age = 21; // static is only used if variable declaration is outeside of main method
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("My age is :- \n" +"\t" +age);

        String normalString_1 = "Arnab";
        String normalString_2 = "Arnab";
        
        String ObjString_1 = new String("Arnab");  
        String ObjString_2 = new String("Arnab");   // in this case new is constructer creating an entrie new object of string 
                                                            //so that two string object's value will be different  

        System.out.println(normalString_1 == normalString_2);                // this will result true
        System.out.println(ObjString_1 == ObjString_2);                     // this will give true because it compares the objects
        System.out.println(ObjString_1.equalsIgnoreCase(ObjString_2));     // so that thiis will result true because it compares the strings

        String name = "Arnab";
        String DOB = "15.11.2002";
        
        System.out.println(String.format("My name is %s , I'm born on %s",name,DOB)); // here the string.format helps to print like c 
                                                                                            // or we can also print like python by just using +
        System.out.println(DOB.length());         // gives the lengths of the strings
        System.out.println(DOB.isEmpty());       // gives whther its empty or not
        System.out.println(name.toUpperCase()); // converts to upper case but does not change the varrible value
        
        String randomString = "The sky is blue";
        System.out.println(randomString.replace("blue","Blue")); // to change any word/string without changing the varrible value
        System.out.println(randomString.contains("sky")); // to check whether it contains something or not , it's a boolean
        
    }  
}
