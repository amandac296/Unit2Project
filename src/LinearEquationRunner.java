import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //User input
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        //finding where to get the x and y values for coordinate 1
        int comma1 = coordinate1.indexOf(",");
        int end1 = coordinate1.indexOf(")");
        String xVal1 = coordinate1.substring(1, comma1);
        String yVal1 = coordinate1.substring(comma1 + 2, end1);
        //parsing
        int xValue1 = Integer.parseInt(xVal1);
        int yValue1 = Integer.parseInt(yVal1);
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        //finding where to get the x and y values for coordinate 2
        int comma2 = coordinate2.indexOf(",");
        int end2 = coordinate2.indexOf(")");
        String xVal2 = coordinate2.substring(1, comma2);
        String yVal2 = coordinate2.substring(comma2 + 2, end2);
        //parsing
        int xValue2 = Integer.parseInt(xVal2);
        int yValue2 = Integer.parseInt(yVal2);
        System.out.println();

        //print calculator info
        LinearEquation calc = new LinearEquation(xValue1, yValue1, xValue2, yValue2);
        if (xValue1 == xValue2) {
            //vertical line
            System.out.println("These points are on a vertical line: x = " + xValue1);
        } else {
            //line
            System.out.println(calc.lineInfo());
            System.out.println();
            //point on the line
            System.out.print("Enter a value for x: ");
            double value = scan.nextDouble();
            System.out.println();
            System.out.println(calc.coordinateForX(value));
        }
    }
}


