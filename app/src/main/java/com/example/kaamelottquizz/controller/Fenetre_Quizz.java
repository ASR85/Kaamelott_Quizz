package com.example.kaamelottquizz.controller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kaamelottquizz.R;
import com.example.kaamelottquizz.model.Banque_Questions;
import com.example.kaamelottquizz.model.Question;
import com.example.kaamelottquizz.model.Utilisateur;

import java.util.Arrays;

public class Fenetre_Quizz extends AppCompatActivity implements View.OnClickListener{

    private TextView textQuestion;
    private Button reponse1;
    private Button reponse2;
    private Button reponse3;
    private Button reponse4;

    private Banque_Questions mBanque_Questions;
    private Question mQuestionActuelle;

    private int mScore=0;
    private int nombreQuestion=10;
    public static final String BUNDLE_EXTRA_SCORE="BUNDLE_EXTRA_SCORE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre__quizz);

        mBanque_Questions = this.genererQuestion();

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        reponse1 = (Button) findViewById(R.id.reponse1);
        reponse2 = (Button) findViewById(R.id.reponse2);
        reponse3 = (Button) findViewById(R.id.reponse3);
        reponse4 = (Button) findViewById(R.id.reponse4);

        reponse1.setTag(0);
        reponse2.setTag(1);
        reponse3.setTag(2);
        reponse4.setTag(3);

        reponse1.setOnClickListener(this);
        reponse2.setOnClickListener(this);
        reponse3.setOnClickListener(this);
        reponse4.setOnClickListener(this);

