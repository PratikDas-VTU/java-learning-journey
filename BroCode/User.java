public class User {

    String username;
    String email;
    int age;

    User() {
        this.username = "Guest";
        this.email = "NotProvided";
        this.age = 0;
    }

    User(String U1name) {
        this.username = U1name;
        this.email = "Not provided";
        this.age = 0;
    }

    User(String U2name, String email) {
        this.username = U2name;
        this.email = email;
        this.age = 0;
    }

    User(String U3name, String email, int age) {
        this.username = U3name;
        this.email = email;
        this.age = age;
    }
}
