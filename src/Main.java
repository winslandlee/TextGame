import java.util.concurrent.ThreadLocalRandom;

/* create four areas for player to be in
 * let player be able to navigate through areas
 * 
 */


public class Main {

	public static void main(String[] args) {
	Mob mob = new Mob("Koopa", 50, 25, 3, 2);
	Player player = new Player("Mario", 100, 50, 5, 5);
	
	mob.showInfo();
	player.showInfo();
	
	int damage = playerDamage();
	//mobDamage();
	mob.damageReceived(damage);
	mob.showHealth();

	mob.damageReceived(damage);
	mob.showHealth();

	mob.damageReceived(damage);
	mob.showHealth();
	
	}
	
	public static int playerDamage() {
		int MinDamage = Player._attack ;
		int MaxDamage = Player._attack * 2;
		int damage = ThreadLocalRandom.current().nextInt(MinDamage, MaxDamage);
		return damage;
			
	}
	public static int mobDamage() {
		int MinDamage = Mob._attack ;
		int MaxDamage = Mob._attack * 2;
		int damage = ThreadLocalRandom.current().nextInt(MinDamage, MaxDamage);
		return damage;
			
	}
}
