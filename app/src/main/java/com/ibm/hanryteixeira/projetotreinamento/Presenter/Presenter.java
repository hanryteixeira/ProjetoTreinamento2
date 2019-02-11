package com.ibm.hanryteixeira.projetotreinamento.Presenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ibm.hanryteixeira.projetotreinamento.Activity.Activity;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.Interactor;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerInput;
import com.ibm.hanryteixeira.projetotreinamento.R;

//Presenter organiza o modelo no Layout




public class Presenter extends AppCompatActivity implements PresenterInput, WorkerInput {

    private RecyclerView recyclerView;
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configurações do Recyclerview
        recyclerView = findViewById(R.id.recyclerFilme);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Sua lista de filmes");
        toolbar.setNavigationIcon(R.drawable.ic_power_settings_new_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                usuario.signOut();
                Toast.makeText(getApplicationContext(),"Usuario deslogado com sucesso!",Toast.LENGTH_LONG).show();
                Intent telaInicial = new Intent(getApplicationContext(), Activity.class);
                startActivity(telaInicial);

            }
        });



        Interactor iniciar = new Interactor();
        iniciar.criarFilmes();


        }
}
