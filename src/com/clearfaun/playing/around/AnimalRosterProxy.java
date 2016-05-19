package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 5/19/16.
 */
public class AnimalRosterProxy implements GetAnimalRoster {
    //PROXY

    private AnimalRoster animalRoster = new AnimalRoster();

    @Override
    public int getAnimalCount() {
        return animalRoster.getAnimalCount();
    }

    @Override
    public int getPigCount() {
        return animalRoster.getPigCount();
    }


}
