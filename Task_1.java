import java.util.Scanner;

/*Вычислить n-ое 
треугольного число (сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n) */

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;            
        }
        System.out.println(result);        
    }
}
