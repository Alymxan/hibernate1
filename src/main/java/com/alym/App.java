package com.alym;

import com.alym.entity.Car;
import com.alym.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        SessionFactory sessionFactory = null;
        try {
            Configuration conn = new Configuration().addAnnotatedClass(Car.class);

            sessionFactory = conn.buildSessionFactory();

            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            // java code

            // select
//            Car car = session.get(Car.class, 1);
//            System.out.println(car);
            List<Car> cars = session.createQuery("from Car").getResultList();//HQL

            cars.forEach(System.out::println);

            // insert
//        Student s1 = new Student("Arman", 3.5);
//        Student s2 = new Student("Dosbol", 3.1);
//        Student s3 = new Student("Dulat", 3.2);
//
//        session.save(s1);
//        session.save(s2);
//        session.save(s3);

//        Car c1 = new Car("Kamaz", 100);
//        Car c2 = new Car("Porche", 280);
//        Car c3 = new Car("Honda", 210);
//
//        session.save(c1);
//        session.save(c2);
//        session.save(c3);

            // delete
//            Car car = session.get(Car.class, 1);
//            session.delete(car);

            // update
//            Car car = session.get(Car.class, 2);
//            car.setModel("Vesta");
//            session.save(car);
//            List<Car> carList = session.createQuery("from Car where speed > 220").getResultList();
//            carList.forEach(System.out::println);

            session.createQuery("update Car set speed = 180 where speed<220").executeUpdate();


            session.getTransaction().commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sessionFactory.close();
        }

    }
}
