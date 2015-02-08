package compareUML;

public class AssociationElement {

	public AssociationElement(String id, String firstMember, String secondMember) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.firstMemberEnd = firstMember;
		this.secondMemberEnd = secondMember;
	}
	//private String type;//private String name;
	private String id;
	private String firstMemberEnd;
	private String secondMemberEnd;
	
	public String getFirstMemberEnd() {
		return firstMemberEnd;
	}
	
	public String getSecondMemberEnd() {
		return secondMemberEnd;
	}
	
	public String getId() {
		return id;
	}
	
}
