package moves.Miltank;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;


public class Present extends PhysicalMove {

    public Present(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected String describe() {
        return "does Present";
    }


}
