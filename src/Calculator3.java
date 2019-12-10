public class Calculator3 {
     // No return type - With parameters Method
    public static void addition(int k, int l) {
        System.out.println("Addition of " + k + " and " + l + " = " + (k + l));
    }
    // No return type - With parameters Method
    public static void subtraction(int m, int n) {
        System.out.println("subtraction of " + m + " and " + n + " = " + (m - n));
    }

        // No return type - With parameters Method
    public static void multiplication(int o, int p){
        System.out.println("multiplication of " +o+ " and " +p+ " = " + (o*p));
    }

    // No return type - With parameters Method
    public static void division(double g, double t){
        System.out.println("division of " +g+ " and " +t+ " = " + (g/t) );
    }
   // Main method
public static void main(String[] args){

        addition(30, 40); //static method 'addition(parameter value) can come direct in static main method area
        subtraction(50, -60);//static method 'subtraction(parameter value) can come direct in static main method area
        multiplication(30, 30);//static method 'multiplication(parameter value) can come direct in static main method area
        division(20.0, 17.0);//static method 'division(parameter value) can come direct in static main method area

}








}


