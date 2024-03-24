package com.sample.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(Student.class);

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        Student s1 = new Student(2,"ram",80,"ram@gmail.com");
//        session.save(s1);

//        Student s1 = session.get(Student.class,1);
//        System.out.println(s1);

//        List<Student> students = session.createQuery("from Student",Student.class).getResultList();
//
//        for (Student student : students)
//            System.out.println(student);

//        Student s1 = session.get(Student.class,2);
//        s1.setMarks(30);
//
//        session.createQuery("update Student s set s.marks = 80 where s.name='ram'").executeUpdate();

//        Student s1 = session.get(Student.class,1);
//        session.delete(s1);

//        session.createQuery("delete  Student s where s.id=2").executeUpdate();

        transaction.commit();

    }
}
