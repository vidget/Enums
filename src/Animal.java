
public enum Animal {
	CAT("buffy"), DOG("Fido"), MOUSE("Jerry");
	
	private String name;
	
	
	private Animal(String name){
		
		
		this.name=name;
		
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString(){
		return "This animal is called: "+ name;
	}
	

}
