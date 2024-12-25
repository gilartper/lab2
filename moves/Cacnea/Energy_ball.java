package moves.Cacnea;
import ru.ifmo.se.pokemon.*;

public class Energy_ball extends SpecialMove{
    public Energy_ball(double pow, double acc){
        super(Type.GRASS, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e= new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "does Energy ball";
    }
}
