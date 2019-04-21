package com.topics.special.easyfood.helper;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ConfiguracaoFirebase {

    private static DatabaseReference referencialFirebase;
    private static FirebaseAuth referencialAutenticacao;
    private static StorageReference referenceStorage;

    public static String getIdUsuario(){
        FirebaseAuth autenticacao = getFirebaseAutenticacao();
        return autenticacao.getCurrentUser().getUid();
    }

    public static DatabaseReference getFirebase(){
        if (referencialFirebase == null){
            referencialFirebase = FirebaseDatabase.getInstance().getReference();
        }
        return referencialFirebase;
    }

    public static FirebaseAuth getFirebaseAutenticacao(){
        if (referencialAutenticacao == null){
            referencialAutenticacao = FirebaseAuth.getInstance();
        }
        return referencialAutenticacao;
    }

    public static StorageReference getFirebaseStorage(){
        if (referenceStorage == null){
            referenceStorage = FirebaseStorage.getInstance().getReference();
        }
        return referenceStorage;
    }
}
