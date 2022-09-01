/*
    - Laboratorio Nro 12 - Ejercicio 1: Escriba un programa que pida los puntos opuestos de dos rectángulos: rectángulo A [(x1,y1), (x2,y2)] y rectángulo B[(x3,y3), (x4,y4)]. 
    Con esta información usted deberá determinar si los rectángulos son disjuntos o si se tocan
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/
import java.util.*;

public class Ejercicio {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4, X1, X2, X3, X4, Y1, Y2, Y3, Y4; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print(
                "Bienvenido(a), a continuación ingrese los datos para la primera esquina del rectángulo A;\nX1: ");
        x1 = scan.nextDouble();
        System.out.print("Y1: ");
        y1 = scan.nextDouble();
        System.out.print("Ingrese los datos para la esquina opuesta del rectángulo A;\nX2: ");
        x2 = scan.nextDouble();
        System.out.print("Y2: ");
        y2 = scan.nextDouble();
        System.out.print("Ingrese los datos para la esquina del rectángulo B;\nX3: ");
        x3 = scan.nextDouble();
        System.out.print("Y3: ");
        y3 = scan.nextDouble();
        System.out.print("Ingrese los datos para la esquina opuesta del rectángulo B;\nX4: ");
        x4 = scan.nextDouble();
        System.out.print("Y4: ");
        y4 = scan.nextDouble();
        if (x1 <= x2) { // Ordenamiento de las variables
            X1 = x1;
            X2 = x2;
        } else {
            X1 = x2;
            X2 = x1;
        }
        if (y1 <= y2) {
            Y1 = y1;
            Y2 = y2;
        } else {
            Y1 = y2;
            Y2 = y1;
        }
        if (x3 <= x4) {
            X3 = x3;
            X4 = x4;
        } else {
            X3 = x4;
            X4 = x3;
        }
        if (y3 <= y4) {
            Y3 = y3;
            Y4 = y4;
        } else {
            Y3 = y4;
            Y4 = y3;
        }
        System.out.println("Rectángulo A = ([" + x1 + ", " + y1 + "], [" + x2 + ", " + y2 + "])\nRectángulo B = ([" + x3
                + ", " + y3 + "], [" + x4 + ", " + y4 + "])");
        // Condicionales
        if ((Y1 == Y4 && X2 == X3) || (Y1 == Y3 && X1 == X4) || (Y2 == Y3 && X2 == X3) || (Y1 == Y4 && X1 == X4)) {
            System.out.println("Ambos rectángulos se tocan en un solo punto.");
        } else {
            if ((X3 <= X1 && X1 <= X4 && Y1 == Y4) || (X3 <= X2 && X2 <= X4 && Y1 == Y4)
                    || (X3 <= X1 && X1 <= X4 && Y2 == Y3) || (X3 <= X2 && X2 <= X4 && Y2 == Y3)
                    || (Y3 <= Y1 && Y1 <= Y4 && X1 == X4) || (Y3 <= Y2 && Y2 <= Y4 && X1 == X4)
                    || (Y3 <= Y1 && Y1 <= Y4 && X2 == X3) || (Y3 <= Y2 && Y2 <= Y4 && X2 == X3)
                    || (Y1 <= Y3 && Y4 <= Y2 && (X1 == X4 || X2 == X3))
                    || (X1 <= X3 && X4 <= X2 && (Y1 == Y4 || Y2 == Y3))) {
                System.out.println("Ambos rectángulos se tocan.");
            } else {
                if (((X1 < X4 && X4 < X2) && (Y1 < Y4 && Y4 < Y2)) || ((X1 < X4 && X4 < X2) && (Y1 < Y3 && Y3 < Y2))
                        || ((X1 < X3 && X3 < X2) && (Y1 < Y3 && Y3 < Y2))
                        || ((X1 < X3 && X3 < X2) && (Y1 < Y4 && Y4 < Y2))
                        || (Y1 < Y3 && Y4 < Y2) || (X1 < X3 && X4 < X2)) {
                    System.out.println("Ambos rectángulos se traslapan.");
                } else {
                    System.out.println("Son disjuntos.");
                }
            }
        }
        scan.close();
    }
}