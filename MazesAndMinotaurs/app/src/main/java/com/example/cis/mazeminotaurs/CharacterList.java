package com.example.cis.mazeminotaurs;

import java.util.ArrayList;

/**
 * Created by My PC on 4/10/2017.
 */

public class CharacterList {
    private static final String TAG = CharacterList.class.getName();
    private ArrayList<Character> mList = new ArrayList<>();

    private static CharacterList sCharacterList;

    private CharacterList(){
        mList = new ArrayList<>();
        mList.add(new Character());
        mList.add(new Character());
    }

    public static CharacterList get(){
        if (sCharacterList == null){
            sCharacterList = new CharacterList();
        }
        return sCharacterList;
    }

    public ArrayList<Character> getList() {
        return mList;
    }

    public void setList(ArrayList<Character> list) {
        this.mList = list;
    }

    public void addCharacter(Character character){
        mList.add(character);
    }

    public void deleteCharacter(Character character){
        mList.remove(character);
    }
}
