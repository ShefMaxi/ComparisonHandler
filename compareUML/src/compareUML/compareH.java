package compareUML;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class compareH {
	public static String[] forkeys(HashMap h) {
		Set<String> myKeys = h.keySet();
		String[] keys = new String[myKeys.size()];
		myKeys.toArray(keys);
		return keys;
	}

	public compareH() {
		// public static void main(String[] args) {
		int correctnumber = 0;
		LecturerExample l = new LecturerExample();
		StudentExample s = new StudentExample();
		ElementsPreprocessor lectureProcessor = new ElementsPreprocessor(
				l.umlElements);
		HashMap<String, ArrayList<PackagedElement>> LecturerMap = lectureProcessor
				.preprocessForUseCase();
		ElementsPreprocessor studentProcessor = new ElementsPreprocessor(
				s.umlElements);
		HashMap<String, ArrayList<PackagedElement>> StudentMap = studentProcessor
				.preprocessForUseCase();

		// ---------------------------------------------------------------------------------------
		String[] StudentKeys = forkeys(StudentMap);
		String[] LecturerKeys = forkeys(LecturerMap);

		for (String key : LecturerKeys) {
			ArrayList<PackagedElement> lecturerElements = LecturerMap.get(key);
			ArrayList<PackagedElement> studentElements = StudentMap.get(key);
			for (PackagedElement packagedElement : lecturerElements) {
				if (packagedElement instanceof UMLElement) {
					UMLElement ele = (UMLElement) packagedElement; // lecture's
					for (PackagedElement stdEle : studentElements) {
						if (ele.getName().compareToIgnoreCase(
								((UMLElement) stdEle).getName()) == 0) {
							correctnumber++;
						}
					}
				} else if (packagedElement instanceof AssociationElement) {

				}
			}
		}
		System.out.println(correctnumber);
	}
}
