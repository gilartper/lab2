package moves.Pichu;

import ru.ifmo.se.pokemon.*;

public class Thunder_Wave extends StatusMove {
    public Thunder_Wave(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().condition(Status.PARALYZE);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "does Thunder wave";
    }

}
