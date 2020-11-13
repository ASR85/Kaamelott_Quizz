package com.arnaudlcelestino.kaamelottquizz.controller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.arnaudlcelestino.kaamelottquizz.R;
import com.arnaudlcelestino.kaamelottquizz.model.Banque_Questions;
import com.arnaudlcelestino.kaamelottquizz.model.Question;
import com.arnaudlcelestino.kaamelottquizz.model.Utilisateur;

import java.util.Arrays;

public class Fenetre_Quizz extends AppCompatActivity implements View.OnClickListener {

    private TextView textQuestion;
    private Button reponse1;
    private Button reponse2;
    private Button reponse3;
    private Button reponse4;

    private Banque_Questions mBanque_Questions;
    private Question mQuestionActuelle;

    private int mScore = 0;
    private int nombreQuestion = 10;
    public static final String BUNDLE_EXTRA_SCORE = "BUNDLE_EXTRA_SCORE";

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

    private void afficherQuestion(final Question question) {

        textQuestion.setText(question.getmQuestion());
        reponse1.setText(question.getmListQ().get(0));
        reponse2.setText(question.getmListQ().get(1));
        reponse3.setText(question.getmListQ().get(2));
        reponse4.setText(question.getmListQ().get(3));
    }

    private Banque_Questions genererQuestion() {

        Question q1 = new Question("Qui est Léodagan ?", Arrays.asList("Roi de Carmélide", "Roi d'Orcanie'", "Duc d'Aquitaine", "Roi de Bretagne"), 0);
        Question q2 = new Question("Qui est le rival de Merlin ?", Arrays.asList("Karadoc", "Méleagan", "Prisca", "Elias de Kellewic'h"), 3);
        Question q3 = new Question("Quel est le nom de famille d'Arthur ?", Arrays.asList("Pendragon", "On ne le connais pas", "Pandragon", "Perredragon"), 0);
        Question q4 = new Question("Comment est appelé Attila ?", Arrays.asList("Le cruelle", "Le juste", "Le Fléau de Dieu", "Le fou"), 2);
        Question q5 = new Question("Ferme ta gueule est un ...", Arrays.asList("un chat", "un chien", "un âne", "un petit bouc"), 3);
        Question q6 = new Question("Qui est le neveu d'Arthur ?", Arrays.asList("Perçeval", "Gauvin", "Yvain", "Bohort"), 1);
        Question q7 = new Question("Quelle est la technique secrète de Karadoc ?", Arrays.asList("Le rebrousse chemin", "Le sort de rage", "C'est pas faux", "Sauve qui peut !"), 2);
        Question q8 = new Question("D'où vient Dame Cryda ?", Arrays.asList("D'Aquitaine", "De Tintagel", "De Burgondie", "De Rome"), 1);
        Question q9 = new Question("Qui a dit : Un engin comme vous, ça devrait être livré avec une notice ?", Arrays.asList("Arthur", "Léodagan", "Yvain", "Roparzh"), 1);
        Question q10 = new Question("Comment s'appelle la femme de Karadoc ?", Arrays.asList("Azénor", "Demetra", "Mevanwi", "Séli"), 2);

        Question q11 = new Question("D'après Karadoc, comment est le pain breton ?", Arrays.asList("Friable", "Délicieux", "Une merveille", "C'est de la merde"), 3);
        Question q12 = new Question("De quel animal a peur Arthur ?", Arrays.asList("D'un lion", "D'un lapin", "D'un serpent", "D'oiseaux"), 2);
        Question q13 = new Question("Comment Nessa appelle-t-elle les Chevaliers Perceval et Karadoc ?", Arrays.asList("Patanouk et Gerciflet", "Percidok et Gerceval", "Patafi et Corollaire", "Patanouk et Gerceval"), 0);
        Question q14 = new Question("Que doit porter Calogrenant et ainsi humilier sa terre natale?", Arrays.asList("Une tunique rose", "Une jupe", "Un casque", "Un bonnet de Guinièvre"), 1);
        Question q15 = new Question("Laquelle n'est pas une maîtresse d'Arthur ?", Arrays.asList("Teigerian", "Aelis", "Séfriane", "Demetra"), 2);
        Question q16 = new Question("Selon Perceval, de combien de pierre est constitué le château ?", Arrays.asList("12780", "18990", "17120", "16130"), 3);
        Question q17 = new Question("Quel est surnom d'Arthur ?", Arrays.asList("Le sanglier de Cornouailles", "Coco l'asticot", "Arès le chat", "Le chevalier aux Lions"), 0);
        Question q18 = new Question("Comment pêche Perceval ?", Arrays.asList("A la main", "Sans l'hameçon", "AU harpon", "Il ne pêche pas"), 1);
        Question q19 = new Question("Qu'est ce qui est petit et marron ?", Arrays.asList("Une châtaigne", "Une noisette", "Un marron", "Un insecte"), 2);
        Question q20 = new Question("Quelles étaient les origines de l'amie d'enfance de Dame Séli ?", Arrays.asList("Pictes", "Burgondes", "Germaniques", "Romaines"), 1);

        Question q21 = new Question("Quelle spécialité de Rome, Guenièvre aime t'elle ?", Arrays.asList("De la biche aux pruneaux ", "Des chocolats", "La pâte d'amande", "Du pain aux olives"), 2);
        Question q22 = new Question("Lionel Astier est le père d'Alexandre Astier dans la vraie vie, quel est le lien entre leurs personnages dans la série ?", Arrays.asList("Père et fils", "Cousins", "Beau père et gendre", "Aucun"), 2);
        Question q23 = new Question("Qui a dit : 'faut arrêter ces conneries de nord et de sud ! Une fois pour toutes, le nord, suivant comment on est tourné, ça change tout !?'", Arrays.asList("Karadoc", "Arthur", "Perceval", "Lancelot"), 2);
        Question q24 = new Question("À quel jeu jouent Perceval et Karadoc ?", Arrays.asList("Le derrière du hibou", "Le fion de la belette", "Le cul de chouette", "Le trou Duc du Grand Duc"), 2);
        Question q25 = new Question("Quel acteur n'a jamais fait d'apparition dans Kaamelott ??", Arrays.asList("Gérard Jugnot", "Lorant Deutsh", "Elie Semoun", "Manu Payet"), 0);
        Question q26 = new Question("Quel objet légendaire est recherché par nos héros ??", Arrays.asList("Mjöllnir", "La toison d'or", "Excalibur", "Le graal"), 3);
        Question q27 = new Question("Avant d'être une série, Kaamelott était un court-métrage. Quel est le nom du court-métrage ?", Arrays.asList("Codex Rondo", "Era Ameno", "Dies Irae", "Era Volare"), 2);
        Question q28 = new Question("Qui prononce ces paroles Je vais te tailler le gras du cul, ça te fera ça de moins à trimballer ?", Arrays.asList("Le maître d''armes", "Arthur", "Léodagan", "Kadoc"), 0);
        Question q29 = new Question("Quel est le nom des paysans de Kaamelott ?", Arrays.asList("Guethenoc et Roparzh", "Roparzh et Venek", "Méléagan et Yvain", "Guethnoc et Kadoc"), 0);
        Question q30 = new Question("Avec quel aliment Perceval et Karadoc rendent-ils l'armée malade ??", Arrays.asList("Des baies vertes", "Des baies rouges", "Des champignons", "Des herbes aromatiques"), 2);

        Question q31 = new Question("Avec qui Bohort confond Léodagan, sur la peinture représentant ce dernier ??", Arrays.asList("Caïus", "Le père Blaise", "Calogrenant", "Perceval"), 1);
        Question q32 = new Question("Comment Nessa appelle-t-elle dame Mevanwi ?", Arrays.asList("Malatine", "Sarlatine", "Jazbaltrine", "Claratine"), 2);
        Question q33 = new Question("Quel soit disant 'viking' manque de peu de se faire couper la tête par Lancelot ?", Arrays.asList("Caius", "Sven", "Attila", "Grudü"), 0);
        Question q34 = new Question("Qui conclut ainsi un épisode en disant : 'Bon, ben alors la moitié d'un et après je filoche ! '?", Arrays.asList("L'ankou", "Nessa", "la fée Morgane", "La dame du lac"), 0);
        Question q35 = new Question("Selon son adversaire, que possède Perceval, qui est imbattable au jeu de la boulette ? ( Là où il faut retrouver une boulette de pain parmi les trois gobelets ) ?", Arrays.asList("L'ouïe de hibou", "L'oeil de taupe", "La vue d'aigle", "Le flair de renard"), 1);
        Question q36 = new Question("A quoi sert la pierre de roche ?", Arrays.asList("A changer la viande de chèvre en eau", "A changer l'herbe en eau", "A changer le sable en eau", "A changer le plomb en or"), 2);
        Question q37 = new Question("Après réflexion et calcul mental, selon Yvain, sur combien de degrés tourne-t-on lorsqu'on fait 2 tours de 360 degrés dans le même sens ?", Arrays.asList("6421", "2398", "720", "945"), 0);
        Question q38 = new Question("Quelle raison invoque Arthur pour refuser Séli à la Table Ronde tout en acceptant Séfriane d'Aquitaine ?", Arrays.asList("Parce qu'elle n'est pas enceinte", "Parce qu'elle a encore ses deux jambes", "Parce que c'est une femme", "Parcequ'elle est femme de chevalier"), 0);
        Question q39 = new Question("Pour le banquet des chefs de clan, combien Venec prévoit-il de porcs par personne ?", Arrays.asList("2", "5", "4", "3"), 3);
        Question q40 = new Question("Quel surnom donné à Perceval, lorsqu'il était petit et avait les cheveux longs, le faisait pleurer ?", Arrays.asList("Provencal", "Percelette", "Gerceval", "Perciflette"), 3);

        Question q41 = new Question("Pourquoi Perceval n'a-t-il pas rapporté les clous de Sainte-Croix qu'on lui avait offert ?", Arrays.asList("On lui a volé", "Il les a foutu en l'air", "Il les a perdu", "Il les a perdu"), 1);
        Question q42 = new Question("Quelle est l'extraordinaire découverte de Merlin ?", Arrays.asList("Une potion de souffle mortel", "Une potion de résurrection", "Une potion de vie éternelle", "Une potion d'invincibilité"), 3);
        Question q43 = new Question("A part le roi Arthur, qui possède une exceptionnelle destinée ?", Arrays.asList("Lancelot", "Perceval", "Yvain", "Karadoc"), 1);
        Question q44 = new Question("Quand Bohort a foncé tête baissée seul contre toute une armée, que criait-il ?", Arrays.asList("Saligauds !", "Barbares !", "Mécréants !", "Pécores !"), 2);
        Question q45 = new Question("Que donne la dame du lac à Arthur avant de partir pour la grotte de Padraig ?", Arrays.asList("Un flan au quetsch", "Un cake", "Des biscuits", "Une tarte aux pommes"), 1);
        Question q46 = new Question("Dans l'épisode 'la menace fantôme', pourquoi Perceval et Karadoc reviennent-ils sans le trésor ?", Arrays.asList("La porte de la grotte était fermée", "Il y avait des fantômes", "Ils l'ont perdu", "Ils ont senti un piège"), 3);
        Question q47 = new Question("A quoi fait référence l'épisode Feu l'âne de Getnoc ?", Arrays.asList("Au jugement de Salomon", "A un livre", "A une légende", "A rien, c'est une idée d'Astier"), 1);
        Question q48 = new Question("Qui est le créateur du Slooby ?", Arrays.asList("Perceval", "Le tavernier", "Guenièvre", "Arthur"), 0);
        Question q49 = new Question("Combien de collations prend Karadoc ?", Arrays.asList("3", "8, nuit comprise", "5", "11, nuit comprise"), 3);
        Question q50 = new Question("Qui est la maîtresse préférée d'Arthur ?", Arrays.asList("Demetra", "Angarade", "Mevanwi", "Aelis"), 0);


        return new Banque_Questions(Arrays.asList(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10,
                q11, q12, q13, q14, q15, q16, q17, q18, q19, q20
                                          ,q21,q22,q23,q24,q24,q25,q26,q27,q28,q29,q30,
                                          q31,q32,q33,q34,q35,q36,q37,q38,q39,q40,
                                          q41,q42,q43,q44,q45,q46,q47,q48,q49,q50
        ));

    }

    @Override
    public void onClick(View v) {
        //On récupère l'indice du bonton lors du clic afin de tester si la réponse est bonne ou pas
        int reponseIndex = (int) v.getTag();

        if (reponseIndex == mQuestionActuelle.getIndexReponse()) {

            //Si indentifiant est bon la réponse est bnonne

            //Toast.makeText(this, "Bonne réponse!", Toast.LENGTH_SHORT).show();
            mScore++;
        } else {

            //Sinon la réponse est mauvaise
           //Toast.makeText(this, "Mauvaise réponse!", Toast.LENGTH_SHORT).show();
        }

        if (--nombreQuestion == 0) {

            finDuJeu();

        } else {

            mQuestionActuelle = mBanque_Questions.getQuestion();
            afficherQuestion(mQuestionActuelle);

        }
    }

    private void finDuJeu() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Le Quizz est terminé !"
        )
                .setMessage("Votre Score est de : " + mScore + "/10 !")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent();
                        intent.putExtra(BUNDLE_EXTRA_SCORE, mScore);
                        setResult(RESULT_OK, intent);
                        finish();
                        finish();

                    }
                })
                .create()
                .show();
        mScore = 0;
    }


}
