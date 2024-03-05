package tutorial.Latihan;

/**
 * player
 */
class Player {
    String Name;
    double Health;
    boolean ArmorBreak;
    boolean PlayerDied;
    Weapon weapon;
    Armor armor;

    Player(String Name, Double Health) {

        this.Name = Name;
        this.Health = Health;
    }

    // menghubungkan class wepon dengan player

    void EquipWeapon(Weapon weapon) {

        this.weapon = weapon;
        System.out.println("\n \n" + this.Name + " Menggunakan senjata : " + this.weapon.WeaponName);
    }

    void EquipArmor(Armor armor) {
        this.armor = armor;
        System.out.println("\n \n" + this.Name + " Menggunakan armor : " + this.armor.ArmorName);

    }

    void ShowPlayer() {
        System.out.println("\n This is Player \n");
        System.out.println("Player Name      : " + this.Name);
        System.out.println("Player Health    : " + this.Health);
        System.out.println("Player Weapon    : " + this.weapon.WeaponName);
        System.out.println("Player Armor     : " + this.armor.ArmorName);
        System.out.println("Weapon Power     : " + this.weapon.WeaponPower);
        System.out.println("Armor  Health    : " + this.armor.ArmorHealth);
    }

    // opponent adalah objek yang dituju
    void Attack(Player opponentPlayer) {
        System.out.println(this.Name + " Attacking " + opponentPlayer.Name);
    }

    void GetDamage(Player opponentPlayer) {
        System.out.println(this.Name + " gets damage : " + opponentPlayer.weapon.WeaponPower);

        double JumlahArmorTersisa = this.armor.ArmorHealth - opponentPlayer.weapon.WeaponPower;

        if (JumlahArmorTersisa <= 0 && PlayerDied != true) {

            ArmorBreak = true;
            this.armor.ArmorHealth = 0;
            this.Health = (JumlahArmorTersisa + this.Health);

            if (this.Health <= 0 && ArmorBreak == true) {
                this.Health = 0;
                System.out.println(" => " + opponentPlayer.Name + " kill " + this.Name);
                PlayerDied = true;

            } else {
                System.out.println("Warning, Armour Break!!...");
                System.out.println(" => " + this.Name + " Armor  : " + this.armor.ArmorHealth);
                System.out.println(" => " + this.Name + " Health : " + this.Health);

            }
        }

        else {
            if (JumlahArmorTersisa >= 0) {
                this.armor.ArmorHealth = JumlahArmorTersisa;
                System.out.println(this.Name + " Armor  : " + this.armor.ArmorHealth);
                System.out.println(this.Name + " Health : " + this.Health);
            }

        }

    }

}

/**
 * weapon
 */
class Weapon {
    String WeaponName;
    double WeaponPower;

    Weapon(String WeaponName, Double WeaponPower) {

        this.WeaponName = WeaponName;
        this.WeaponPower = WeaponPower;

    }

    void ShowWeapon() {

        System.out.println("\n This is Weapon \n");
        System.out.println("Weapon Name   : " + this.WeaponName);
        System.out.println("Weapon Power  : " + this.WeaponPower);
    }

}

/**
 * armor
 */
class Armor {
    String ArmorName;
    double ArmorHealth;

    Armor(String ArmorName, Double ArmorHealth) {
        this.ArmorName = ArmorName;
        this.ArmorHealth = ArmorHealth;
    }

    void ShowArmor() {
        System.out.println("\n This Is Armor \n");
        System.out.println("Armor Name   : " + this.ArmorName);
        System.out.println("Armor Health : " + this.ArmorHealth);
    }

}

public class SimpelGame {

    public static void main(String[] args) {

        // membuat objek
        Player Yosua = new Player("Yosua Jelianfero Solissa", 100.00);

        Weapon Senjata = new Weapon("BlackSword", 300.00);
        Armor Pelindung = new Armor("BlackMetal Armor", 200.00);

        // menampilkan objek

        // Senjata.ShowWeapon();
        // Pelindung.ShowArmor();

        // menggunakan objek weapon dan armor untuk player yosua

        Yosua.EquipWeapon(Senjata);
        Yosua.EquipArmor(Pelindung);
        // menampilkan objek yang dipakai oleh Yosua
        // System.out.println("\n \n menampilkan detail objek yang dipakai oleh Yosua
        // \n");

        // Yosua.weapon.ShowWeapon();
        // Yosua.armor.ShowArmor();

        // menampilkan status player yosua
        Yosua.ShowPlayer();

        // membuat objek ke 2

        Player Ian = new Player("Ian Solissa", 100.00);
        Weapon Senjata2 = new Weapon("GoldenSword", 175.00);
        Armor Pelindung2 = new Armor("Golden Armor", 250.00);

        Ian.EquipWeapon(Senjata2);
        Ian.EquipArmor(Pelindung2);
        Ian.ShowPlayer();

        System.out.println("\n\n                      Battle Day..                \n\n");
        System.out.println("\n");
        Yosua.Attack(Ian);
        Ian.GetDamage(Yosua);
        System.out.println("\n\n");
        Ian.Attack(Yosua);
        Yosua.GetDamage(Ian);

        System.out.println("\n\n");
        Ian.Attack(Yosua);
        Yosua.GetDamage(Ian);

        // System.out.println("\n\n");
        // Yosua.Attack(Ian);
        // Ian.GetDamage(Yosua);
        System.out.println("\n \n                       Battle End            \n \n");
    }
}