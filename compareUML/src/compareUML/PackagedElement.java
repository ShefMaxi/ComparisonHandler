package compareUML;

public abstract class PackagedElement {
	protected String type;
	protected String id;
	public PackagedElement(String type, String id) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.id = id;
	}

	public String getType() {
		return type;
	}
	public String getId() {
		return id;
	}
	
	public PackagedElement() {
		// TODO Auto-generated constructor stub
	}

}
