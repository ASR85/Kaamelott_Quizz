package com.arnaudlcelestino.kaamelottquizz.model;

import java.util.List;

public class Question {

    private String mQuestion;
    private List<String> mListQ;
    private int indexReponse;


    public Question(String mQuestion, List<String> mListQ, int indexReponse) {
        this.mQuestion = mQuestion;
        this.mListQ = mListQ;
        this.indexReponse = indexReponse;
    }


    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public List<String> getmListQ() {
        return mListQ;
    }

    public void setmListQ(List<String> mListQ) {
        this.mListQ = mListQ;
    }

    public int getIndexReponse() {
        return indexReponse;
    }

    public void setIndexReponse(int indexReponse) {
        this.indexReponse = indexReponse;
    }
}
