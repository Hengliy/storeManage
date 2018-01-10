package hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static{
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void shutdown(){
        getSessionFactory().close();
    }
}
