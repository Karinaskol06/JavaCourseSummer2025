package SOLID.SingleResponsibility;

public class ModelMapper {
    //converts entity to dto
    public static ModelDto mapToDto(Model model) {
        ModelDto modelDto = new ModelDto();
        modelDto.setModelName(model.getModelName());
        modelDto.setDescription(model.getDescription());
        return modelDto;
    }

    //converts dto back to entity to *save* to the db
    public static Model mapToEntity(ModelDto modelDto) {
        Model model = new Model();
        model.setModelName(modelDto.getModelName());
        model.setDescription(modelDto.getDescription());
        return model;
    }
}
