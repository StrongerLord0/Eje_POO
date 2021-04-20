package github;

import java.util.Scanner;

public class Github {

    public static void main(String[] args) {
        int x=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola grupo de POO");
        
        System.out.println("Ingrese;\n1 si desea convertir su nombre en siglas"
                + "\n2 si desea conocer el nombre del administrador");
        try{
            x=sc.nextInt();
        } catch(Exception e){
            System.out.println("Ingrese un indice válido");
            x=0;
        }
        switch(x){
            case 1: nombreSiglas();
            break;
            case 2: nombre();
            break;
            default: System.out.println("Ningún proceso seleccionado");
            break;
        }
        System.out.println("Sistema finalizado correctamente");
    }
    
    private static void nombreSiglas(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre completo");
        nombre=sc.nextLine();
        String[] siglas = nombre.split(" ",10);
        System.out.println("Tu nombre completo es: "+nombre);
        System.out.print("Tus siglas son: ");
        
        for(int i=0;i<siglas.length;i++){
            System.out.print(Character.toUpperCase(siglas[i].charAt(0)));
        }
        System.out.println("");
    }
    
    private static void nombre(){
        System.out.println("Jesús Adán Salazar Campos");
    }
    
}
