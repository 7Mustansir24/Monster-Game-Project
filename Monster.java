/*------------------------------------------------------------ 
// AUTHOR: MUSTANSIR M SAHEB 
// FILENAME: MONSTER FILE
// SPECIFICATION: CLASSES
// FOR: CSE 110- ASSIGNMENT07
// TIME SPENT: 2 HOURS //--------------------
---------------------------------------*/ 



class Monster {
	private String name;
	private int healthScore;
	private Weapon weapon = null;
	
	public Monster(String name, int healthScore, Weapon weapon) 	{
		this.name = name;
		this.healthScore = healthScore;
		this.weapon = weapon;
	}
	
	public String getName() 	{
	  return name;
	}
	public int getHealthScore() 	{
		return healthScore;
	}
	
	public String getWeaponName() 	{
		
		String name = weapon.getName();
		return name;
	}
	

	public int attack(Monster oponent) 	{
		int damage = (int) (Math.random() * weapon.getMaxDamage());
		oponent.healthScore -= damage;
    
    return damage; 
	}
	
	private void displayAttackInfo(int damage, Monster oponent) 	{
		System.out.printf("%s attacks with his %s,  doing %d damage to %s\n",
				name, weapon.getName(), damage, oponent.getName());
	}
}

