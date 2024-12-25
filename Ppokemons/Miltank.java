package Ppokemons;

import ru.ifmo.se.pokemon.*;
import moves.Miltank.*;

public class Miltank extends Pokemon {
    public Miltank(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(95, 80, 105, 40, 70, 100);


        Present present = new Present(0, 90);
        Milk_Drink milk_drink = new Milk_Drink(0, 0);
        Double_Team double_team = new Double_Team(0, 0);
        Wake_up_slap wakeUpSlap = new Wake_up_slap(70, 100);


        super.setMove(present, milk_drink, double_team, wakeUpSlap);

    }


}
