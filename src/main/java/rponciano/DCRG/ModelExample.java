package rponciano.DCRG;

import java.io.Serializable;

public class ModelExample implements Serializable {

	private static final long serialVersionUID = -7605488868141925587L;

	private Long id;
	private String name; 
	
	public ModelExample(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method MUST be @Override in your model class. 
	 * It must return the String that wants to be 
	 * displayed next to the CheckBox / RadioButton  
	 */
	@Override
	public String toString() {
		return name;
	}
	
}