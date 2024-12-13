import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char[][] griglia = new char[3][3];

        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                griglia[i][j] = '-';
            }
        }
        boolean turnoUtente = true;

        for (int i = 0; i < 9; i++) {
            int posizionaX, posizionaY;

            boolean posizioneCorretta, cellaOccupata;
            if (turnoUtente) {
                System.out.println("\nPosiziona la X");
            } else {
                System.out.println("\nPosiziona la O");
            } 
            
            do {
                do {

                    System.out.println();
                    if (turnoUtente) {
                        posizionaX = sc.nextInt();
                        posizionaY = sc.nextInt();
                    } else {
                        posizionaX = r.nextInt(3);
                        posizionaY = r.nextInt(3);
                    }

                    posizioneCorretta = (posizionaX <= 2 && posizionaX >= 0) && (posizionaY <= 2 && posizionaY >= 0);
                    if (!posizioneCorretta && turnoUtente) {
                        System.out.println("la posizione è sbagliata");
                    }
                } while (!posizioneCorretta);

                cellaOccupata = griglia[posizionaY][posizionaX] != '-';
                if (cellaOccupata && turnoUtente) {
                    System.out.println("Questa cella è già occupata");
                }
            } while (cellaOccupata);

            if (turnoUtente) {
                griglia[posizionaY][posizionaX] = 'X';
            } else {
                griglia[posizionaY][posizionaX] = 'O';
            }
            turnoUtente = !turnoUtente;

            for (int j = 0; j < griglia.length; j++) {
                for (int k = 0; k < griglia[j].length; k++) {
                    System.out.print(griglia[j][k]);
                }
                System.out.println();
            }
        }

    }
}
