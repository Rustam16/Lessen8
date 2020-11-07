package kg.geektech.game.players;

public class Tank extends Hero {
    public Tank(int health, int damage, String name) {
        super(health, damage, SuperPower.GUN, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {


    }
}