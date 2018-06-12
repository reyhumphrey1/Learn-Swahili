package com.example.android.miwok;

public class Word {

    //default translation for the word
    private String mDefaultTranslation;

    private String mSwahiliTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /*
    @param mDefaultTranslation is the word in a language that the user is already familiar with
    @param mSwahilitranslation is the word in the Swahili language
     */

    public Word (String defaultTranslation, String swahiliTranslation) {
        mDefaultTranslation = defaultTranslation;
        mSwahiliTranslation = swahiliTranslation;
    }

    public Word (String defaultTranslation, String swahiliTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mSwahiliTranslation = swahiliTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getSwahilitranslation() {
        return mSwahiliTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage(){
        return  mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
