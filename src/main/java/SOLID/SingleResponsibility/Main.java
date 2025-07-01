package SOLID.SingleResponsibility;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.setModelName("My Model");
        model.setDescription("My Description");

        ModelDto dto = ModelMapper.mapToDto(model);
        System.out.println(dto.getModelName());
        System.out.println(dto.getDescription());

        Model entity = ModelMapper.mapToEntity(dto);
        System.out.println(entity);
    }
}
