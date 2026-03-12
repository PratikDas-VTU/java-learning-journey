public class anonymousClass {
    public static void main(String[] args) {
        

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        // Add custom behavior without having to create a new class.
        // Often used for one time uses (TimerTask, Runnable, callbacks)

        dogAC dog1 = new dogAC();
        dogAC dog2 = new dogAC(){
            @Override
            void speak(){
                System.out.println("Puppy goes wuff wuff !!");
            }
        };
        

        dog1.speak();
        dog2.speak();

    }
}
