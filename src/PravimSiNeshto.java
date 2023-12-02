import java.util.Random;
import java.util.Scanner;
public class PravimSiNeshto {
    public static void main(String[] args) {

        int player_hp = 10;
        while(player_hp > 0) {   //1. defeneitram player health

            String enemy = "";
            int hp = 0;
            int dmg = 0;

            Random random = new Random();
            int randomnumber = random.nextInt(4);

            if (randomnumber == 0) {
                enemy = "Orc";
                hp = 20;
                dmg = 2;
            }

            else if (randomnumber == 1) {
                enemy = "Troll";
                hp = 25;
                dmg = 4;
            }

            else if (randomnumber == 2) {
                enemy = "Wolf";
                hp = 10;
                dmg = 1;
            }

            else if (randomnumber == 3) {
                enemy = "Dragon";
                hp = 30;
                dmg = 9;
            }


            final int sword = 10;
            final int mace = 12;
            final int axe = 15;
            final int rapier = 6;
            int choice = 0;


            Scanner input = new Scanner(System.in);

            // Get inputs from user.
            System.out.println("Are you ready for battle? You have:" + player_hp + " Health");
            String otg = input.nextLine();

            if (otg.equalsIgnoreCase("yes")) {
                for (int i = 1; i <= 2; i++) {
                    System.out.println("You have to choose from: Sword, Mace, Axe, Rapier, to kill your enemy in Two hits.");
                    System.out.println("There is an "+ enemy +". What weapon do you choose?" + enemy + " Health:" + (hp));

                    String otg2 = input.nextLine().toLowerCase();

                    if (otg2.equals("sword")) {
                        hp = hp - sword;
                        System.out.println("Nice hit. " + enemy + " remaining health:" + hp);

                    } else if (otg2.equals("mace")) {
                        hp = hp - mace;
                        System.out.println("Nice hit. " + enemy + " remaining health:" + hp);
                    } else if (otg2.equals("axe")) {
                        hp = hp - axe;
                        System.out.println("Nice hit. " + enemy + " remaining health:" + hp);

                    } else if (otg2.equals("rapier")) {
                        hp = hp - rapier;
                        System.out.println("Nice hit. " + enemy + " remaining health:" + hp);

                    }
                    if (hp <= 0) {
                        System.out.println("You killed it ! ");
                        break;
                    }




                }

                if (hp > 0) {

                    player_hp = player_hp - dmg;
                    System.out.println(enemy +" is stabbing you, You lost:" + dmg + "Health");
                }


            }

        }

        System.out.println("You died");


    }
}
