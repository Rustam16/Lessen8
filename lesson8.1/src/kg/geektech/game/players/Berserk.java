package kg.geektech.game.players;

import java.util.Random;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperPower.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random(2);
        int partDamage = random.nextInt(4);
        boss.setHealth(boss.getHealth() - (boss.getDamage() / partDamage));
        System.out.println("Berserk применил супер способность и критиковал босса на : " + boss.getDamage() / partDamage);
    }
}
