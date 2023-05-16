package homework2;

class Dog extends MyUtility<Dog> implements Comparable<Dog> {
	private String name ;
    private int age ;
    
    public Dog() {
    	
    }
    
    public Dog( String name, int age ) {
    	this.name = name ;
    	this.age = age ;   	
    }
    
    public String getName() {
    	return name ;
    }
    
    public int getAge() {
    	return age ;
    }
    
    public int compareTo( Dog other ) {
    	return Integer.compare( this.age, other.age ) ;
    }
    
}
