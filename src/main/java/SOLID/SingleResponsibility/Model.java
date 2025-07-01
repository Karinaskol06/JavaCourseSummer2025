package SOLID.SingleResponsibility;

public class Model {
    private Long id;
    private String modelName;
    private String description;

    public Model(Long id, String modelName, String description) {
        this.id = id;
        this.modelName = modelName;
        this.description = description;
    }
    public Model(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return modelName + " " + description;
    }
}