    mQuestionActuelle = mBanque_Questions.getQuestion();
    this.afficherQuestion(mQuestionActuelle);

    }

    private void afficherQuestion (final Question question){

        textQuestion.setText(question.getmQuestion());
        reponse1.setText(question.getmListQ().get(0));
        reponse2.setText(question.getmListQ().get(1));
        reponse3.setText(question.getmListQ().get(2));
        reponse4.setText(question.getmListQ().get(3));
    }

    private Banque_Questions genererQuestion(){

    Question q1 = new Question("Qui est Léodagan ?", Arrays.asList("Roi de Carmélide","Roi d'Orcanie'","Duc d'Aquitaine","Roi de Bretagne"),0);
    Question q2 = new Question("Qui est le rival de Merlin ?", Arrays.asList("Karadoc","Méleagan","Prisca","Elias de Kellewic'h"),3);
    Question q3 = new Question("Quel est le nom de famille d'Arthur ?", Arrays.asList("Pendragon","On ne le connais pas","Pandragon","Perredragon"),0);
    Question q4 = new Question("Comment est appelé Attila ?", Arrays.asList("Le cruelle","Le juste","Le Fléau de Dieu","Le fou"),2);
    Question q5 = new Question("Ferme ta gueule est un ...", Arrays.asList("un chat","un chien","un âne","un petit bouc"),3);
    Question q6 = new Question("Qui est le neveu d'Arthur ?", Arrays.asList("Perçeval","Gauvin","Yvain","Bohort"),1);
    Question q7 = new Question("Quelle est la technique secrète de Karadoc ?", Arrays.asList("Le rebrousse chemin","Le sort de rage","C'est pas faux","Sauve qui peut !"),2);
    Question q8 = new Question("D'où vient Dame Cryda ?", Arrays.asList("D'Aquitaine","De Tintagel","De Burgondie","De Rome"),1);
    Question q9 = new Question("Qui a dit : Un engin comme vous, ça devrait être livré avec une notice ?", Arrays.asList("Arthur","Léodagan","Yvain","Roparzh"),1);
    Question q10 = new Question("Comment s'appelle la femme de Karadoc ?", Arrays.asList("Azénor","Demetra","Mevanwi","Séli"),2);

    Question q11 = new Question("D'après Karadoc, comment est le pain breton ?", Arrays.asList("Friable","Délicieux","Une merveille","C'est de la merde"),3);
    Question q12 = new Question("De quel animal a peur Arthur ?", Arrays.asList("D'un lion","D'un lapin","D'un serpent","D'oiseaux"),2);
    Question q13 = new Question("Comment Nessa appelle-t-elle les Chevaliers Perceval et Karadoc ?", Arrays.asList("Patanouk et Gerciflet","Percidok et Gerceval","Patafi et Corollaire","Patanouk et Gerceval"),0);
    Question q14 = new Question("Que doit porter Calogrenant et ainsi humilier sa terre natale?", Arrays.asList("Une tunique rose","Une jupe","Un casque","Un bonnet de Guinièvre"),1);
    Question q15 = new Question("Laquelle n'est pas une maîtresse d'Arthur ?", Arrays.asList("Teigerian","Aelis","Séfriane","Demetra"),2);
    Question q16 = new Question("Selon Perceval, de combien de pierre est constitué le château ?", Arrays.asList("12780","18990","17120","16130"),3);
    Question q17 = new Question("Quel est surnom d'Arthur ?", Arrays.asList("Le sanglier de Cornouailles","Coco l'asticot","Arès le chat","Le chevalier aux Lions"),0);
    Question q18 = new Question("Comment pêche Perceval ?", Arrays.asList("A la main","Sans l'hameçon","AU harpon","Il ne pêche pas"),1);
    Question q19 = new Question("Qu'est ce qui est petit et marron ?", Arrays.asList("Une châtaigne","Une noisette","Un marron","Un insecte"),2);
    Question q20 = new Question("Quelles étaient les origines de l'amie d'enfance de Dame Séli ?", Arrays.asList("Pictes","Burgondes","Germaniques","Romaines"),1);

    Question q21 = new Question("Quelle spécialité de Rome, Guenièvre aime t'elle ?", Arrays.asList("De la biche aux pruneaux ","Des chocolats","La pâte d'amande","Du pain aux olives"),2);
    Question q22 = new Question("?", Arrays.asList("","'","",""),1);
    Question q23 = new Question("?", Arrays.asList("","'","",""),1);
    Question q24 = new Question("?", Arrays.asList("","'","",""),1);
    Question q25 = new Question("?", Arrays.asList("","'","",""),1);
    Question q26 = new Question("?", Arrays.asList("","'","",""),1);
    Question q27 = new Question("?", Arrays.asList("","'","",""),1);
    Question q28 = new Question("?", Arrays.asList("","'","",""),1);
    Question q29 = new Question("?", Arrays.asList("","'","",""),1);
    Question q30 = new Question("?", Arrays.asList("","'","",""),1);

    Question q31 = new Question("?", Arrays.asList("","'","",""),1);
    Question q32 = new Question("?", Arrays.asList("","'","",""),1);
    Question q33 = new Question("?", Arrays.asList("","'","",""),1);
    Question q34 = new Question("?", Arrays.asList("","'","",""),1);
    Question q35 = new Question("?", Arrays.asList("","'","",""),1);
    Question q36 = new Question("?", Arrays.asList("","'","",""),1);
    Question q37 = new Question("?", Arrays.asList("","'","",""),1);
    Question q38 = new Question("?", Arrays.asList("","'","",""),1);
    Question q39 = new Question("?", Arrays.asList("","'","",""),1);
    Question q40 = new Question("?", Arrays.asList("","'","",""),1);

    Question q41 = new Question("?", Arrays.asList("","'","",""),1);
    Question q42 = new Question("?", Arrays.asList("","'","",""),1);
    Question q43 = new Question("?", Arrays.asList("","'","",""),1);
    Question q44 = new Question("?", Arrays.asList("","'","",""),1);
    Question q45 = new Question("?", Arrays.asList("","'","",""),1);
    Question q46 = new Question("?", Arrays.asList("","'","",""),1);
    Question q47 = new Question("?", Arrays.asList("","'","",""),1);
    Question q48 = new Question("?", Arrays.asList("","'","",""),1);
    Question q49 = new Question("?", Arrays.asList("","'","",""),1);
    Question q50 = new Question("?", Arrays.asList("","'","",""),1);


return new Banque_Questions(Arrays.asList(q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,
                                         q11,q12,q13,q14,q15,q16,q17,q18,q19,q20/*
                                          ,q21,q22,q23,q24,q24,q25,q26,q27,q28,q29,q30,
                                          q31,q32,q33,q34,q35,q36,q37,q38,q39,q40,
                                          q41,q42,q43,q44,q45,q46,q47,q48,q49,q50*/
));

    }

    @Override
    public void onClick(View v) {
        //On récupère l'indice du bonton lors du clic afin de tester si la réponse est bonne ou pas
        int reponseIndex = (int) v.getTag();

        if(reponseIndex == mQuestionActuelle.getIndexReponse()){

            //Si indentifiant est bon la réponse est bnonne

            Toast.makeText(this,"Bonne réponse!", Toast.LENGTH_SHORT).show();
            mScore++;
        }else{

            //Sinon la réponse est mauvaise
            Toast.makeText(this,"Mauvaise réponse!" , Toast.LENGTH_SHORT).show();
        }

        if (--nombreQuestion == 0) {

            finDuJeu();

        }else{

            mQuestionActuelle = mBanque_Questions.getQuestion();
            afficherQuestion(mQuestionActuelle);

        }
        }

        private void finDuJeu(){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Le Quizz est terminé !"
            )
                    .setMessage("Votre Score est de : " + mScore+ "/10 !")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent();
                            intent.putExtra(BUNDLE_EXTRA_SCORE, mScore);
                            setResult(RESULT_OK, intent);
                            finish();
                        finish();

                    } })
                            .create()
                            .show();
            mScore=0;
            }


}
