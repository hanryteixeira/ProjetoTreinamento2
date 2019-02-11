package com.ibm.hanryteixeira.projetotreinamento.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerLogin.WorkerLogin;
import com.ibm.hanryteixeira.projetotreinamento.Presenter.Presenter;
import com.ibm.hanryteixeira.projetotreinamento.R;
import com.ibm.hanryteixeira.projetotreinamento.Router.Router;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void buttonVerifica (View view){
    Intent verificacao = new Intent(getApplicationContext(), Router.class);
    startActivity(verificacao);

    }
}

