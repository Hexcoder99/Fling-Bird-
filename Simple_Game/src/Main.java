//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          Player1 player = new Player1("Lakshitha","AK-47",100);

//    System.out.println(player.getName());
//        System.out.println(player.getHealth());
//     System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();

        player.heal();


        }

    }
