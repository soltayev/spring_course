package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Adilzhan", "Soltayev", "IT", 7000);
//
//            Detail detail = new Detail("Almaty", "7003110898", "adilzhan.soltayev@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Madina", "Batyrova", "Analytics", 8000);
//
//            Detail detail = new Detail("Almaty", "7003190898", "madina.batyrova@gmail.com");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 10);
//
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();

            System.out.println("Done");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
