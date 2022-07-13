import java.util.Locale;
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        /*String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        compareStrings(a,b,c);
        //System.out.println("2".equals("" + compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        compareStrings(a,b,c);
        //System.out.println("1".equals("" + compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        compareStrings(a,b,c);
        System.out.println("3".equals("" + compareStrings(a, b, c)));*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa: ");
        String a = sc.nextLine();
        System.out.println("Inserisci la seconda stringa: ");
        String b = sc.nextLine();
        System.out.println("Inserisci la terza stringa: ");
        String c = sc.nextLine();
        compareStrings(a,b,c);
    }

    private static void compareStrings(String a, String b, String c) {
        int cont = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        c = c.toLowerCase();
        cont = checkCont(cont, a, b);
        cont = checkCont(cont, c, b);
        if(cont!=3) {
            cont = checkCont(cont, a, c);
        }
        System.out.println("Numero stringhe uguali: " + cont);
        //return cont;

    }

    private static int checkCont(int c, String s1, String s2){
        if(s1.equals(s2)){
            if(c==0){
                c=2;
            }else {
                c++;
            }
        }
        return c;
    }
}
