package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dennis on 21-3-17.
 */
@Controller
public class WorkController {

    @RequestMapping(value = "/work")
    public String index(){
        return "index";
    }

}
