package com.rsmart.model;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="myBirthdayRecorder")
public class MyBirthdayRecorder {

	
	@EmbeddedId
	private MyBirthdayRecorderPrimaryKey myBirthdayRecorderPrimaryKey;
	
	
    private Date birthDate;
    private boolean status;
    private Date nextBirthday;
    
    
    
	public MyBirthdayRecorderPrimaryKey getMyBirthdayRecorderPrimaryKey() {
		return myBirthdayRecorderPrimaryKey;
	}
	public void setMyBirthdayRecorderPrimaryKey(MyBirthdayRecorderPrimaryKey myBirthdayRecorderPrimaryKey) {
		this.myBirthdayRecorderPrimaryKey = myBirthdayRecorderPrimaryKey;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getNextBirthday() {
		return nextBirthday;
	}
	public void setNextBirthday(Date nextBirthday) {
		this.nextBirthday = nextBirthday;
	}
    
	

   
}
