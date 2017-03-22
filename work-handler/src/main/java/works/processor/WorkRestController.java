package works.processor;

/**
 * Created by dennis on 21-3-17.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import works.processor.domain.WorkUnit;

import java.util.Collections;
import java.util.List;

@RestController
public class WorkRestController {

    @Autowired
    private WorkHandler workHandler;

    @RequestMapping("/api/work")
    @ResponseBody
    public List<WorkUnit> work(WorkUnit workUnit){
        return workHandler.getWorkList();
    }



}
