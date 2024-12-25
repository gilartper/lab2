package moves.Miltank;

import ru.ifmo.se.pokemon.*;

public class Milk_Drink extends StatusMove {
    public Milk_Drink(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {

        super.applySelfEffects(p);
        p.setMod(Stat.HP, (int) p.getStat(Stat.HP) / 2);


    }

    @Override
    protected String describe() {
        return "does Milk drink";
    }
}
