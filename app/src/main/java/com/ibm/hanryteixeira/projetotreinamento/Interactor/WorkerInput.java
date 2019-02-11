package com.ibm.hanryteixeira.projetotreinamento.Interactor;

import com.google.firebase.auth.FirebaseAuth;

public interface WorkerInput {
    public FirebaseAuth usuario = FirebaseAuth.getInstance();

}
