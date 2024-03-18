
public class App {
    public static void main(String[] args) throws Exception {
        String invertida = Reverse.reverseText("Hello world");
        System.out.println(invertida);

        String resultado = Fibonacci.verificarFibonacci(100);
        System.out.println(resultado);
        resultado = Fibonacci.verificarFibonacci(233);
        System.out.println(resultado);
    }
}
