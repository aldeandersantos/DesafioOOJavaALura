package classes;
import interfaces.Audio;
import java.util.ArrayList;
import java.util.Scanner;

public class Media implements Audio {
    private int tamanhoPlaylist;
    protected int contador = 1;

    private String mediaType;

    protected Scanner scanner = new Scanner(System.in);
    protected String userInput;
    protected boolean maisUmaMedia = true;

    protected final ArrayList<String> playlist = new ArrayList<>();
    public void menuPrincipal(){
        String tipoDeMedia;
        System.out.println("""
                Olá, você gostaria de criar uma playlist de musicas ou de podcasts?
                 1 = Musicas\s
                 2 = Podcasts""");
        userInput = scanner.nextLine();

        if (userInput.equals("1")){
            tipoDeMedia = " musicas";
            setMediaType(tipoDeMedia);
            Music metodoMusic = new Music();

            metodoMusic.pedeMusica();
        } else if (userInput.equals("2")){
            tipoDeMedia = " episódios de podcast";
            setMediaType(tipoDeMedia);
            Podcast metodoPodcast = new Podcast();

            metodoPodcast.pedePodcast();
        }
    }

    @Override
    public void pedeMusica() {
    }
    @Override
    public void retornaMaisMusica(){
    }
    @Override
    public void pedePodcast() {
    }
    @Override
    public void retornaMaisPodcast() {
    }
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
    public int getTamanhoPlaylist() {
        return tamanhoPlaylist;
    }

    public void setTamanhoPlaylist(int tamanhoPlaylist) {
        this.tamanhoPlaylist = tamanhoPlaylist;
    }

    public void imprimePlaylist(ArrayList<String> playlist){
        System.out.println("A playlist contém " + getTamanhoPlaylist() + getMediaType() + ", aqui está: ");
        //Music playlist = new Music();
        for (String item : playlist) {
            System.out.println(item);
        }
    }
}
