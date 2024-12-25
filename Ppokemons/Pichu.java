package Ppokemons;

import ru.ifmo.se.pokemon.*;

import moves.Pichu.*;

public class Pichu extends Pokemon {
    public Pichu(String name, int level) {
        super(name, level);

        super.setType(Type.ELECTRIC);
        super.setStats(20, 40, 15, 35, 35, 60);

        Double_Team doubleTeam = new Double_Team(0, 0);
        Thunder_Wave thunderWave = new Thunder_Wave(0, 90);
        Psychic psychic = new Psychic(90, 100);
        super.setMove(doubleTeam, thunderWave, psychic);


    }

}
