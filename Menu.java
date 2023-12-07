import java.util.Scanner;
import java.io.*;
import java.util.Vector;
/**
 */
public class Menu
{
    public static void main(String[] args)throws IOException{
        Metodo meto=new Metodo();
        meto=LecturaDatosBufer.leer(); 
        int opcion=0;
        do{
            System.out.println("1.-Buscar establecimiento por nombre");
            System.out.println("2.-Leer una entidad y mostrar sus establecimientos");
            System.out.println("3.-Leer un municipio y mostrar sus establecimientos");
            System.out.println("4.-Buscar por Id");
            System.out.println("5.-Salir del programa");
            Scanner entrada=new Scanner(System.in);
            opcion=entrada.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingrese el establecimiento a buscar:");
                    String a=entrada.next();
                    Metodo m1=meto.filtroNomEstable(a);
                    m1.imprimir();
                    break;
                case 2:
                    System.out.println("Ingrese la entidad:");
                    String b=entrada.next();
                    Metodo m2=meto.filtroNomEntidad(b);
                    m2.imprimir();
                    break;
                case 3:
                    System.out.println("Ingrese el municipio:");
                    String c=entrada.next();
                    Metodo m3=meto.filtroNomMunicipio(c);
                    m3.imprimir();
                    break;
                case 4:
                    System.out.println("Ingrese el id:");
                    String d=entrada.next();
                    Metodo m4=meto.filtroId(d);
                    m4.imprimir();
                    break;
                case 5:
                    System.out.println("si");
                    meto.imprimir();
                    break;
                case 6:
                    System.out.println("Fin del programa :)");
                    break;
                default:
                    System.out.println("No es una opcion del menu, elija una opcion del 1 al 4");
                    break;
            }
        }while(opcion!=6);
    }
}
