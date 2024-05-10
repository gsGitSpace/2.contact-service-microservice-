package customerServiceApi.Service;

import java.util.List;

import customerServiceApi.Entity.Contact;

public interface ContactService {
	public List<Contact> getContactOfUser(Long userId);

}
