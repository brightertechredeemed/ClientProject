package classOrganization;
import java.util.List;
import java.util.ArrayList; 

public class Table {
	private ArrayList<Student> myMembers;
	public Table(){
		myMembers = new ArrayList<Student>();
	}
	public Table(ArrayList<Student> members){
		myMembers = new ArrayList<Student>();
		for (int i = 0;i<members.size();i++){
			myMembers.add(members.get(i));
		}
	}

}
