import java.util.Scanner;

public class BasicCalculator {
  public static void main(String[] args) {
    double num1, num2, result;
    char operator;
    
    try (Scanner input = new Scanner(System.in)) {

      System.out.println("Choose an operator: +, -, *, or /");
      operator = input.next().charAt(0);

      System.out.println("Enter first number:");
      num1 = input.nextDouble();

      System.out.println("Enter second number:");
      num2 = input.nextDouble();

      switch (operator) {
        case '+' -> result = num1 + num2;
        case '-' -> result = num1 - num2;
        case '*' -> result = num1 * num2;
        case '/' -> result = num1 / num2;
        default -> {
          System.out.println("Invalid operator!");
          return;
        }
      }

      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
  }
}
 
