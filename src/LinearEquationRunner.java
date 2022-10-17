import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //User input
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        System.out.println();

        //finding info based on coordinates
        /*System.out.println("The two points are: " + coordinate1 + coordinate2);
        LinearEquation line = new LinearEquation(coordinate1, coordinate2);
        System.out.println("The equation of the line between these points is: " + line.equation());
        System.out.println("The slope of this line is: " + line.slope());
        System.out.println("The y-intercept of the line is: " + line.yIntercept());
        System.out.println("The distance between the two points is: " + line.distance());
        System.out.println();

        //LinearEquation testing
        System.out.println("Enter a value for x: " );
        int xValue = scan.nextInt();
        System.out.println("The point on the line " ); //something// */
    }
}
