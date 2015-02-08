package compareUML;
import java.util.ArrayList;
import java.util.Iterator;

public class LecturerExample {
	protected ArrayList<PackagedElement> umlElements;
	protected String fileName;
	public LecturerExample() {
		// TODO Auto-generated constructor stub
		this.umlElements = new ArrayList<PackagedElement>();
		fileName = "usecase demo";
		this.umlElements.add(new UMLElement("Actor", "ertyuio", "Paul"));
		this.umlElements.add(new UMLElement("Actor", "gthyjik2", "Kyle"));
		this.umlElements.add(new UMLElement("UseCase", "kjhgf", "This is a usecase"));
		this.umlElements.add(new AssociationElement("gsfg", "ertyuio", "kjhgf"));
		this.umlElements.add(new AssociationElement("fghdfadf", "gthyjik2", "kjhgf"));
	}

	public ArrayList<PackagedElement> getUmlElements() {
		return umlElements;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.umlElements.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LecturerExample lectureDiagram = new LecturerExample();
		ArrayList<PackagedElement> result = lectureDiagram.getUmlElements();
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}