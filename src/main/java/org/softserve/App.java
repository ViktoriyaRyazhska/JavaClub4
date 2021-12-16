package org.softserve;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Session session = HibernateUtil.getSessionFactory().openSession();


    }
}
