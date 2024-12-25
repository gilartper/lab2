package Ppokemons;

import moves.Cacturne.Focus_blast;
import ru.ifmo.se.pokemon.Type;

public class Cacturne extends Cacnea {
    public Cacturne(String name, int level) {
        super(name, level);
        super.addType(Type.DARK);
        super.setStats(70, 115, 60, 115, 60, 55);
        Focus_blast focusBlast = new Focus_blast(120, 70);
        super.addMove(focusBlast);

    }
}
