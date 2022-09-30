package servletProject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.dialect.Database;
import servletProject.configuration.DatabaseConfig;
import servletProject.entity.Model;

import java.util.List;
import java.util.Map;

public class ModelRepository {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public ModelRepository() {
        sessionFactory = DatabaseConfig.getSessionFactory();
        session = DatabaseConfig.getSession();
        transaction = session.getTransaction();
    }

}













