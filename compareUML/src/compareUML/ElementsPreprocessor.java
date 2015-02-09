package compareUML;

import java.util.ArrayList;

/*
 * This class is to preprocess the arraylist created by
 * xmi parser
 */
public class ElementsPreprocessor {
	
	//private String[] DIAGRAMTYPE = {"usecase", "class", ""};
	
	
	protected String diagramType;
	protected ArrayList<PackagedElement> diagramElements;
	
	public ElementsPreprocessor(ArrayList<PackagedElement> elements) {
		// TODO Auto-generated constructor stub
		this.diagramElements = elements;
		identifyDiagramType();
	}
	
	private boolean identifyDiagramType() {
		for (PackagedElement packagedElement : diagramElements) {
				if (packagedElement.getType().compareToIgnoreCase("Actor") == 0) {
					this.diagramType = "UseCase";
					System.out.println(this.diagramType);
					break;
				}
				else if (packagedElement.getType().compareToIgnoreCase("Class") == 0) {
					this.diagramType = "Class";
					System.out.println(this.diagramType);
					break;
				}
				else if (packagedElement.getType().compareToIgnoreCase("OpaqueAction") == 0) {
					this.diagramType = "Activity";
					System.out.println(this.diagramType);
					break;
				}
				else if (packagedElement.getType().compareToIgnoreCase("Class") == 0) {
					this.diagramType = "Class";
					System.out.println(this.diagramType);
					break;
				}
				
				
		}
		return true;
	}
	
	// accessors
	public String getDiagramType() {
		return diagramType;
	}
	
	public ArrayList<PackagedElement> rawElements() {
		return diagramElements;
	}
}
