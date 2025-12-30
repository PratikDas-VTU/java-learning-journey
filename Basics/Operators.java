public class Operators {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int add = a + b;

        // Arithmetic operators
        System.out.println("Arithmetic operators");
        System.out.println(a + 20); // second method
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println("a==b: " + (a == b));
        System.out.println("a!=b: " + (a != b));
        System.out.println("a<b: " + (a < b));
        System.out.println("a>b: " + (a > b));
        System.out.println("a<=b: " + (a <= b));
        System.out.println("a>=b: " + (a >= b));

        // Logical operators
        System.out.println("Logical Operators");
        int c = 15;
        System.out.println("a<b && a<c: " + (a < b && a < c));
        System.out.println("a>b || a<c: " + (a > b || a < c));
        System.out.println("!(a<b): " + (!(a < b)));

        // Assignment Operators
        System.out.println("Assignment Operators");
        int x = 10;
        System.out.println("x = " + x);
        x += 5;
        System.out.println("x+=5: " + x);
        x -= 3;
        System.out.println("x-=3: " + x);
        x *= 2;
        System.out.println("x*=2: " + x);
        x /= 2;
        System.out.println("x/=2: " + x);
        x %= 3;
        System.out.println("x%=3: " + x);

        // Bitwise operators
        System.out.println("Bitwise operators");
        System.out.println("a&b: " + (a & b));
        System.out.println("a|b: " + (a | b));
        System.out.println("a^b: " + (a ^ b));
        System.out.println("~a: " + (~a));

        // Shift operators
        System.out.println("Shift operators");
        System.out.println("a<<1: " + (a << 1));
        System.out.println("a>>1: " + (a >> 1));
        System.out.println("a>>>1: " + (a >>> 1));

        // Unary Operators
        System.out.println("Unary Operators");
        System.out.println("Unary minus: " + -a);
        System.out.println("Pre Increment(++a): " + (++a));
        System.out.println("Post Increment(a++): " + (a++));
        System.out.println("After Post Increment a: " + a);
        System.out.println("Pre Decrement(--a): " + (--a));
        System.out.println("Post Decrement(a--): " + (a--));
        System.out.println("After Post Decrement a: " + a);
        
        // Ternary Operator
        System.out.println("Ternary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Max value: " + max);
    }
}
