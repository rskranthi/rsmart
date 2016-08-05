package com.rsmart.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MyBirthdayRecorderPrimaryKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected String firstName;
    protected String lastName;
    
    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	//overriding equals and hashCode method to ensure objects are compared with primary key
	   @Override
	   public boolean equals(Object obj)
	   {
		   if(this==obj) return true;
		   
		   if(obj==null) return false;
		   
		   if(this.getClass()!=obj.getClass()) return false;
		   
		   MyBirthdayRecorderPrimaryKey other = (MyBirthdayRecorderPrimaryKey) obj;
		   
		   if(this.firstName==null)
		   {
			   if(other.firstName!=null)
				   return false;
		   }
		   else if(!this.firstName.equals(other.firstName)) return false;
		   
		   
		   if(this.lastName==null)
		   {
			   if(other.lastName!=null)
		   
				   return false;
		   }
			   
		   else if(!this.lastName.equals(other.lastName)) return false;
		   
		   return true;
	   }
	   
	   
	   @Override
	   public int hashCode()
	   {
		   final int prime=31;
		   int result=1;
		   
		   result = prime*result + ((this.firstName==null)?0:this.firstName.hashCode());
		   result = prime*result + ((this.lastName==null)?0:this.lastName.hashCode());
		   
		   return result;
	   }
}
