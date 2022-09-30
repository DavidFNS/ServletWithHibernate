package servletProject.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface NumberService {
    void getAllNumbers();
    void addNewNumber(HttpServletRequest request, HttpServletResponse response);
    void updateNumber(HttpServletRequest request, HttpServletResponse response);
    void deleteNumberById(Integer id);
}
