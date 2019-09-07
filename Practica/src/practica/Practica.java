package practica;

import java.util.Scanner;

public class Practica {

    public Practica() {
    }
    Integer num1 = 0, num2 = 0, num3 = 0;

    public void setIgual(int x, int y) {
        this.num1 = x;
        this.num2 = y;
        if (num1 == num2) {
            System.out.print("\nlos numeros son iguales\t" + num1);
        } else {
            System.out.print("\nlos numeros no son  iguales\t" + num2);
        }
    }

    public void setmayor(int x, int y) {
        this.num1 = x;
        this.num2 = y;
        if (num1 > num2) {
            System.out.print("\nel numero 1 es mayor \t" + num1);
        } else {
            System.out.print("\nel numero 2 es mayor\t" + num2);
        }
    }

    public void setmenor(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.num1 = x;
        this.num2 = y;

        if (num1 < num2) {
            System.out.print("\nel numero 1 es menor \t" + num1);
        } else {
            System.out.print("\nel numero 2 es menor\t" + num1);
        }
    }

    public double setecuacion(int x, int y, int c) {

        this.num1 = x;
        this.num2 = y;
        this.num3 = c;
        double pote = Math.pow(2, y);
        double raiz = Math.sqrt(pote - 4 * x * c);
        double resp = (-y + raiz) / (2 * x);

        return resp;

    }

    public double setraiz(int x) {

        this.num1 = x;

        double raiz = Math.sqrt(x);
        double resp = raiz;

        return resp;

    }

    public void setsuma(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.num1 = x;
        this.num2 = y;
        double suma = x + y;
          System.out.print("\n\t SUMA:" );
        System.out.print("\nNumero (1)\t" + num1);
              System.out.print("\nNumero (2)\t" + num2);
        System.out.print("\nResultado de la suma\t" + suma);

    }

    public void setresta(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.num1 = x;
        this.num2 = y;
        double resta = x - y;
             System.out.print("\n\t RESTA:" );
        System.out.print("\nNumero (1)\t" + num1);
              System.out.print("\nNumero (2)\t" + num2);
        System.out.print("\nResultado de la resta\t" + resta);

    }

    public void setmulti(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.num1 = x;
        this.num2 = y;
        double multi = x * y;
          System.out.print("\n\t MULTIPLICACION:" );
          System.out.print("\nNumero (1)\t" + num1);
              System.out.print("\nNumero (2)\t" + num2);
        System.out.print("\nResultado de la multiplicacion\t" + multi);

    }

    public void setdiv(int x, int y) {
        Scanner n = new Scanner(System.in);
         System.out.print("\n\t DIVISION:" );
        this.num1 = x;
        this.num2 = y;
        double div = x / y;
           System.out.print("\nNumero (1)\t" + num1);
              System.out.print("\nNumero (2)\t" + num2);
        System.out.print("\nResultado de la division\t" + div);

    }

    public void setelevacion(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.num1 = x;
        this.num2 = y;
        double e1 = x * x;
        double e2 = y * y;
                System.out.print("\n\t NUMEROS ELEVADOS AL CUADRADO:" );
         System.out.print("\n Numero(1):\t" + num1);
          System.out.print("\n Numero (2):\t" + num2);
        System.out.print("\nNumero(1) al cuadrado:\t" + e1);
        System.out.print("\n Numero(2) al cuadrado:\t" + e2);

    }

    public void settra(int x, int y, int z) {
        Scanner n = new Scanner(System.in);
        this.num1 = x;
        this.num2 = y;
        this.num3 = z;
        System.out.print("\n\t NUMEROS CHINOS:" );
        System.out.print("\n Numero:\t" + num1);
        System.out.print("\t Numero en chino : 		十\t");
        System.out.print("\nNumero:\t" + num2);
        System.out.print("\t Numero en chino : 		五\t");
        System.out.print("\nNumero:\t" + num3);
        System.out.print("\t Numero en chino : 		九\t");

    }

    public static void main(String[] args) {
        System.out.print("\tOPERACIONES:");
        Practica condicional = new Practica();
        condicional.setIgual(10, 5);
        condicional.setmayor(10, 5);
        condicional.setmenor(10, 5);
        condicional.setecuacion(3, 5, 6);
        System.out.print("\nResultado de la raiz postiva\t" + condicional.setecuacion(5, 10, 2));
        condicional.setraiz(16);
        System.out.print("\nSu Raiz cuadrada: \t" + condicional.setraiz(16));
        condicional.setsuma(10, 5);
        condicional.setresta(10, 5);
        condicional.setmulti(10, 5);
        condicional.setdiv(10, 5);
        condicional.setelevacion(10, 5);
        condicional.settra(10, 5, 9);
    }

}
