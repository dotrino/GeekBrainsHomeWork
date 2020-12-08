package obstacles;

import Competitors.Animal;
import Competitors.Competitor;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}