package classes;
import interfaces.Audio;

import java.util.ArrayList;

public class Media implements Audio {
    private String nome;

    ArrayList<Media> adicionaPlaylist() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String retornaNome() {
        return "Media sem nome";
    }

    @Override
    public int tamanhoPlaylist() {
        return 0;
    }
}
