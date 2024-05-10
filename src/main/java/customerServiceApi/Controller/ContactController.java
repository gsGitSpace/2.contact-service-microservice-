package customerServiceApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import customerServiceApi.Entity.Contact;
import customerServiceApi.Service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping("/user/{userId}")
	public List<Contact> getContracts(@PathVariable("userId") Long userId) {
		return this.contactService.getContactOfUser(userId);
	}
}
