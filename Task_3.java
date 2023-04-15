import java.util.Scanner;

/* Реализовать простой калькулятор */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Простой калькулятор!");
        
        int accept = 1;
        while (accept==1) {
            System.out.println("Введите число А: ");
            double a = scan.nextDouble();
            
            System.out.println("Введите знак операции: ( + - * / )");
            String symbol = scan.next();
            
            System.out.println("Введите число В: ");
            double b = scan.nextDouble();
            
            
            switch (symbol) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Операция невозможна!");
                    break;
            }
            System.out.println("Желаете произвести расчеты с другими числами? ");
            System.out.println("Нажмите (y) для нового расчета.");
            System.out.println("Нажмите любую клавишу для выхода.");

            String retry = scan.next();
            char r = retry.charAt(0);
            
            if (r != 'y') {
                accept = 0;                
            }
        }
    }
}
