package compareUML;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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

		System.out.println("=================================");
		ElementsPreprocessor preprocessor = new ElementsPreprocessor(result);
		HashMap<String, ArrayList<PackagedElement>> myMap = preprocessor.preprocessForUseCase();
		Set<String> myKeys = myMap.keySet();
		System.out.println(myKeys);
	}

}
