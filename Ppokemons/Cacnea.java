package Ppokemons;

import moves.Cacnea.*;
import ru.ifmo.se.pokemon.*;


public class Cacnea extends Pokemon {
    public Cacnea(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(50, 85, 40, 85, 40, 35);

        Energy_ball energyBall = new Energy_ball(90, 100);
        Leer leer = new Leer(100, 30);
        Facade facade = new Facade(70, 100);

        super.setMove(energyBall, leer, facade);


    }


}
