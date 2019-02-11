package com.ibm.hanryteixeira.projetotreinamento.Interactor;

import android.view.Display;

import com.google.firebase.auth.FirebaseAuth;
import com.ibm.hanryteixeira.projetotreinamento.Model.Model;

import static com.ibm.hanryteixeira.projetotreinamento.Presenter.PresenterInput.listaFilmes;

public class Interactor{

    public void criarFilmes(){

        Model filme = new Model("Homem Aranha - De volta ao lar", "Aventura", "2017");
        listaFilmes.add(filme);

        filme = new Model("Mulher Maravilha", "Fantasia", "2017");
        listaFilmes.add(filme);

        filme = new Model("Liga da Justiça", "Ficção", "2017");
        listaFilmes.add(filme);

        filme = new Model("Capitão América - Guerra Civíl", "Aventura/Ficção", "2016");
        listaFilmes.add(filme);

        filme = new Model ("It: A Coisa", "Drama/Terror", "2017");
        listaFilmes.add(filme);

        filme = new Model("Pica-Pau: O Filme", "Comédia/Animação", "2017");
        listaFilmes.add(filme);

        filme = new Model("A Múmia", "Terror", "2017");
        listaFilmes.add(filme);

        filme = new Model("A Bela e a Fera", "Romance", "2017");
        listaFilmes.add(filme);

        filme = new Model("Meu malvado favorito 3", "Comédia", "2017");
        listaFilmes.add(filme);

        filme = new Model("Carros 3", "Comédia", "2017");
        listaFilmes.add(filme);

    }

}
