package a.b.c;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

        Student so1=new Student();
        so1.setS_id(2);
        so1.setS_name("Ishita");
        so1.setCity("Muzaffarpur");
        Configuration cfg= new Configuration();
        cfg.configure();

        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=s.beginTransaction();

        try{
            s.save(so1);
            tr.commit();
        } catch(Exception e){
            tr.rollback();
            e.printStackTrace();
        }

    

    }
}
