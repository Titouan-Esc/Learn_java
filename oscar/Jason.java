package oscar;

public class Jason extends Player implements Fighter {
    @Override
    public void setmWeapon(String weapon) {
        this.mWeapon = weapon;
    }

    @Override
    public void fight() {
        System.out.println(this.mName + " casse la gueule de son adversaire");
    }
}
