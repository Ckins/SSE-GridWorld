import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.actor.Critter;
/**
* This class runs a world with additional grid choices.
*/
final class SparseGridRunner {

    private SparseGridRunner() {

    }

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.addGridClass("SparseBoundedGrid");
        world.addGridClass("SparseBoundedGrid2");
        world.addGridClass("UnboundedGrid2");
        world.add(new Location(2, 2), new Critter());
        world.add(new Location(3, 3), new Flower());
        world.add(new Bug());
        world.add(new Rock());
        world.show();
  }
}