package compareUML;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class compareH {	
	public static String[] forkeys(HashMap h){			
		Set<String> myKeys = h.keySet();
		String[] keys = new String[myKeys.size()];
		myKeys.toArray(keys);
		return keys;
	}
	
	public static void main(String[] args){
		int correctnumber=0;
		LecturerExample l=new LecturerExample();
		StudentExample s=new StudentExample();
		ElementsPreprocessor e=new ElementsPreprocessor(l.umlElements);
		HashMap<String, ArrayList<PackagedElement>> LecturerMap=e.preprocessForUseCase();
		ElementsPreprocessor E=new ElementsPreprocessor(s.umlElements);
		HashMap<String, ArrayList<PackagedElement>> StudentMap=E.preprocessForUseCase();
		
	//---------------------------------------------------------------------------------------	
		String[] StudentKeys= forkeys(StudentMap);
		String[] LecturerKeys= forkeys(LecturerMap);
		
	//---------------------------------------------------------------------------------------			
		for(int i=0;i<LecturerMap.size();i++){
			for(int j=0;j<StudentMap.size();j++){
				for(int n=0;n<LecturerMap.get(StudentKeys[i]).size();n++){
				for(int m=0;m<StudentMap.get(LecturerKeys[j]).size();m++){
					ArrayList<PackagedElement> a = StudentMap.get(StudentKeys[j]);
					ArrayList<PackagedElement> b = LecturerMap.get(LecturerKeys[i]);
			if(a.get(n) instanceof AssociationElement&&b.get(m))		
					UMLElement A= (UMLElement)a.get(n);
					UMLElement B= (UMLElement)b.get(m);
if(B.getType().compareToIgnoreCase(A.getType())==0){
	   if(B.getName().compareToIgnoreCase(A.getName())==0){
	correctnumber++;
	   }
}					
				}
				}
				
			}
		}
		System.out.println(correctnumber);
	}
}
