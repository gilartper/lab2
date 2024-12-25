package moves.Miltank;

import ru.ifmo.se.pokemon.*;


public class Wake_up_slap extends PhysicalMove {
    public Wake_up_slap(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);

    }

    @Override
    protected void applyOppDamage(Pokemon p, double d) {
        if (p.getCondition() == Status.SLEEP) {
            super.applyOppDamage(p, d * 2);
            Effect e = new Effect().condition(Status.NORMAL);
            p.addEffect(e);
        }
    }


    @Override
    protected String describe() {
        return "does Wake-up slap";
    }

}

