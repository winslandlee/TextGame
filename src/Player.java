import java.util.concurrent.ThreadLocalRandom;

/*Player should have health and mana
 * can escape from battle
 * able to use skills that use mana
 * receive damage
 * pick up items
 * equip items
 * use items
 */
public class Player extends Unit {

	public Player(String name, int health, int mana, int attack, int magic) {
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
		
		
	}

	protected void inventory() {
		
				
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
