import java.util.concurrent.ThreadLocalRandom;

/* mob should have health, mana
 *should be able to attackPlayer
 *receive damage
 *use skills that take up mana
 *dies if health = 0
 */

public class Mob extends Unit {

	public Mob(String name, int health, int mana, int attack, int magic) {
		_name = name;
		_health = health;
		_maxHealth = health;
		_mana = mana;
		_maxMana = mana;
		_attack = attack;
		_magic = magic;
	}
	
	protected void damageReceived(int damage) {
		_health -= damage;
	}
	
	protected void addSpells() {
		// TODO Auto-generated method stub
		
	}

	protected void inventory() {
		// TODO Auto-generated method stub
		
	}

	protected void showInfo() {
		System.out.println("Name: " + _name);
		System.out.println("Health : " + _health + "/" + _maxHealth);
		System.out.println("Mana : " + _mana + "/" + _maxMana);
		System.out.println("Attack: " + _attack);
		System.out.println("Magic: " + _magic);
	}
	
	protected void showHealth() {
		System.out.println("Health : " +_health);
	}

	
	
}
