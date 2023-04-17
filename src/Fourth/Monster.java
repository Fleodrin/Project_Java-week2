package Fourth;

public class Monster {
    int hp;

    public Monster(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

class Hunter {
    public void attack(Monster monster, int power) {
        int newHp = monster.getHp() - power;
        monster.setHp(newHp);
    }

    public static void main(String[] args) {
        Monster monster = new Monster(1000);

        Hunter hunter = new Hunter();

        int attackPower = 100;
        hunter.attack(monster, attackPower);
        System.out.println("Hunter attacked Monster with a power of " + attackPower + ".");

        System.out.println("Monster has " + monster.getHp() + " hp");
    }
}

