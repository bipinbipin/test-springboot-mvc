package mvc.controllers;

import mvc.models.FormModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Bipin on 3/14/2016.
 */
@Controller
public class FormController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    String form(Model model){

        model.addAttribute("attr", "This is a simple attribute");

//        FormModel formModel = new FormModel();
//        model.addAttribute("selectBoxList", formModel.getSelectBoxList());
//        model.addAttribute("formModel", formModel);

        return "form";
    }


    @RequestMapping(value = "/form", method = RequestMethod.POST)
    String formPost(@RequestParam("unBoundTextBox") String unBoundTextBox, Model model){
        //model.addAttribute("formModel", new FormModel());
        System.out.println("POSTBACK SUBMIT.");
        System.out.println(unBoundTextBox);

        return "form";
    }


    @RequestMapping(value = "/pathVar/{id}", method = RequestMethod.GET)
    String formPathVar(@PathVariable String id) {
        System.out.println("Path Variable value = " + id);

        return "form";
    }
}
