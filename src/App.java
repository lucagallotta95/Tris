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
        
        

        for(int i=0; i<9; i++){
            
            int posizionaX, posizionaY;
            boolean posizioneCorretta, continua=true;

            do{
                System.out.println("Posiziona la X");
                posizionaX= sc.nextInt();
                posizionaY = sc.nextInt();

                posizioneCorretta=(posizionaX<=2 && posizionaX>=0) && (posizionaY<=2 && posizionaY>=0);

                if(posizioneCorretta){
                    if (griglia[posizionaY][posizionaX]=='-'){
                        continua=false;
                        griglia[posizionaY][posizionaX] = 'x';
                        
                    }
                }else{
                    System.out.println("la posizione è sbagliata");
                }
                
    
            }while(!posizioneCorretta||continua);
            
            for (int j = 0; j < griglia.length; j++) {
                for (int k = 0; k < griglia[i].length; k++) {
                    System.out.print(griglia[i][j]);
                }
                System.out.println();
            } 
        }

        

    }
}
