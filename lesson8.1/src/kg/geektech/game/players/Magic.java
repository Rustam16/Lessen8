package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero{

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperPower.BOOST, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random(0);
        int upDamage = random.nextInt(31);
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + upDamage);
            System.out.println("Magic применил супер способность и увеличил урон на : " + upDamage);
        }
    }
}
