package CourseProject.Specialization.service;
import CourseProject.Specialization.entity.Specialization;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public
class SpecializationService {
    private static SessionFactory sessionFactory;

    public
    SpecializationService(){}
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            try{
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Specialization.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                System.out.println("Исключение " + e);

            }
        }
        return sessionFactory;
    }

}
