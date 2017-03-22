package works.processor.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkUnit {

    private String id;
    private String definition;

    public WorkUnit() {}

    @JsonCreator
    public WorkUnit(@JsonProperty("id") String id,
                    @JsonProperty("definition") String definition) {
        this.id = id;
        this.definition = definition;
    }

    public String getId() {
        return id;
    }


    public String getDefinition() {
        return definition;
    }

}
