public class Main {
    public static void main(String[] args) {
Boss boss = new Boss();
boss.setHealth(100);
boss.setDamage(200);
boss.weapon.setName("kalashnikov");
boss.weapon.setWeaponType(WeaponType.FIRE );
        System.out.println("health: " + boss.getHealth() + "\ndamage: "+boss.getDamage() + "\nweapon name: "+ boss.weapon.getName() + "\nweapon type: "+ boss.weapon.getWeaponType());
    }
}