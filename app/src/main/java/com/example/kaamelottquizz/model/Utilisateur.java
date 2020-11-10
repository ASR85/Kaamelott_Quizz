package com.example.kaamelottquizz.model;

public class Utilisateur {

    private String mPrenom;


    public String getmprenom(){
        return mPrenom ;
    }
    public  void setmPrenom(String mPrenom){
        this.mPrenom=mPrenom;

    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "mPrenom='" + mPrenom + '\'' +
                '}';
    }
}
