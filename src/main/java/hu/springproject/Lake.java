package hu.springproject;

import org.springframework.beans.factory.annotation.Autowired;

public class Lake {
    private Fish fish;
    private Fisherman fisherman;

    @Autowired
    public void setFish(Fish fish) {
        this.fish = fish;
    }

    public Fish getFish() {
        return fish;
    }

    @Autowired
    public void setFisherman(Fisherman fisherman) {
        this.fisherman = fisherman;
    }

    public Fisherman getFisherman() {
        return fisherman;
    }
}
