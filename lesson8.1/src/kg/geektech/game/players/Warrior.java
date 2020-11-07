package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperPower.CRITICAL_DAMAGE, name);
    }

    /*Добавить в проект каждому классу героя свою уникальную способность
Berserk должен получать от босса урон, и потом наносить ему свой урон + часть урона полученного от босса
Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное количество
Warrior каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.*/
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int min = 2;
        int max = 4;
        int diff = max - min;
        Random random = new Random();
        int criticalDamage = random.nextInt(diff + 1);
        criticalDamage += min;
        System.out.println(criticalDamage);
        heroes[0].setDamage(20 * criticalDamage);
        System.out.println("Warrior применил суперспособность и критиковал босса на " + 20 * criticalDamage);

    }
}
