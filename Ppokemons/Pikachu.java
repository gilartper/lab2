package Ppokemons;

import moves.Pikachu.Discharge;


public class Pikachu extends Pichu {
    public Pikachu(String name, int level) {
        super(name, level);

        super.setStats(35, 55, 40, 50, 50, 90);

        Discharge discharge = new Discharge(80, 100);
        super.addMove(discharge);
    }
}
