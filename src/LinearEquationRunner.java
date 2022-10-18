import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        //User input
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        int stringAsInt = Integer.parseInt(coordinate1);
        System.out.println("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        System.out.println();

        LinearEquation calc = new LinearEquation();
        System.out.println(calc.lineInfo());

        //LinearEquation testing
        System.out.println("Enter a value for x: " );
        int xValue = scan.nextInt();
        System.out.println("The point on the line " ); //something//
    }
} */

        int x1 = -1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 10;
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));
    }
}

