package oscar;

abstract public class Player {
    protected String mName;
    protected int mPv;
    protected int mEnd;
    protected String mWeapon;

    public void setStat(String name, int pv, int end) {
        this.mName = name;
        this.mPv = pv;
        this.mEnd = end;
    }

    public void myStat() {
        System.out.println("Combattant " + this.mName + " | PV = " + this.mPv + " | End = " + this.mEnd + " | Arme = " + this.mWeapon);
    }

    abstract public void setmWeapon(String weapon);
}
