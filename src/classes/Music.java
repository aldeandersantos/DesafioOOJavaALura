package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Music extends Media {
    private final Scanner scanner = new Scanner(System.in);
    private String userInput;
    private int contador = 1;
    private boolean maisUmaMusica = true;


    private final ArrayList<String> playlist = new ArrayList<>();

    public void retornaNome() {
        System.out.println("Digite o nome de uma musica: ");
        userInput = scanner.nextLine();
        playlist.add(userInput);
        retornaMaisMusica();
        imprimePlaylist(playlist);
    }

    public void retornaMaisMusica(){
        while (maisUmaMusica){
            System.out.println("Você quer adicionar mais uma música na playlist? \n 1 = Sim \n 2 = Não");
            userInput = scanner.nextLine();
            while (!userInput.equals("1") && !userInput.equals("2")) {
                System.out.println("Digite apenas 1 ou 2.");
                userInput = scanner.nextLine();
            }
            if (userInput.equals("1")){
                System.out.println("Digite o nome da musica: ");
                userInput = scanner.nextLine();
                playlist.add(userInput);

                contador++;
            }   else {
                maisUmaMusica = false;
            }

            setTamanhoPlaylist(contador);
        }
        scanner.close();
    }
}
