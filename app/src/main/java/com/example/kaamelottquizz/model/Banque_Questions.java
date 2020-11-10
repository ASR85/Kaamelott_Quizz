package com.example.kaamelottquizz.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Banque_Questions {

    private List<Question> mListeQuestion;
    private int mNQind;

    public Banque_Questions(List<Question> ListeQuestion){
        mListeQuestion= ListeQuestion;

        Collections.shuffle(mListeQuestion);

        mNQind=0;
    }

    public Question getQuestion(){

        if(mNQind==mListeQuestion.size()){

            mNQind=0;
        }

        return mListeQuestion.get(mNQind++);
    }

    }



