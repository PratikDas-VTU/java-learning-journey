public class varArgs {
    public static void main(String[] args) {

        /* varargs = allow a method to accept a varying number of arguments
                    makes method more flexible , no need for overloaded methods
                    java will pack the arguments into an array 
                    ... (ellicipsis) 
         */
        System.out.println("Adding: "+ add(1,2,3,4));
        System.out.println("Average: "+avg(1,2,3,4));
        
    }
    
    // Variable Arguments

    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }

    static double avg(double... numbers){
        double sum = 0;
        double avg = 0;

        if(numbers.length ==0){
            return  0;
        }

        for(double number : numbers){
            sum += number;
        }
        avg = (sum)/numbers.length;
        return avg;
    }
    
}
