package client;

import filter.Field;
import interfaces.IEmail;

public abstract class Rule {

	Field f;
	
	public Field getF() {
		return f;
	}

	public void setF(Field f) {
		this.f = f;
	}

	public abstract boolean satisfy(IEmail e);

	

	private void setString(String s) {
		// TODO Auto-generated method stub
		
	}
}
