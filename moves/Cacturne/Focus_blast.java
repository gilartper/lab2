package moves.Cacturne;

import ru.ifmo.se.pokemon.*;


public class Focus_blast extends SpecialMove {
    public Focus_blast(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "does Energy ball";
    }
}

