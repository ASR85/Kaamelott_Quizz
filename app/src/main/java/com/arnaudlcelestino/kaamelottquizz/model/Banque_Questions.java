package com.arnaudlcelestino.kaamelottquizz.model;

import java.util.Collections;
import java.util.List;

public class Banque_Questions {

    private List<com.arnaudlcelestino.kaamelottquizz.model.Question> mListeQuestion;
    private int mNQind;

    public Banque_Questions(List<com.arnaudlcelestino.kaamelottquizz.model.Question> ListeQuestion) {
        mListeQuestion = ListeQuestion;

        Collections.shuffle(mListeQuestion);

        mNQind = 0;
    }

    public com.arnaudlcelestino.kaamelottquizz.model.Question getQuestion() {

        if (mNQind == mListeQuestion.size()) {

            mNQind = 0;
        }

        return mListeQuestion.get(mNQind++);
    }

}



