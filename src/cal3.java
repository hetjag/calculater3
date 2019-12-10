public class cal3 {
    int j = 30;  // instance variable
    static int b = 40;  // declared inside the class and outside the methods - with static keyword--> class/static variable
    static int d = 20;
    //No return type - No parameters INSTANCE method
    public void m1() {
        System.out.println(j);
        System.out.println(b);
    }
    // No return type - No parameters STATIC Method
    public static void addition() {
        //System.out.println(a); // Non-static field 'a' can not be referenced from staticc context
        int c = 100;  //  local variable - declared inside the method
        System.out.print("Addition of " + c + " and " + b + " = ");
        System.out.println(c + b);

    }
    // No return type - with parameters STATIC \method
    public static void subtraction(int l, int m) {
        System.out.print("subtraction of " + l + " and " + m + " = ");
        System.out.println(l - m);
        System.out.println("subtraction of "+b+ " and "+  d  + " = " + (b-d));
    }
    public static void division(double n, double o) {
        System.out.print("division of " + n + " and " + o + " = ");
        System.out.println(n / o);
    }
    // No return type - wth parameters STATIC Method
    public static void multiplication(int d) {
        System.out.print("multiplication of " + d + " and " + b + " = ");
        System.out.println(d * b);
    }
    //main method
    public static void main(String[] args) {
        String company = "TFL"; //local variable - declared inside the method
        System.out.println(company);
        subtraction(20, 10);
        subtraction(100, 300);
        addition();
        subtraction(100, 60);
        multiplication(d * b);
        division(80.0, 40.0);
        System.out.println(b);
    }
}
