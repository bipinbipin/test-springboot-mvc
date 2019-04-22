package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bipin on 3/14/2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
