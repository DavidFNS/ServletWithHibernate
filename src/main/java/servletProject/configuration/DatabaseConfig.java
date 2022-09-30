package servletProject.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.IOException;
import java.util.Properties;

public class DatabaseConfig {
    private static Session session;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if (sessionFactory != null){
            return sessionFactory;
        }

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate/hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();

        sessionFactory = metadata.buildSessionFactory();
        return sessionFactory;
    }

    public static Session getSession(){
        if (session != null){
            return session;
        }

        session = getSessionFactory().openSession();
        return session;
    }

}
