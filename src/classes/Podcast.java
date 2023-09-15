package classes;

public class Podcast extends Media {
    public void pedePodcast() {
        setMediaType(" episódios de podcast");
        System.out.println("Digite o nome de um episódio de podcast: ");
        userInput = scanner.nextLine();
        playlist.add(userInput);
        retornaMaisPodcast();
        imprimePlaylist(playlist);
    }
    public void retornaMaisPodcast(){
        while (maisUmaMedia){
            System.out.println("""
                    Você quer adicionar mais algum episódio de podcast na playlist?
                     1 = Sim\s
                     2 = Não""");
            userInput = scanner.nextLine();
            while (!userInput.equals("1") && !userInput.equals("2")) {
                System.out.println("Digite apenas 1 ou 2.");
                userInput = scanner.nextLine();
            }
            if (userInput.equals("1")){
                System.out.println("Digite o nome do episódio: ");
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
