package works.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;
import works.processor.domain.WorkUnit;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkHandler.class);

    private List<WorkUnit> workList = new ArrayList<WorkUnit>();

    @StreamListener(WorkUnitsSink.CHANNEL_NAME)
    public void process(WorkUnit workUnit) {
        workList.add(workUnit);
        LOGGER.info("Handling work unit - id: {}, definition: {}", workUnit.getId(), workUnit.getDefinition());
    }

    public List<WorkUnit> getWorkList(){
        return workList;
    }

}
