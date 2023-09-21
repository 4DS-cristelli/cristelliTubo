import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        //variabili tmp
        float raggio;
        float altezza;
        boolean flag;

        do{//ciclo input selezione con eccezzioni
            try{
                input = new Scanner(System.in);
                System.out.print("Inserisci il raggio del tubo:  ");
                raggio = input.nextByte();
                flag = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while(!flag);

        do{//ciclo input selezione con eccezzioni
            try{
                input = new Scanner(System.in);
                System.out.print("Inserisci l'altezza del tubo:  ");
                altezza = input.nextByte();
                flag = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while(!flag);


        System.out.println("Hello world!");
    }
}