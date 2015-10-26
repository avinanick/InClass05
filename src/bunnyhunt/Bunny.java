package bunnyhunt;

public class Bunny extends Animal {
    
    private boolean hasSeenWolf;
    private boolean canSeeWolfNow;
    private int directionToWolf;
    private int distanceToWolf;

    public Bunny(Model model, int row, int column) {
        super(model, row, column);
        this.hasSeenWolf = false;
        this.canSeeWolfNow = false;
    }
    
    @Override
    int decideMove() {
        //Much of this uses similar code to wolf
        //Refactoring would likely put a lot of this functionality in Animal class
        canSeeWolfNow = false;
        //Look around for the wolf
        for(int i = Model.MIN_DIRECTION; i <= Model.MAX_DIRECTION; i++) {
            if (look(i) == Model.WOLF) {
                this.canSeeWolfNow = this.hasSeenWolf = true;
                this.directionToWolf = i;
                this.distanceToWolf = distance(i);
            }
        }
        
        //If the wolf was seen, move out of its line of site
        //The preferred directions away will be direction to wolf + 4 +or- 1
        if(this.canSeeWolfNow) {
            
        }
        return random(Model.MIN_DIRECTION, Model.MAX_DIRECTION);
    }
}


