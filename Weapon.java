/*------------------------------------------------------------ 
// AUTHOR: MUSTANSIR M SAHEB 
// FILENAME: WEAPON FILE
// SPECIFICATION: CLASSES
// FOR: CSE 110- ASSIGNMENT07
// TIME SPENT: 2 HOURS //--------------------
---------------------------------------*/ 


class Weapon {
  private int maxDamage;
  private String name;

  public Weapon() {
    this.name = "Pointy Stick";
    this.maxDamage = 1;
  }

//overloaded constructor
	public Weapon(String name, int damage) {
		this.name = name;
		this.maxDamage = damage;
	}
	
	
  public String getName() {
    return name;
  }
  
  public void setName(String newName) {
	  
	  this.name = newName;
  }

  public int getMaxDamage() {
    return this.maxDamage;
  }
  
  public void setMaxDamage(int newMaxDamage) {
	  
	  this.maxDamage = newMaxDamage;
  }
}
