public class Magic extends Hero{
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(5) + 2;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i] && boss.getDefence() != SuperAbility.BOOST)
                heroes[i].setDamage(heroes[i].getDamage() + coefficient);


        }
        System.out.println(" Strange áóñòàíóë " + coefficient);

        return coefficient;
    }
}
}
