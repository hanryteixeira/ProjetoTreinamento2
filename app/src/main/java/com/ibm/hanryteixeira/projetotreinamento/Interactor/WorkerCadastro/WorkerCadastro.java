package com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerCadastro;

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
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerInput;
import com.ibm.hanryteixeira.projetotreinamento.Interactor.WorkerLogin.WorkerLogin;
import com.ibm.hanryteixeira.projetotreinamento.R;

public class WorkerCadastro extends AppCompatActivity implements WorkerInput {



    private EditText editEmail;
    private EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_cadastro);

        editEmail = findViewById(R.id.editCadastroEmail);
        editSenha = findViewById(R.id.editCadastroSenha);

    }

    public void ButtonCadastro (View view){

        String editEmailString = editEmail.getText().toString();
        String editSenhaString = editSenha.getText().toString();

        usuario.createUserWithEmailAndPassword(editEmailString,editSenhaString)
                .addOnCompleteListener(WorkerCadastro.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Toast.makeText(getApplicationContext(),"Cadastro do usuário completo", Toast.LENGTH_LONG).show();

                            Intent login = new Intent(getApplicationContext(), WorkerLogin.class);
                            startActivity(login);


                        } else {

                            Toast.makeText(getApplicationContext(),"Erro ao cadastrar usuário", Toast.LENGTH_LONG).show();

                        }
                    }
                });

    }
}
