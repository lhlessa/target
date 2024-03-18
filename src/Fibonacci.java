public class Fibonacci {

    public static String verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;
        
        while (a <= numero) {
            if (a == numero) {
                return "O número pertence a sequência de Fibonacci"; 
            }
            
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        
        return "O número não pertence à sequência de Fibonacci"; 
    }
}
