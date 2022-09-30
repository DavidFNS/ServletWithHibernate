package servletProject.mapper;
import org.modelmapper.ModelMapper;
import servletProject.dto.NumberDto;
import servletProject.entity.Number;

public class NumberMapper {
    private static ModelMapper modelMapper = new ModelMapper();

    public static Number toEntity(NumberDto numberDto){
        return modelMapper.map(numberDto, Number.class);
    }

    public static NumberDto toDto(Number number){
        return modelMapper.map(number, NumberDto.class);
    }
}
