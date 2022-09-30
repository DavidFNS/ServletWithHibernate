package servletProject.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface OrderService {
    void getAllOrders();
    void addNewOrder(HttpServletRequest request, HttpServletResponse response);
    void updateOrder(HttpServletRequest request, HttpServletResponse response);
    void deleteOrderById(Integer id);
}
