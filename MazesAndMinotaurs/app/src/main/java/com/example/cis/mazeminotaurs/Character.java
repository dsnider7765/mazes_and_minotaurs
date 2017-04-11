package com.example.cis.mazeminotaurs;

/**
 * Created by Thorin Schmidt on 3/19/2017.
 */

public class Character {
    /* Given examples like QeoQuiz, this can probably be jsut as effectively done with string resources.
       I will leave this here just in case...
     */
    /**
     * These enums are here to reduce the need for string constants. this way, they are actual values.
     * they also function as actual data types, so the class field is of type Class, and can only
     * be assigned those predefined values.

    enum Class {
        AMAZON, AMAZON_B, ARCHER, BARBARIAN, BEASTMASTER, CAVALRYMAN, CENTAUR, ELEMENTALIST, HUNTER,
        LYRIST, NOBLE, NYMPH, PRIEST, SHAPESHIFTER, SORCEROR, SPEARMAN, THIEF
    }

    enum Patron {
        APHRODITE, APOLLO, ARES, ARTEMIS, ATHENA, DEMETER, HEPHAESTUS, HERA, HERMES, HESTIA, POSEIDON,
        ZEUS
    }

    enum Element {
        AIR, EARTH, FIRE, WATER, LIGHT, DARK
    }

    enum Kin{
        DRYAD, HELEAD, NAIAD, NAPAEA, NEREID, OREAD
    }
    These are all now string resources */

    /*DAVID SNIDER -- the following was added to hold character information needed for loading
    characters before knowing what the save file looks like. Will most likely be removed at a later
    time
     */
    private String name;
    private String chosenClass;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChosenClass() {
        return chosenClass;
    }

    public void setChosenClass(String chosenClass) {
        this.chosenClass = chosenClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Character(){
        name = "John Doe";
        chosenClass = "Undetermined";
        level = 0;
    }

    public Character(String n, String c){
        name = n;
        chosenClass = c;
        level = 1;
    }

    public String get(){
        return "Name: "+getName()+"\t\tClass: "+getChosenClass()+"\nlvl: "+Integer.toString(getLevel());
    }
}
