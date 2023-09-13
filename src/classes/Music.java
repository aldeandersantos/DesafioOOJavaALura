package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class Music extends Media {
    private int getTamanhoPlaylist;
    private final ArrayList<String> playlist = new ArrayList<>();
    public int getGetTamanhoPlaylist() {
        return getTamanhoPlaylist;
    }
    public void setGetTamanhoPlaylist(int getTamanhoPlaylist) {
        this.getTamanhoPlaylist = getTamanhoPlaylist;
    }
    public String retornaNome() {
        boolean maisUmaMusica = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de uma musica: ");
        String userInput = scanner.nextLine();
        playlist.add(userInput);
        int contador = 1;

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

            setGetTamanhoPlaylist(contador);
        }
        scanner.close();

        System.out.println("A playlist contém " + getTamanhoPlaylist + " musicas, aqui está: ");
        for (String item : playlist) {
            System.out.println(item);
        }
        return null;
    }
}
