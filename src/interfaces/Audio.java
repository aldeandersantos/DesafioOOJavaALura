package interfaces;

import java.util.ArrayList;

public interface Audio {
    void menuPrincipal();
    void pedeMusica();
    void retornaMaisMusica();
    void pedePodcast();
    void retornaMaisPodcast();
    void imprimePlaylist(ArrayList<String> playlist);
}
