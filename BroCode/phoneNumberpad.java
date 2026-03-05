
public class phoneNumberpad {
    public static void main(String[] args) {
        
        char[][] telephone = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};

        for(char[] numbers : telephone){
            for(char number : numbers){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
