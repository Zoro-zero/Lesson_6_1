public class Lesson_6 {
    public static void main(String[] args) {

Boss boss=new Boss();
boss.setNameWeapon("infinity stones");
boss.setHealth(400);
boss.setDamage(50);
        System.out.println("Boss weapon: "+ boss.getNameWeapon()+ " "+ " Boss Health : "+boss.getHealth()+
                " "+ " Boss damage : "+boss.getDamage());
        Boss boss1=new Boss();
        boss1.printinfo();
        //System.out.println(boss1.printinfo());
    Skeleton skeleton1=new Skeleton();
    Skeleton skeleton2=new Skeleton();
    skeleton1.setDamage(13); skeleton1.setHealth(99);
    skeleton2.setDamage(14); skeleton2.setHealth(100);
        System.out.println("Damage skilleta1: "+skeleton1.getDamage() +" "+ " Health Skillet1: "+ skeleton1.getHealth());
        System.out.println("Damage skilleta2: "+skeleton2.getDamage() +" "+ " Health Skillet2: "+ skeleton2.getHealth());

    }
}
