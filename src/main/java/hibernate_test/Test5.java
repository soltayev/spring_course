package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 2);
//            session.delete(emp);

            session.createQuery("delete Employee where department = 'HR'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("done");
        }
        finally {
            factory.close();
        }
    }
}
