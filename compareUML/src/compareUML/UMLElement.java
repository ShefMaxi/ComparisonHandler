package compareUML;

public class UMLElement {
	private String type;
	private String id;
	private String name;
	public UMLElement(String type, String id, String name) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getId() {
		return id;
	}
	
}
