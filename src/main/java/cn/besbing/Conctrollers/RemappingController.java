package cn.besbing.Conctrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RemappingController {



    @RequestMapping(value = "/taskDetailInfo",method = RequestMethod.GET)
    public String taskDetailInfo(){
        //return "http://10.0.11.82:8080/webroot/decision/view/report?viewlet=Report002-SQL.cpt&op=view";
        return "/pages/taskInfo";
    }


}
