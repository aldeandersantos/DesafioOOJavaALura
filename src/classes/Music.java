package classes;

import interfaces.Audio;

public class Music extends Media implements Audio {
    public void pedeMusica() {
        setMediaType(" musicas");
        System.out.println("Digite o nome de uma musica: ");
        userInput = scanner.nextLine();
        playlist.add(userInput);
        retornaMaisMusica();
        imprimePlaylist(playlist);
    }
    public void retornaMaisMusica(){
        while (maisUmaMedia){
            System.out.println("""
                    Você quer adicionar mais uma música na playlist?
                     1 = Sim\s
                     2 = Não""");
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
                maisUmaMedia = false;
            }
        }
        setTamanhoPlaylist(contador);
        scanner.close();
    }
}
