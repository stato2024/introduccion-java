import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada
        /*1-Programa java que realice lo siguiente: declarar una variable N de tipo int, una
        variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
        diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
        variable C.
        int N = 3;
        double A = 30.36;
        char C = 'a';
        System.out.printf("N : %s, A : %s, C: %s \n",N,A,C);
        System.out.printf("Suma de N + A : %s \n", N+A );
        System.out.printf("Diferencia de A-n : %s \n", A-N);
        System.out.printf("C : %s", Integer.valueOf(C) );
    */
        /*
        2-Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
        variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
        por pantalla una serie de operaciones entre ellas.

        int X = 4;
        int Y = 6;
        double N = 36.35;
        double M = 20.15;
        System.out.printf("N : %s, M : %s, X : %s, Y : %s \n", N,M,X,Y);
        System.out.printf("X*Y : %s\n", X*Y);
        System.out.printf("M/N : %s\n", M/N);
        System.out.printf("N-Y %s \n", N-Y);
*/
        /*
        3-Programa Java que declare una variable entera N, asignarle un valor. A continuación
        escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
        valor a 3, duplicar su valor.

        int N = 3;
        System.out.printf("Variable N : %s\n",N);
        System.out.printf("N+77 : %s\n", N + 77);
        System.out.printf("N-3: %s\n", N - 3);
        System.out.printf("N * 2 : %s\n", N*2);
        */
        /*
        4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
        cada una. A continuación realiza las instrucciones necesarias para que: B tome el
        valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.

        int A = 2;
        int B = 3;
        int C = 4;
        int D = 5;
        System.out.printf("Valor de A : %s,Valor de B : %s,Valor de C : %s,Valor de D : %s \n",A,B,C,D);
        System.out.printf("Nuevo Valor de B : %s\n", B = C);
        System.out.printf("Nuevo Valor de C : %s\n", C = A);
        System.out.printf("Nuevo Valor de A : %s\n", A = D);
        System.out.printf("Nuevo Valor de D : %s\n", D = B);
*/
        /*
        5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
        continuación mostrar un mensaje indicando si A es par o impar.

        int A = 11;
        if (A % 2 == 0)
            System.out.printf("El numero : %s es par\n",A);
        else
            System.out.printf("El numero : %s es impar\n",A);
        */
        /*
            6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
            continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.

        int B = -2;
        if (B > 0)
            System.out.printf("El numero : %s es positivo", B);
        else
            System.out.printf("El numero : %s es negativo", B);
*/
        /*
        7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
        si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
        100.

        int C = -200;
        if (C > 0)
            System.out.printf("El numero: %s es positivo\n", C);
        else
            System.out.printf("El numero : %s es negativo\n",C);
        if ( C % 2 == 0)
            System.out.printf("El numero : %s es par\n",C);
        else
            System.out.printf("El numero : %s es impar\n",C);
        if ( C % 5 == 0)
            System.out.printf("El numero : %s es multiplo de 5\n",C);
        if ( C % 10 == 0)
            System.out.printf("El numero : %s es multiplo de 10\n",C);
        if (C > 100)
            System.out.printf("El numero: %s es mayor que 100\n", C);
        else
            System.out.printf("El numero : %s es menor que 100\n",C);
    */
        /*
        8.Programa Java que lea un nombre y muestre por pantalla:
        “Buenos días, {NOMBRE}”.
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.printf("Buenos Dias : "+ nombre + ".");
        scanner.close();
        */
        /*
       9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
        ese número y lo muestre por pantalla.


        scanner.reset();
        System.out.println("Ingrese un numero entero :");
        int numero = scanner.nextInt();
        System.out.printf("El doble del numero es : %s\n",numero *2);
        System.out.printf("El triple del numero es : %s\n",numero *3);

        /*
        10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
            centígrados.

        System.out.println("Ingrese la temperatura en grados Fahrenheit : ");
        int temp = scanner.nextInt();
        double C = (temp - 32 ) /1.8;
        System.out.printf("La temperatura en Fahrenheit es " + temp + " en C° es " + C);
        */

        /*
        11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
            muestra por pantalla la longitud y el área de la circunferencia.

        System.out.println("Ingrese el radio de una circunferencia: ");
        double R = scanner.nextDouble();
        double L = 2 * R * Math.PI;
        double A = Math.pow(R, 2) * Math.PI;
        System.out.printf("La longitud es : " + L + " Area:" + A);
*/
        /*
        12.Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        System.out.println("Ingrese una velocidad en KM/H : ");
        int V = scanner.nextInt();
        double VM = V / 3.6;
        System.out.printf("La velocidad en m/s es : %s\n", VM);
        */
        /*
        13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
        longitud de la hipotenusa según el teorema de Pitágoras.
        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("La longitud de la hipotenusa es: %.2f\n", hipotenusa);
        */
        /*
        14. Programa que calcula el volumen de una esfera.

        System.out.println("Ingrese el radio de la esfera");
        double R = scanner.nextDouble();
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(R, 3);
        System.out.printf("El volumen de la esfera es : %s\n",volumen);
        */
        /*
        15.Programa que calcula el área de un triángulo a partir de la longitud de sus lados.

        System.out.println("Ingrese longitud de lado a : ");
        double a = scanner.nextDouble();
        System.out.println("Ingrese longitud de lado b : ");
        double b = scanner.nextDouble();
        System.out.println("Ingrese longitud de lado c : ");
        double c = scanner.nextDouble();
        double s = (a+b+c) /2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("El area del triangulo es : %s \n", area);
        */
         /*
         16. Programa que lee un número de 3 cifras y muestra sus cifras por separado

        System.out.println("Ingrese un numero de tres cifras");
        int n = scanner.nextInt();
        String numero = String.valueOf(n);

        if (numero.length() == 3) {
            char[] digits = numero.toCharArray();
            System.out.println(digits[0] + " " + digits[1] + " " + digits[2]);
        } else {
            System.out.println("El número ingresado no tiene 3 cifras.");
        }
        */
          /*
          17.Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
          posiciones impares.
           */
        System.out.println("Ingrese un número entero de 5 cifras: ");
        int numero = scanner.nextInt();

        if (numero >= 10000 && numero <= 99999) { // Verificar que el número tiene 5 cifras
            int[] digitos = new int[5];
            int count = 4; // Empezar desde el final del array

            while (numero > 0) {
                digitos[count] = numero % 10;
                numero = numero / 10;
                count--;
            }

            System.out.println("Cifras en posiciones impares:");
            for (int i = 0; i < digitos.length; i++) {
                if (i % 2 == 0) { // Imprimir las cifras en posiciones impares (índices 0, 2, 4)
                    System.out.print(digitos[i] + " ");
                }
            }
        } else {
            System.out.println("El número ingresado no tiene 5 cifras.");
        }





    }

    }



