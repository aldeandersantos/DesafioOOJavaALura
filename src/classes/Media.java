package classes;
import interfaces.Audio;

import java.util.ArrayList;

public class Media implements Audio {
    private int tamanhoPlaylist;
    public void retornaNome() {
    }

    public void retornaMaisMusica(){
    }

    public int getTamanhoPlaylist() {
        return tamanhoPlaylist;
    }

    public void setTamanhoPlaylist(int tamanhoPlaylist) {
        this.tamanhoPlaylist = tamanhoPlaylist;
    }

    public void imprimePlaylist(ArrayList<String> playlist){
        System.out.println("A playlist contém " + getTamanhoPlaylist() + " musicas, aqui está: ");
        //Music playlist = new Music();
        for (String item : playlist) {
            System.out.println(item);
        }
    }
}
