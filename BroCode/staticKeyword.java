
public class staticKeyword {
    public static void main(String[] args) {
        // static = Makes a variable or method belong to the class
        //   rather than to any specific object.
        //   Commonly used for utility methods or shared resources.


        Friend friend1 = new Friend("Lakshya");
        Friend friend2 = new Friend("Das");
        Friend friend3 = new Friend("Pratik");
        Friend friend4 = new Friend("Rehan");
        Friend friend5 = new Friend("Bharani");

        // System.out.println(Friend.numOfFriends);
        Friend.showFriends();
        
    }
}
