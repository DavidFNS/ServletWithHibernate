package servletProject.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ModelService {
    void getAllModels();
    void addNewModel(HttpServletRequest request, HttpServletResponse response);
    void updateModel(HttpServletRequest request, HttpServletResponse response);
    void deleteModelById(Integer id);
}
