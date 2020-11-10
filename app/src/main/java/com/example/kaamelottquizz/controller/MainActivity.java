package com.example.kaamelottquizz.controller;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kaamelottquizz.R;
import com.example.kaamelottquizz.model.Utilisateur;

public class MainActivity extends AppCompatActivity {

    private TextView textJoueur;
    private EditText editT_Joueur;
    private Button b_jouer;
    private Utilisateur mUtilisateur;
    public static final int fenetreJeuCode=0;
    private SharedPreferences mesPreferences; //Sert à stocker des données dans la mémoire du tel


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (fenetreJeuCode ==requestCode && RESULT_OK == resultCode){
            int score = data.getIntExtra(Fenetre_Quizz.BUNDLE_EXTRA_SCORE, 0);
            //On récupère le score et on le stock dans les préférences
            mesPreferences.edit().putInt("Score",score).apply();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUtilisateur = new Utilisateur();
        mesPreferences = getPreferences(MODE_PRIVATE); //Seul l'appli aura acces au données

        textJoueur = (TextView) findViewById(R.id.textJoueur);
        editT_Joueur = (EditText) findViewById(R.id.editT_Joueur);
        b_jouer = (Button) findViewById(R.id.b_jouer);


        b_jouer.setEnabled(false);

        editT_Joueur.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                b_jouer.setEnabled(s.toString().length()>2);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        b_jouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String prenom = editT_Joueur.getText().toString();
                mUtilisateur.setmPrenom(prenom);
                mesPreferences.edit().putString("Prenom",mUtilisateur.getmprenom()).apply();
                Intent fenetreJeux = new Intent(MainActivity.this,Fenetre_Quizz.class);
                startActivity(fenetreJeux);
                startActivityForResult(fenetreJeux, fenetreJeuCode);

            }
        });

    }
}