import java.util.ArrayList;
import java.util.List;

import org.soa.ws.tp4.PersonService;
import org.soa.ws.tp4.PersonServiceImplService;


public class PersonWebServiceClient {

	public static void main(String[] args) {
		
		PersonServiceImplService service = new PersonServiceImplService();
		PersonService person = service.getPersonServiceImplPort();
		
		System.out.println(person.getPersonId("Nom 4"));
		
		List<String> personIdList = new ArrayList<String>();
		personIdList.add("Nom 3");
		personIdList.add("Nom 2");
		personIdList.add("Nom 4");
		
		List<String> personNameList = new ArrayList<String>();
		personNameList = person.getPersonIdList(personIdList);
		for(int i=0; i<personNameList.size(); i++)
		  System.out.println(personNameList.get(i));
	}

}
