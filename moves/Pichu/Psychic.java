package moves.Pichu;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public static int i =0;
    public Psychic(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        Psychic.i+=1;

        return "does Psychic";

    }


}
