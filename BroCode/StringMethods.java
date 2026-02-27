public class StringMethods {
    public static void main(String[] args) {
        
        String name = "Pratik Das";

        System.out.println(name.length()); // length of the string starts counting from 1
        
        System.out.println(name.charAt(0)); // output a character at given index (Indexing from 0)

        System.out.println(name.indexOf("t")); // find the first occurace of a given character and return the index value

        System.out.println(name.lastIndexOf("a")); // find the last occurace of a given character and return the index value
        
        System.out.println(name.toUpperCase()); // converting the full string into upper case

        System.out.println(name.toLowerCase()); // converting the full string into lower case

        System.out.println(name.trim()); // remove white spaces

        System.out.println(name.replace("a","o")); // replacing a character with reqired

        System.out.println(name.isEmpty()); // to find whether the string is empty ( Boolean Output )

        System.out.println(name.contains("t")); // boolean output if a string contain the required condition


        System.out.println(name.equals("pratik das")); // to check whether two strings are equal (( SAME CHARACTERS ) (BUT CASE SENSITIVE)) ( Boolean Output )

        System.out.println(name.equalsIgnoreCase("pratik das")); // ignores CASE SENSITIVITY ( Boolean Output )
          
    }
}
