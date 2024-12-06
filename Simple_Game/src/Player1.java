import java.security.PrivateKey;

public class Player1 {
    private String name;
    private String Weapon;
    private int health;


    public Player1(String name, String Weapon, int health) {
        this.name = name;
        this.Weapon = Weapon;
        if (health < 0 || health >100){
            this.health = 100;
        }else this.health = health;
        this.health = health;
    }



    public void damageByGun1() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 1.health is reduced by 30. " + "New health is " + this.health);
        if (this.health == 0) {
            System.out.println(getName()+"is dead");
        }
    }
    public void heal(){
        if (this.health <= 0) System.out.println("Player is Dead. Heal not possible");
        else this.health = 100;

        System.out.println("Health is "+this.health);
    }


    public void damageByGun2() {
        this.health -= 50;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 1.health is reduced by 50. " + "New health is " + this.health);
        if (this.health == 0) {
            System.out.println(getName()+" is dead");
        }

    }
    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}