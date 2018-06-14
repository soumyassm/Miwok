package com.example.android.miwok;

public class Word {
    private String miwok;
    private String english;

    public Word(String s1, String s2){
        english = s1;
        miwok = s2;
    }
    public String getMiwok(){
        return miwok;
    }
    public String getEnglish(){
        return english;
    }

}
