import weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new RPG(),
                new WaterPistol(),
                new Machine(),
                new Slingshot(),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot == weaponSlots.length) {
            System.out.println("нет такого оружия!!!!");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
