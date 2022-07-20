public class Lesson_6 {
    public static void main(String[] args) {
        Boss boss = new Boss(500,50);
        boss.weaponType.setWeaponType("weapon");
        boss.weaponType.setWeaponName("infinity stones");
        System.out.println(boss.info());


        Skeleton skeleton = new Skeleton(100,33,11);
        skeleton.weaponType.setWeaponType("sword");
        skeleton.weaponType.setWeaponName("katana");
        System.out.println(skeleton.info());


        Skeleton skeleton2 = new Skeleton(150, 55,22);
        skeleton2.weaponType.setWeaponType("sword");
        skeleton2.weaponType.setWeaponName("tecak");
        System.out.println(skeleton2.info());


    }
}
