package estudos;

import java.util.Scanner;

public class ExemplosEstudos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com tres numeros : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       int maior = max(a,b,c);
       mostrar(maior);

        sc.close();
    }

    public static int max(int d,int e,int f){
        int aux;
        if(d > e && d > f){
            aux =d;
        }else if(e > f){
            aux = e;
        }else{
            aux = f;
        }
        return  aux;
    }

    public static void mostrar(int value){
        System.out.println("maior é = " + value);
    }
}
