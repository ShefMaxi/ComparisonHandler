package compareUML;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * This class is to preprocess the arraylist created by
 * xmi parser
 */
public class ElementsPreprocessor {

	// private String[] DIAGRAMTYPE = {"usecase", "class", ""};
	protected String[] USECASE_ELEMENT = { "Actor", "Usecase", "Association" };
	protected String diagramType;
	protected ArrayList<PackagedElement> diagramElements;

	// accessors
	public String getDiagramType() {
		return diagramType;
	}

	public ArrayList<PackagedElement> getRawElements() {
		return diagramElements;
	}

	public ElementsPreprocessor(ArrayList<PackagedElement> elements) {
		// TODO Auto-generated constructor stub
		this.diagramElements = elements;
		identifyDiagramType();
	}

	protected boolean identifyDiagramType() {
		for (PackagedElement packagedElement : diagramElements) {
			if (packagedElement.getType().compareToIgnoreCase("Actor") == 0) {
				this.diagramType = "UseCase";
				System.out.println(this.diagramType);
				return true;
			} else if (packagedElement.getType().compareToIgnoreCase("Class") == 0) {
				this.diagramType = "Class";
				System.out.println(this.diagramType);
				return true;
			} else if (packagedElement.getType().compareToIgnoreCase(
					"OpaqueAction") == 0) {
				this.diagramType = "Activity";
				System.out.println(this.diagramType);
				return true;
			} else if (packagedElement.getType().compareToIgnoreCase("State") == 0) {
				// need to re-check
				this.diagramType = "StateMachine";
				System.out.println(this.diagramType);
				return true;
			}
		}
		return false;
	}

	protected HashMap<String, ArrayList<PackagedElement>> preprocessForUseCase() {
		HashMap<String, ArrayList<PackagedElement>> result = new HashMap<String, ArrayList<PackagedElement>>();
		if (this.diagramType.compareToIgnoreCase("usecase") == 0) {
			// can be optimized.
			for (String usecaseElement : USECASE_ELEMENT) {
				ArrayList<PackagedElement> processedElement = new ArrayList<PackagedElement>();

				for (PackagedElement packagedElement : diagramElements) {
					if (packagedElement.getType().compareToIgnoreCase(
							usecaseElement) == 0) {
						processedElement.add(packagedElement);
					}
				}

				result.put(usecaseElement, processedElement);
			}
		}
		return result;
	}

}
