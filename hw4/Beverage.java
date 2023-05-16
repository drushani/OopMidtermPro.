package hw4;

class Beverage implements BlackTea, GreenTea, Milk, Pearl, Sugar  {
	private String drink ;
	private int cost ;
	
	public Beverage() {
		drink = "\0" ;
		cost = 0 ;
	}
	
	public String addBlackTea() {
		cost += 20 ;
		return drink + "¬õ¯ù\n" ;
	}
	
	public String addGreenTea() {
		cost += 20 ;
		return drink + "ºñ¯ù\n" ;
	}
	
	public String addMilk() {
		cost += 20 ;
		return drink + "¤û¥¤\n" ;
	}
	
	public String addPearl() {
		cost += 10 ;
		return drink + "¯»¶ê\n" ;
	}
	
	public String addSugar() {
		cost += 5 ;
		return drink + "¿}" ;
	}
	
	public String getIngredient() {
		return drink ;
	}
	
	public int getCost() {
		return cost ;
	}
}
