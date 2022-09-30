package servletProject.mapper;

import org.modelmapper.ModelMapper;
import servletProject.dto.ModelDto;
import servletProject.entity.Model;

public class ModelsMapper {
    private static ModelMapper modelMapper = new ModelMapper();
    public static Model toEntity(ModelDto modelDto){
        return modelMapper.map(modelDto, Model.class);
    }

    public static ModelDto toDto(Model model){
        return modelMapper.map(model, ModelDto.class);
    }

}
