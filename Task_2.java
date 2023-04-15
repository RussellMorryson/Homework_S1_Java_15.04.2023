
/* Вывести все простые числа от 1 до 1000 */
public class Task_2 {
    public static void main(String[] args)
    {
        int N = 1000; 
        int x, y, z;         
        for (x = 1; x <= N; x++) {  
            if (x == 1 || x == 0)
                continue;
            z = 1;  
            for (y = 2; y <= x / 2; y++) {
                 if (x % y == 0) {
                     z = 0;
                     break;
                 }
             }
             if (z == 1) System.out.print(x + " ");
        }
    }
}
