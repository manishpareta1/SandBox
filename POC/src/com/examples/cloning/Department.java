package com.examples.cloning;

public class Department implements Cloneable
{
    private int id;
    private String name;
 
    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    //Accessor/mutators methods will go there
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
    
    public String toString(){
    	
    	return "Dept id= "+ id + " | " + "Dept name "+ name;
    	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
    
    
}
