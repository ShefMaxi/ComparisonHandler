package compareUML;

public class UMLElement extends PackagedElement {

	protected String name;
	public UMLElement(String type, String id, String name) {
		// TODO Auto-generated constructor stub
		super(type, id);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
