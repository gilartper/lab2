package App;

import Ppokemons.*;
import ru.ifmo.se.pokemon.*;
import moves.Pichu.Psychic;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();


        Miltank miltank = new Miltank("нож", 3);
        Raichu raichu = new Raichu("кту", 3);
        Cacnea cacnea = new Cacnea("фтми", 2);
        Cacturne cacturne = new Cacturne("тинт", 3);
        Pichu pichu = new Pichu("фтмф", 1);
        Pikachu pikachu = new Pikachu("пятьдесят два", 2);

        b.addFoe(miltank);
        b.addAlly(raichu);
        b.addFoe(cacnea);
        b.addAlly(cacturne);
        b.addFoe(pichu);
        b.addAlly(pikachu);

        b.go();
        System.out.println(Psychic.i+" раз атаковал Psychic");
    }

}