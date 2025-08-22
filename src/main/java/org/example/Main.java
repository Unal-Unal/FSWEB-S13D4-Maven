package org.example;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Unal",101,Weapon.AXE);
        System.out.println("healthRemaining: " + player.healthRemaining());

        Player player2 = new Player("Unal2",95,Weapon.SWORD);
        System.out.println("healthRemaining: " + player2.healthRemaining());

        player.loseHealth(Integer.valueOf( (int)(player2.getWeapon().getDamage()*player2.getWeapon().getAttackSpeed())));
        System.out.println("healthRemaining player after damage: " + player.healthRemaining());

        player.restoreHealth(55);
        System.out.println("healthRemaining player after restore: " +player.healthRemaining());
    }
}