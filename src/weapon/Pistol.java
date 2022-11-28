package weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("пив!!!!! пав!!!!!");
    }
}
