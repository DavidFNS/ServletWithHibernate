package servletProject.repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import servletProject.configuration.DatabaseConfig;
import servletProject.entity.Car;
import java.util.List;
public class CarRepository {
    private static CarRepository carRepository;
    private Session session;
    private SessionFactory sessionFactory;
    private Transaction transaction;

    private CarRepository(){
        sessionFactory = DatabaseConfig.getSessionFactory();
        session = DatabaseConfig.getSession();
        transaction = session.getTransaction();
    }

    public static CarRepository getInstance(){
        if (carRepository != null){
            return carRepository;
        }
        carRepository = new CarRepository();
        return carRepository;
    }

    public List<Car> getAllCars(){
        Query query = session.createNativeQuery("select * from cars", Car.class);
        List<Car> carList = query.getResultList();
        return carList;
    }

    public void addCar(Car car){
        transaction = session.beginTransaction();
        session.persist(car);
        transaction.commit();
    }

    public void deleteCar(Integer id) {
        transaction = session.beginTransaction();
        String sql = "delete from cars where id = " + id;

        Query query = session.createNativeQuery(sql, Car.class);
        query.executeUpdate();
        transaction.commit();
    }

    public void updateCar(Car car){
        transaction = session.beginTransaction();
        session.update(car);
        transaction.commit();
    }

    public List<Car> getAllCarsByColorAndYear(String color, Integer year) {
        transaction = session.beginTransaction();
        Query<Car> query = session.createNativeQuery(
                "select * from cars c where c.color = :rang and c.year > :yil", Car.class);
        query.setParameter("rang", color);
        query.setParameter("yil", year);

        return query.getResultList();
    }
}
