package com.ibm.hanryteixeira.projetotreinamento.Router;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerInput;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerLogin.WorkerLogin;
import com.ibm.hanryteixeira.projetotreinamento.Presenter.Presenter;

public class Router extends AppCompatActivity implements WorkerInput {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if ( usuario.getCurrentUser() != null){
            Intent filme = new Intent(getApplicationContext(), Presenter.class);
            startActivity(filme);
        }else{
            Intent login = new Intent(getApplicationContext(), WorkerLogin.class);
            startActivity(login);
        }

        finish();

    }

}
