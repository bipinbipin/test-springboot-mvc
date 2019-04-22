package mvc.controllers;

import mvc.models.ContactModel;
import mvc.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Bipin on 3/16/2016.
 */
@Controller

public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactGet(Model model) {
        model.addAttribute("contact", new ContactModel());

        return "contact";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String contactPost(@ModelAttribute("contact") ContactModel contactModel,
                              Model model) {

        System.out.println(contactModel.ToString());

        return "contact";
    }

    //region BOOTSTRAP VERSION

    @RequestMapping(value = "/contactBoot", method = RequestMethod.GET)
    public String contactGetBoot(Model model) {
        model.addAttribute("contact", new ContactModel());

        return "contactBootstrap";
    }

    @RequestMapping(value = "/contactBoot", method = RequestMethod.POST)
    public String contactPostBoot(@ModelAttribute("contact") ContactModel contactModel,
                              Model model) {

        //System.out.println(contactModel.ToString());
        contactRepository.save(contactModel);
        return "redirect:/contactBoot";
    }

    //endregion

}
