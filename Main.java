import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. ");
        System.out.println("Escribe el primer texto: ");
        String frase1 = teclado.nextLine();
        System.out.println("Escribe el segundo texto: ");
        String frase2 = teclado.nextLine();
        System.out.println(frase1+" "+frase2);

        System.out.println("2. ");
        System.out.println("Escribe tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Hola "+nombre+", tu nombre es: "+nombre);

        System.out.println("3. ");
        System.out.println("Escribe un numero: ");
        double num = teclado.nextDouble();
        double cuadrado = num*num;
        System.out.println("("+num+")^2 = "+cuadrado);

        System.out.println("4. ");
        System.out.println("Escriba su primer numero: ");
        double num1 = teclado.nextDouble();
        System.out.println("Escriba su segundo numero: ");
        double num2 = teclado.nextDouble();
        double suma = num1+num2;
        System.out.println(num1+" + "+num2+" = "+suma);

        System.out.println("5. ");


        System.out.println("12. ");
        System.out.println("Digita valor de x1: ");
        double x1 = teclado.nextDouble();
        System.out.println("Digita valor de y1: ");
        double y1 = teclado.nextDouble();
        System.out.println("Digita valor de x2: ");
        double x2 = teclado.nextDouble();
        System.out.println("Digita el valor de y2: ");
        double y2 = teclado.nextDouble();
        double x = x2-x1;
        double y = y2-y1;
        double sum = (x*x)+(y*y);
        double fin = Math.sqrt(sum);
        System.out.println("La distancia entre las coordenadas es "+fin);
    }
}