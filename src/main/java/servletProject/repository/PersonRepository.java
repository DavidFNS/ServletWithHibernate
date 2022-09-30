package servletProject.repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import servletProject.configuration.DatabaseConfig;
import servletProject.entity.Person;
import java.util.List;
import java.util.Map;

public class PersonRepository {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public PersonRepository() {
        sessionFactory = DatabaseConfig.getSessionFactory();
        session = DatabaseConfig.getSession();
        transaction = session.getTransaction();
    }

    public List<Person> getAllPersonByParams(Map<String, String> map){
        StringBuilder builder = new StringBuilder();
        queryBuilder(map, builder);

        String sql = "select * from person where 1=1" + builder;

        Query<Person> query = session.createNativeQuery(sql, Person.class);
        setParameter(map, query);

        List<Person> personList = query.getResultList();
        return personList;
    }

    public void queryBuilder(Map<String, String> map, StringBuilder builder){
        if (map.containsKey("id")){
            builder.append(" and id = :id_person");
        }
        if (map.containsKey("firstname")){
            builder.append(" and firstname = :name");
        }
        if (map.containsKey("email")){
            builder.append(" and email = :email");
        }
        if (map.containsKey("account")){
            builder.append(" and account = :balance");
        }
    }

    public void setParameter(Map<String, String> map, Query query){
        if (map.containsKey("id")){
            query.setParameter("id_person", Integer.parseInt(map.get("id")));
        }
        if (map.containsKey("name")){
            query.setParameter("name", map.get("name"));
        }
        if (map.containsKey("email")){
            query.setParameter("email", map.get("email"));
        }
        if (map.containsKey("account")){
            query.setParameter("balance", Double.parseDouble(map.get("account")));
        }
    }

    public void addPerson(Person person){
        transaction = session.beginTransaction();
        session.persist(person);
        transaction.commit();
    }

    public void updatePerson(Person person){
        transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();
    }

    public void deletePersonById(Integer id){
        transaction = session.beginTransaction();
        String sql = "delete from person where id = " + id ;
        Query query = session.createNativeQuery(sql, Person.class);
        query.executeUpdate();
    }
}
