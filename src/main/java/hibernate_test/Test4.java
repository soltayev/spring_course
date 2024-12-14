package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 2);
//            emp.setName("Alexey");
//            emp.setSurname("Sidorov");
//            emp.setDepartment("Sales");

            session.createQuery("update Employee set salary = 700000 where salary = 500000").executeUpdate();
            session.getTransaction().commit();

            System.out.println("done");
        }
        finally {
            factory.close();
        }
    }
}
