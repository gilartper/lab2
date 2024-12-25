package Ppokemons;

import moves.Raichu.Facade;


public class Raichu extends Pikachu {
    public Raichu(String name, int level) {
        super(name, level);
        super.setStats(60, 90, 55, 90, 80, 110);

        Facade facade = new Facade(70, 100);
        super.addMove(facade);

    }
}
