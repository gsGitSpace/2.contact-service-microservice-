package customerServiceApi.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import customerServiceApi.Entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list = Arrays.asList(
			new Contact (1L, "amit@gmail.com","Amit",1311L),
			new Contact (2L, "anil@gmail.com","Anil",1311L),
			new Contact (3L, "rohan@gmail.com","rohan",1313L),
			new Contact (4L, "sameer@gmail.com","sameer",1314L)
			);

	public List<Contact> getContactOfUser(Long userId) {
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
