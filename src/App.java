import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        char[][] griglia = new char[3][3];

        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                griglia[i][j] = '-';
            }
        } 
        
        System.out.println("Posiziona la X");
        int posizionaX = sc.nextInt();
        int posizionaY = sc.nextInt();
        griglia[posizionaY][posizionaX] = 'x';


        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                System.out.print(griglia[i][j]);
            }
            System.out.println();
        } 

    }
}
