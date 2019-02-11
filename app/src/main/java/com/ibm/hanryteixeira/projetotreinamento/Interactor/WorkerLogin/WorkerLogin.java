package com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerLogin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerCadastro.WorkerCadastro;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerInput;
import com.ibm.hanryteixeira.projetotreinamento.Presenter.Presenter;
import com.ibm.hanryteixeira.projetotreinamento.R;

public class WorkerLogin extends AppCompatActivity implements WorkerInput {


    private EditText editLoginEmail;
    private EditText editLoginSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editLoginEmail = findViewById(R.id.editLoginEmail);
        editLoginSenha = findViewById(R.id.editLoginSenha);





        //Deslogar Usuario
        //usuario.signOut();
    }

    public void ButtonLoginInicial (View view){

        String editStringEmail = editLoginEmail.getText().toString();
        String editStringSenha = editLoginSenha.getText().toString();

        usuario.signInWithEmailAndPassword(editStringEmail, editStringSenha)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            Toast.makeText(getApplicationContext(),"Bem-vindo", Toast.LENGTH_LONG).show();

                            Intent loginSucesso = new Intent(getApplicationContext(), Presenter.class);
                            startActivity(loginSucesso);

                        } else {

                            Toast.makeText(getApplicationContext(), "Erro ao entrar", Toast.LENGTH_LONG).show();

                        }
                    }
                });
    }

    public void ButtonCadastroInicial (View view){

        Intent workerCadastro = new Intent(this, WorkerCadastro.class);
        startActivity(workerCadastro);

    }

}