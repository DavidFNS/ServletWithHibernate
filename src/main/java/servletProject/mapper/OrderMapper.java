package servletProject.mapper;

import org.modelmapper.ModelMapper;
import servletProject.dto.NumberDto;
import servletProject.dto.OrderDto;
import servletProject.entity.Number;
import servletProject.entity.Order;

public class OrderMapper {
    private static ModelMapper modelMapper = new ModelMapper();

    public static Order toEntity(OrderDto orderDto){
        return modelMapper.map(orderDto, Order.class);
    }

    public static OrderDto toDto(Order order){
        return modelMapper.map(order, OrderDto.class);
    }

}
