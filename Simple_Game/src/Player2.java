public class Player2 extends Player1{
    private  int health;
    private boolean armour;

    public Player2(String name,String Weapon,int health,boolean armour) {
        super(name, Weapon , health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            this.health -=20;
            if(this.health <=0) this.health = 0;
            System.out.println("armour is on.Got hit by gun 1.Health is reduced by 20." +
                    "New Health is "+ this.health);
        } if(!armour) {
            this.health -=30;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armour is off.Got hit by gun 1.Health is reduced by 30.New Health is " +this.health);
        }if (this.health == 0) {
            System.out.println(getName() + "is Dead");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health -=40;
            if(this.health <=0) this.health = 0;
            System.out.println("armour is on.Got hit by gun 1.Health is reduced by 40." +
                    "New Health is "+ this.health);
        } if(!armour) {
            this.health -=50;
            if (this.health <= 0) this.health = 0;
            System.out.println("Armour is off.Got hit by gun 1.Health is reduced by 50.New Health is " +this.health);
        }if (this.health == 0) {
            System.out.println(getName() + "is Dead");
        }
    }

    @Override
    public void heal() {

    }
}


