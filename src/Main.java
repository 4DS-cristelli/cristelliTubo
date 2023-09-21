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
        int scelta = -1;
        boolean exit = false;


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


        while (!exit){
            System.out.println("TUBO");
            System.out.println("0. Esci");
            System.out.println("1. Calcola superficie");
            System.out.println("2. Calcola volume");

            do{//ciclo input selezione con eccezzioni
                try{
                    input = new Scanner(System.in);
                    System.out.print("Inserisci la scelta:  ");
                    scelta = input.nextInt();
                    flag = true;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    flag = false;
                }
            }while(!flag);

            switch (scelta){
                case 0:
                    exit = true;
                    break;

                case 1:
                    System.out.println("La superficie del tubo è di:"+tubo1.calcolaSuperficie());
                    break;


            }



        }







        System.out.println("Hello world!");
    }
}