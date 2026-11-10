import java.util.Locale;
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
            System.out.println("19. Resolver ecuacion cuadratica de tipo ax^2 + bx + c");
            System.out.println("20. Usuario y contraseña predeterminados");
            System.out.println("21. Escribir numero del 1 al 10");
            System.out.println("22. Digitos de numeros menores a 100000");
            System.out.println("23. Ver incremento en 3 numeros");
            System.out.println("24. Numero entre 1 y 7 para dia de la semana");
            System.out.println("25. Invertir un texto");
            System.out.println("26. Escribir en mayuscula las primeras letras de un texto");
            System.out.println("27. Escribir la penultima palabra de un texto");
            System.out.println("28. Verificar si un texto contiene al otro");
            System.out.println("29. Verificar si una palabra es un palindromo");
            System.out.println("30. Calcular el area de un poligono");
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
                    break;
                case 19:
                    resolverCuadratica(teclado);
                    break;
                case 20:
                    userContraseña(teclado);
                    break;
                case 21:
                    numberName(teclado);
                    break;
                case 22:
                    digitosNumero(teclado);
                    break;
                case 23:
                    incremento(teclado);
                    break;
                case 24:
                    diaSemana(teclado);
                    break;
                case 25:
                    invText(teclado);
                    break;
                case 26:
                    primerLetra(teclado);
                    break;
                case 27:
                    penUltim(teclado);
                    break;
                case 28:
                    contieneTexto(teclado);
                    break;
                case 29:
                    Palindromo(teclado);
                    break;
                case 30:
                    areaPoligono(teclado);
                    break;
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
        System.out.println(num + "^2 = " + result);
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

    public static double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return (n1 * 0.15) + (n2 * 0.2) + (n3 * 0.15) + (n4 * 0.3) + (n5 * 0.2);
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
        System.out.println("Promedio: " + prom);
    }

    public static double obtenerIva(double precio) {
        return precio * 0.190;
    }

    public static void calcularIVA(Scanner teclado) {
        System.out.println("8.");
        System.out.println("Escriba el precio bruto del producto:");
        double producto = teclado.nextDouble();
        double iva = obtenerIva(producto);
        System.out.println("IVA: " + iva);
        System.out.println("Precio final:" + (producto + iva));
    }

    public static void areaPerimetro(Scanner teclado) {
        System.out.println("9.");
        System.out.println("Escriba el radio de el circulo:");
        double radio = teclado.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("Area:" + area);
        double perimetro = Math.PI * radio * 2;
        System.out.println("Perimetro: " + perimetro);
    }

    public static void areaHexagono(Scanner teclado) {
        System.out.println("10.");
        System.out.println("Escriba el lado del hexagono:");
        double lado = teclado.nextDouble();
        double k = (3 * Math.sqrt(3)) / 2;
        double area = k * lado * lado;
        System.out.println("Area:" + area);
    }

    public static void promN(Scanner teclado) {
        System.out.println("11.");
        System.out.println("Digite el valor de n: ");
        double n = teclado.nextDouble();
        double valorI = 0;
        int contador = 0;
        while (n != contador) {
            contador++;
            System.out.println("Digite el " + contador + " valor: ");
            double nValor = teclado.nextDouble();
            valorI += nValor;
        }
        System.out.println("Promedio: " + (valorI / contador));
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
        double distancia = Math.sqrt(x * x + y * y);
        System.out.println("La distancia entre las coordenadas es: " + distancia);
    }

    public static void ejercicio13(Scanner teclado) {
        System.out.println("13. ");
        System.out.println("Digite n (Un solo digito): ");
        int n = teclado.nextInt();
        if (n >= 10 || n <= -10) {
            System.out.println("Invalido, mas de un digito");
        } else {
            System.out.println(n + ", " + (n * 11) + ", " + (n * 111));
            System.out.println("Suma: " + (n + (n * 11) + (n * 111)));
        }
    }

    public static void conversionSegundos(Scanner teclado) {
        System.out.println("14.");
        System.out.println("Digite la cantidad de segundos: ");
        int segundo = teclado.nextInt();
        int horas = segundo / 3600;
        String HH = String.format("%02d", horas);
        int minutos = (segundo % 3600) / 60;
        String MM = String.format("%02d", minutos);
        int seg = segundo % 60;
        String SS = String.format("%02d", seg);
        System.out.println(HH + ":" + MM + ":" + SS);
    }

    public static void esPar(Scanner teclado) {
        System.out.println("15.");
        System.out.println("Escribe un numero: ");
        double numero = teclado.nextDouble();
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    public static void esPositivo(Scanner teclado) {
        System.out.println("16.");
        System.out.println("Escribe un numero:");
        double numero = teclado.nextDouble();
        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }

    public static void descuentoVentas(Scanner teclado) {
        System.out.println("17.");
        System.out.println("Escribe el precio de el producto:");
        double precio = teclado.nextDouble();
        double iva = obtenerIva(precio);
        System.out.println("IVA: " + iva);
        double precioFin = precio + iva;
        if (precioFin > 150000) {
            System.out.println("Descuento del 5% aplicado");
            double descPrecio = precioFin * 0.95;
            System.out.println("Total: " + descPrecio);
        } else {
            System.out.println("Total: " + precioFin);
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
        System.out.println("Promedio: " + prom);
        if (prom < 2.0) {
            System.out.println("Lamentablemente su promedio le impide poder habilitar");
        }
        if (prom >= 2.0 && prom < 3.0) {
            System.out.println("Reprobado, debe habilitar");
        }
        if (prom >= 3.0) {
            System.out.println("Aprovado");
        }
        if (prom > 4.5) {
            System.out.println("Felicidades, obtuvo un promedio superior, esperamos que pueda seguir con los valores y capacidades que lo han distinguido/a en este periodo de aprendizaje");
        }
    }

    public static void resolverCuadratica(Scanner teclado) {
        System.out.println("19.");
        System.out.println("ax^2 + bx +c");
        System.out.println("Escribe el valor de a: ");
        double a = teclado.nextDouble();
        System.out.println("Escribe el valor de b:");
        double b = teclado.nextDouble();
        System.out.println("Escribe el valor de c:");
        double c = teclado.nextDouble();
        double d = (b * b) - (4 * a * c);
        if (d < 0) {
            double parteReal = -b / (2 * a);
            double parteImagi = Math.sqrt(-d / (2 * a));
            System.out.println("Raices complejas");
            System.out.println("x1 = " + parteReal + " + " + parteImagi + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImagi + "i");
        }
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("2 raices reales y diferentes");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if (d == 0) {
            System.out.println("Una raiz real o doble");
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        }
    }

    public static void userContraseña(Scanner teclado) {
        System.out.println("20.");
        System.out.println("Ingrese el usuario:");
        String usuario = teclado.next();
        while (!usuario.equalsIgnoreCase("martinelimpar")) {
            System.out.println("Usuario no encontrado");
            System.out.println("Ingrese el usuario: ");
            usuario = teclado.next();
        }
        System.out.println("Ingrese la contraseña");
        String password = teclado.next();
        while (!password.equalsIgnoreCase("martin123")) {
            System.out.println("Contraseña incorrecta, intenta de nuevo");
            password = teclado.next();
        }
        System.out.println("Accediendo a "+ usuario);
    }

    public static String obtenerNombreNumero (int numero) {
        switch (numero) {
            case 1:
                return "UNO";
            case 2:
               return "DOS";
            case 3:
                return"TRES";
            case 4:
                return"CUATRO";
            case 5:
                return"CINCO";
            case 6:
                return"SEIS";
            case 7:
                return"SIETE";
            case 8:
                return "OCHO";
            case 9:
                return"NUEVE";
            case 10:
                return"DIEZ";
            default:
                return "ERROR";
        }
    }

    public static void numberName(Scanner teclado) {
        System.out.println("21.");
        System.out.println("Ingrese un numero del 1 al 10");
        int numero = teclado.nextInt();
        if (numero >= 1 && numero <= 10) {
            String nombre = obtenerNombreNumero(numero);
            System.out.println(numero+ " ---> "+ nombre);
        }else {
            System.out.println("El numero no se encuentra dentro de lo establecido");
        }
    }

    public static void digitosNumero(Scanner teclado) {
        System.out.println("22.");
        System.out.println("Ingrese un numero del 1 a 100000");
        int numero = teclado.nextInt();
        if (numero >= 1 && numero <= 100000) {
            String cadena = String.valueOf(Math.abs(numero));
            int digito = cadena.length();
            System.out.println(numero+ " tiene "+digito+ " digitos");
        }else {
            System.out.println("El numero no se encuentra dentro de lo establecido");
        }
    }

    public static void incremento(Scanner teclado) {
        System.out.println("23.");
        System.out.println("Digite el primero numero");
        int n1 = teclado.nextInt();
        System.out.println("Digite el segundo numero");
        int n2 = teclado.nextInt();
        System.out.println("Digite el tercer numero");
        int n3 = teclado.nextInt();
        if (n1 < n2) {
            if (n2 < n3) {
                System.out.println("Incrementa");
            }
            if (n3 < n1 || n3 < n2) {
                System.out.println("No hay patron de incremento");
            }
        }
        if (n1 > n2) {
            if (n2 > n3) {
                System.out.println("Decrementa");
            }
            if (n3 > n1 || n3 > n2) {
                System.out.println("No hay patron de incremento");
            }
        }
        if (n1 == n2 || n1 == n3 || n3 == n2) {
            System.out.println("No hay patron de incremento");
        }
    }

    public static void diaSemana(Scanner teclado) {
        System.out.println("24.");
        System.out.println("Ingrese un numero del 1 al 7: ");
        int dia = teclado.nextInt();
        if (dia >= 1 && dia <= 7) {
            switch (dia) {
                case 1:
                    System.out.println("LUNES");
                    break;
                case 2:
                    System.out.println("MARTES");
                    break;
                case 3:
                    System.out.println("MIERCOLES");
                    break;
                case 4:
                    System.out.println("JUEVES");
                    break;
                case 5:
                    System.out.println("VIERNES");
                    break;
                case 6:
                    System.out.println("SABADO");
                    break;
                case 7:
                    System.out.println("DOMINGO");
                    break;
            }
        }else {
            System.out.println("Numero fuera de lo establecido");
        }
    }

    public static String invertirTexto(String texto) {
        String invertido = new StringBuilder(texto).reverse().toString();
        return invertido;
    }

    public static void invText(Scanner teclado) {
        System.out.println("25.");
        System.out.println("Ingrese un texto: ");
        String texto = teclado.nextLine();
        String invertido = invertirTexto(texto);
        System.out.println(invertido);
    }

    public static String textMayus (String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        String[] palabras = texto.split("(?<=\\s)|(?=\\s)");
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0))).append(palabra.substring(1).toLowerCase());
            }else {
                resultado.append(palabra);
            }
        }
        return resultado.toString();
    }

    public static void primerLetra(Scanner teclado) {
        System.out.println("26.");
        System.out.println("Ingrese un texto:");
        String texto = teclado.nextLine();
        String resultado = textMayus(texto);
        System.out.println(resultado);
    }

    public static String obtenerPenultimo(String texto) {
        String textLimpio = texto.trim();
        if (textLimpio.isEmpty()) {
            return "El texto esta vacio.";
        }
        String[] palabras = textLimpio.split("\\s+");
        if (palabras.length < 2) {
            return "El texto debe contener al menos 2 palabras.";
        }
        return palabras[palabras.length - 2];
    }

    public static void penUltim(Scanner teclado) {
        System.out.println("27.");
        System.out.println("Ingrese un texto:");
        String texto = teclado.nextLine();
        String resultado = obtenerPenultimo(texto);
        System.out.println(resultado);
    }

    public static boolean conText(String texto1, String texto2) {
        return texto2.contains(texto1);
    }

    public static void contieneTexto(Scanner teclado) {
        System.out.println("28.");
        System.out.println("Ingrese su primer texto:");
        String texto1 = teclado.nextLine();
        System.out.println("Ingrese su segundo texto:");
        String texto2 = teclado.nextLine();
        if (conText(texto1, texto2)) {
            System.out.println("El texto 2 contiene el texto 1");
        }else {
            System.out.println("El texto 2 no contiene el texto 1");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String textoLimpio = palabra.trim().toLowerCase();
        String invertido = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(invertido);
    }

    public static void Palindromo(Scanner teclado) {
        System.out.println("29.");
        System.out.println("Ingrese una palabra:");
        String palabra = teclado.nextLine();
        if (esPalindromo(palabra)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static double calcAreaPoli (double[] x, double[] y) {
        int n = x.length;
        double suma1 = 0;
        double suma2 = 0;
        for (int i = 0; i < n; i++) {
            int siguiente = (i + 1) % n;
            suma1 += x[i] * y[siguiente];
            suma2 += y[i] * x[siguiente];
        }
        return Math.abs(suma1-suma2/2.0);
    }

    public static void areaPoligono(Scanner teclado) {
        System.out.println("30.");
        System.out.println("Ingrese el numero de lados del poligono:");
        int n = teclado.nextInt();
        if (n < 3) {
            System.out.println("Un poligono tiene al menos 3 lados");
            return;
        }
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese coordenada x"+(i+1)+":");
            x[i] = teclado.nextDouble();
            System.out.println("Ingrese coordenada y"+(i+1)+":");
            y[i] = teclado.nextDouble();
        }
        double area = calcAreaPoli(x,y);
        System.out.println("El area del poligono es: "+area);
    }
}