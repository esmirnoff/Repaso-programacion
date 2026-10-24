import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("EJERCICIOS");
            System.out.println("1. Unir dos textos");
            System.out.println("2. Saludo con nombre");
            System.out.println("3. Elevar numero al cuadrado");
            System.out.println("4. Sumar dos numeros");
            System.out.println("5. Operaciones basicas");
            System.out.println("6. Separar parte entera y decimal");
            System.out.println("7. Promedio de 5 notas");
            System.out.println("8. Calcular IVA");
            System.out.println("9. Area y perimetro de un circulo");
            System.out.println("10. Area de un hexagono");
            System.out.println("11. Promedio de n numeros");
            System.out.println("12. Distancia entre dos puntos");
            System.out.println("13. Generar n, nn, nnn y la suma");
            System.out.println("14. Convertir segundos en formato HH:MM:SS");
            System.out.println("15. Determinar si un numero es par o impar");
            System.out.println("16. Determinar si un numero es negativo o positivo");
            System.out.println("17. Descuento a ventas mayores de 150000");
            System.out.println("18. Mensaje segun promedio");
            System.out.println("0. Salir");
            System.out.print("Ingresa el numero del ejercicio que quieres probar: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    unirTextos(teclado);
                    break;
                case 2:
                    saludo(teclado);
                    break;
                case 3:
                    cuadrado(teclado);
                    break;
                case 4:
                    sumaNumeros(teclado);
                    break;
                case 5:
                    operaciones(teclado);
                    break;
                case 6:
                    enteroDecimal(teclado);
                    break;
                case 7:
                    calcularPromedioNotas(teclado);
                    break;
                case 8:
                    calcularIVA(teclado);
                    break;
                case 9:
                    areaPerimetro(teclado);
                    break;
                case 10:
                    areaHexagono(teclado);
                    break;
                case 11:
                    promN(teclado);
                    break;
                case 12:
                    distanciaCoordenadas(teclado);
                    break;
                case 13:
                    ejercicio13(teclado);
                    break;
                case 14:
                    conversionSegundos(teclado);
                    break;
                case 15:
                    esPar(teclado);
                    break;
                case 16:
                    esPositivo(teclado);
                    break;
                case 17:
                    descuentoVentas(teclado);
                    break;
                case 18:
                    mensajePromedio(teclado);
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    public static void unirTextos(Scanner teclado) {
        System.out.println("1. ");
        System.out.print("Escribe el primer texto: ");
        String frase1 = teclado.nextLine();
        System.out.print("Escribe el segundo texto: ");
        String frase2 = teclado.nextLine();
        System.out.println(frase1 + " " + frase2);
    }

    public static void saludo(Scanner teclado) {
        System.out.println("2. ");
        System.out.print("Escribe tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre + ", tu nombre es: " + nombre);
    }

    public static void cuadrado(Scanner teclado) {
        System.out.println("3. ");
        System.out.print("Escribe un numero: ");
        double num = teclado.nextDouble();
        double result = num * num;
        System.out.println( num+ "^2 = "+ result);
    }

    public static void sumaNumeros(Scanner teclado) {
        System.out.println("4. ");
        System.out.print("Escriba su primer numero: ");
        double num1 = teclado.nextDouble();
        System.out.print("Escriba su segundo numero: ");
        double num2 = teclado.nextDouble();
        teclado.nextLine();
        double sumar = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sumar);
    }

    public static void operaciones(Scanner teclado) {
        System.out.println("5. ");
        System.out.print("Escriba el primer numero: ");
        double n1 = teclado.nextDouble();
        System.out.print("Escriba el segundo numero: ");
        double n2 = teclado.nextDouble();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        if (n2 == 0) {
            System.out.println(n1 + " / " + n2 + " = Error ");
            System.out.println("Residuo: Error ");
        } else {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            System.out.println("Residuo: " + (n1 % n2));
        }

    }

    public static void enteroDecimal(Scanner teclado) {
        System.out.println("6. ");
        System.out.print("Escribe un numero decimal: ");
        double number = teclado.nextDouble();
        long pEntera = (long) number;
        double decimal = number - pEntera;
        System.out.println("Parte entera: " + pEntera);
        System.out.println("Parte decimal: " + decimal);
    }

    public static double calcularPromedio(double n1, double n2, double n3, double n4, double n5){
        return (n1*0.15)+(n2*0.2)+(n3*0.15)+(n4*0.3)+(n5*0.2);
    }

    public static void calcularPromedioNotas(Scanner teclado) {
        System.out.println("7. ");
        System.out.println("Primera nota:");
        double nota1 = teclado.nextDouble();
        System.out.println("Segunda nota:");
        double nota2 = teclado.nextDouble();
        System.out.println("Tercer nota:");
        double nota3 = teclado.nextDouble();
        System.out.println("Cuarta nota:");
        double nota4 = teclado.nextDouble();
        System.out.println("Quinta nota:");
        double nota5 = teclado.nextDouble();
        double prom = calcularPromedio(nota1, nota2, nota3, nota4, nota5);
        System.out.println("Promedio: "+prom);
    }

    public static double obtenerIva(double precio) {
        return precio * 0.190;
    }

    public static void calcularIVA(Scanner teclado) {
        System.out.println("8.");
        System.out.println("Escriba el precio bruto del producto:");
        double producto = teclado.nextDouble();
        double iva = obtenerIva(producto);
        System.out.println("IVA: "+iva);
        System.out.println("Precio final:"+ (producto + iva));
    }

    public static void areaPerimetro(Scanner teclado) {
        System.out.println("9.");
        System.out.println("Escriba el radio de el circulo:");
        double radio = teclado.nextDouble();
        double area = Math.PI * radio*radio;
        System.out.println("Area:"+ area);
        double perimetro = Math.PI * radio * 2;
        System.out.println("Perimetro: "+ perimetro);
    }

    public static void areaHexagono(Scanner teclado) {
        System.out.println("10.");
        System.out.println("Escriba el lado del hexagono:");
        double lado = teclado.nextDouble();
        double k = (3*Math.sqrt(3))/2;
        double area = k*lado*lado;
        System.out.println("Area:"+ area);
    }

    public static void promN(Scanner teclado) {
        System.out.println("11.");
        System.out.println("Digite el valor de n: ");
        double n = teclado.nextDouble();
        double valorI = 0;
        int contador = 0;
        while (n != contador) {
            contador++;
            System.out.println("Digite el "+contador+" valor: ");
            double nValor = teclado.nextDouble();
            valorI += nValor;
        }
        System.out.println("Promedio: "+(valorI/contador));
    }

    public static void distanciaCoordenadas(Scanner teclado) {
        System.out.println("12. ");
        System.out.print("Digita valor de x1: ");
        double x1 = teclado.nextDouble();
        System.out.print("Digita valor de y1: ");
        double y1 = teclado.nextDouble();
        System.out.print("Digita valor de x2: ");
        double x2 = teclado.nextDouble();
        System.out.print("Digita el valor de y2: ");
        double y2 = teclado.nextDouble();
        double x = x2 - x1;
        double y = y2 - y1;
        double distancia = Math.sqrt(x*x + y*y);
        System.out.println("La distancia entre las coordenadas es: " + distancia);
    }

    public static void ejercicio13(Scanner teclado) {
        System.out.println("13. ");
        System.out.println("Digite n (Un solo digito): ");
        int n = teclado.nextInt();
        if (n >= 10 || n <= -10){
            System.out.println("Invalido, mas de un digito");
        }else {
            System.out.println( n+", "+(n*11)+ ", "+(n*111));
            System.out.println("Suma: "+ (n+(n*11)+(n*111)));
        }
    }

    public static void conversionSegundos(Scanner teclado) {
        System.out.println("14.");
        System.out.println("Digite la cantidad de segundos: ");
        int segundo = teclado.nextInt();
        int horas = segundo/3600;
        String HH = String.format("%02d", horas);
        int minutos = (segundo % 3600) / 60;
        String MM = String.format("%02d", minutos);
        int seg = segundo % 60;
        String SS = String.format("%02d", seg);
        System.out.println(HH+":"+MM+":"+SS);
    }

    public static void esPar(Scanner teclado) {
        System.out.println("15.");
        System.out.println("Escribe un numero: ");
        double numero = teclado.nextDouble();
        if (numero % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }

    public static void esPositivo(Scanner teclado) {
        System.out.println("16.");
        System.out.println("Escribe un numero:");
        double numero = teclado.nextDouble();
        if (numero < 0) {
            System.out.println("Negativo");
        }else {
            System.out.println("Positivo");
        }
    }

    public static void descuentoVentas(Scanner teclado) {
        System.out.println("17.");
        System.out.println("Escribe el precio de el producto:");
        double precio = teclado.nextDouble();
        double iva = obtenerIva(precio);
        System.out.println("IVA: "+iva);
        double precioFin = precio + iva;
        if (precioFin>150000) {
            System.out.println("Descuento del 5% aplicado");
            double descPrecio = precioFin * 0.95;
            System.out.println("Total: "+descPrecio);
        }else {
            System.out.println("Total: "+precioFin);
        }
    }

    public static void mensajePromedio(Scanner teclado) {
        System.out.println("18. ");
        System.out.println("Primera nota:");
        double nota1 = teclado.nextDouble();
        System.out.println("Segunda nota:");
        double nota2 = teclado.nextDouble();
        System.out.println("Tercer nota:");
        double nota3 = teclado.nextDouble();
        System.out.println("Cuarta nota:");
        double nota4 = teclado.nextDouble();
        System.out.println("Quinta nota:");
        double nota5 = teclado.nextDouble();
        double prom = calcularPromedio(nota1, nota2, nota3, nota4, nota5);
        System.out.println("Promedio: "+prom);
        if (prom<2.0) {
            System.out.println("Lamentablemente su promedio le impide poder habilitar");
        }
        if (prom>= 2.0 && prom < 3.0) {
            System.out.println("Reprobado, debe habilitar");
        }
        if (prom >= 3.0) {
            System.out.println("Aprovado");
        }
        if (prom > 4.5){
            System.out.println("Felicidades, obtuvo un promedio superior, esperamos que pueda seguir con los valores y capacidades que lo han distinguido/a en este periodo de aprendizaje");
        }
    }
}