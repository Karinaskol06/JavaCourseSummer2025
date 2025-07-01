package SOLID.SingleResponsibility;

public class ModelDto {
    private String modelName;
    private String description;

    public ModelDto(String modelName, String description) {
        this.modelName = modelName;
        this.description = description;
    }

    public ModelDto() {}

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
}
