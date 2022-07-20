public class Skeleton extends Boss{
    private  int aroow;

    public int getAroow() {
        return aroow;
    }

    public void setAroow(int aroow) {
        this.aroow = aroow;
    }


    public Skeleton(int health, int damage, int aroow) {
        super(health, damage);
        this.aroow = aroow;
    }

    public String info (){
        return super.info() + " " + aroow;
    }
}