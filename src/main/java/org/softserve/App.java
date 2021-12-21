package org.softserve;

import org.hibernate.Session;
import org.softserve.repository.AuthorRepository;
import org.softserve.repository.impl.AuthorRepositoryImpl;


public class App 
{
    public static void main( String[] args )
    {

        Session session = HibernateUtil.getSessionFactory().openSession();


    }

    //AuthorRepository authorRepository = new AuthorRepositoryImpl();

}
