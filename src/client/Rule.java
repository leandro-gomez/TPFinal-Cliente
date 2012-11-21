package client;

public abstract class Rule {

	Field f;
	
	public Field getF() {
		return f;
	}

	public void setF(Field f) {
		this.f = f;
	}

	public abstract boolean satisfy(IEmail e);
	
}