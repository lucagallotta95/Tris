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


        for (int i = 0; i < 9; i++) {
            int posizionaX, posizionaY;

            boolean posizioneCorretta, cellaOccupata;
            do {
                do {
                    System.out.println("Posiziona la X");
                    posizionaX = sc.nextInt();
                    posizionaY = sc.nextInt();

                    posizioneCorretta = (posizionaX <= 2 && posizionaX >= 0) && (posizionaY <= 2 && posizionaY >= 0);
                    if (!posizioneCorretta) {
                        System.out.println("la posizione è sbagliata");
                    }
                } while (!posizioneCorretta);

                cellaOccupata = griglia[posizionaY][posizionaX] != '-';
                if (cellaOccupata) {
                    System.out.println("Questa cella è già occupata");
                }
            } while (cellaOccupata);

            griglia[posizionaY][posizionaX] = 'X';

            for (int j = 0; j < griglia.length; j++) {
                for (int k = 0; k < griglia[j].length; k++) {
                    System.out.print(griglia[j][k]);
                }
                System.out.println();
            }
        }


    }
}
