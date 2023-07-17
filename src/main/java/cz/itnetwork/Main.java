package cz.itnetwork;


import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static Evidence evidence;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        evidence = new Evidence();

        boolean konec = false;

        System.out.println("Evidence pojištěných");

        while(!konec){
            System.out.println("1 - Přidat pojištěného");
            System.out.println("2 - Zobrazit seznam všech pojištěných");
            System.out.println("3 - Vyhledat pojištěného podle jména a příjmení");
            System.out.println("4 - Konec");

            int volba = scanner.nextInt();

            switch (volba){
                case 1:
                    pridatPojisteneho();
                    break;
                case 2:
                    zobrazitSeznam();
                    break;
                case 3:
                    vyhledatPojisteneho();
                    break;
                case 4:
                    konec = true;
                    break;
                default:
                    System.out.println("Neplatná volba");
                    break;
            }
        }
    }
    private static void pridatPojisteneho(){
        System.out.println("Zadejte jméno:");
        String jmeno = scanner.next();

        System.out.println("Zadejte přijímení:");
        String prijimeni = scanner.next();

        System.out.println("Zadejte věk:");
        int vek = scanner.nextInt();

        System.out.println("Zadejte telefoní číslo:");
        String telefon = scanner.next();

        Pojisteny pojisteny = new Pojisteny(jmeno , prijimeni, vek , telefon);
        evidence.pridatPojisteneho(pojisteny);

        System.out.println("Pojištěný byl přidán.");
    }
    private static void zobrazitSeznam(){
        List<Pojisteny> seznam = evidence.getSeznamPojistenych();

        if(seznam.isEmpty()){
            System.out.println("V evidenci nejsou žádní pojištění");
        }else{
            System.out.println("Seznam všech pojištěných:");
            for(Pojisteny p : seznam){
                System.out.println(p.toString());
            }
        }
    }
    private static void vyhledatPojisteneho(){
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = scanner.next();

        System.out.println("Zadejte pařijímení pojištěného:");
        String prijimeni = scanner.next();

        Pojisteny pojisteny = evidence.najdiPojisteneho(jmeno, prijimeni);

        if(pojisteny != null){
            System.out.println("Pojištěný byl nalezen:");
            System.out.println(pojisteny.toString());
        }else{
            System.out.println("Pojištěný s daným jménem a přijímením nebyl nalezen.1");
        }
    }
}