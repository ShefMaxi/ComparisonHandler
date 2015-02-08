

public abstract class PackagedElement {

	
	protected String id;
	protected String type;
	

	public PackagedElement(String i, String t){
		
		id=i;
		type=t;
		
		
		}
	public String getId(){
		return id;
	};
	public String getType(){
		return type;
	};

}
