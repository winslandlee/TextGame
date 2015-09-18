
public abstract class Unit {
	protected String _name;
	protected int _health;
	protected int _maxHealth;
	protected int _mana;
	protected int _maxMana;
	protected static int _attack;
	protected int _magic;
	
	
	protected abstract void damageReceived(int damage);
	protected abstract void addSpells();
	protected abstract void inventory();
	protected abstract void showInfo();
	protected abstract void showHealth();
}
