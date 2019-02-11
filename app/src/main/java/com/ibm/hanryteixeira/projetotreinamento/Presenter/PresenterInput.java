package com.ibm.hanryteixeira.projetotreinamento.Presenter;

import com.ibm.hanryteixeira.projetotreinamento.Model.Model;
import com.ibm.hanryteixeira.projetotreinamento.ViewModel.ViewModel;

import java.util.ArrayList;
import java.util.List;

public interface PresenterInput {

    public List<Model> listaFilmes = new ArrayList<>();
    ViewModel.Adapter adapter = new ViewModel.Adapter(listaFilmes);

}
