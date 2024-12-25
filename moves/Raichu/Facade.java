package moves.Raichu;

import ru.ifmo.se.pokemon.*;


public class Facade extends PhysicalMove {
    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double d) {
        if (p.getCondition() == Status.BURN | p.getCondition() == Status.POISON | p.getCondition() == Status.PARALYZE) {
            super.applyOppDamage(p, 2 * d);
        }
    }

    @Override
    protected String describe() {
        return "does Facade";
    }


}
