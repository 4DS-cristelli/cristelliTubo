import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        Tubo tubo1 = null;
        //variabili tmp
        float raggio= 0;
        float altezza = 0;
        boolean flag;


        do{
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

            try {
                tubo1 = new Tubo(raggio, altezza);
                flag = true;
            }catch (Exception e){
                System.out.println(e);
                flag = false;
            }
        }while (!flag);






        System.out.println("Hello world!");
    }
}