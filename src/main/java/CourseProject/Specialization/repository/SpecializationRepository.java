package CourseProject.Specialization.repository;


import CourseProject.Specialization.entity.Specialization;
import org.hibernate.Session;
import org.hibernate.Transaction;
import CourseProject.Specialization.service.SpecializationService;
import java.util.List;
public
class SpecializationRepository {
    /*
    public
    Specialization findByKeys(String specializationCode,String educationFormCode,String degreeCode ) {   ЭТО НЕРАБОЧИЙ КОД!!!!!!!!!!!!!!!!!!!!!
        return SpecializationService.getSessionFactory().openSession().get(Specialization.class,specializationCode );
    }*/

    public void save(Specialization specialization) {
        Session session = SpecializationService.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(specialization);
        tx1.commit();
        session.close();
    }

    public void update(Specialization specialization) {
        Session session = SpecializationService.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(specialization);
        tx1.commit();
        session.close();
    }

    public void delete(Specialization specialization) {
        Session session = SpecializationService.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(specialization);
        tx1.commit();
        session.close();
    }

    public List<Specialization> findAll() {
        List<Specialization> specializations = (List<Specialization>)  SpecializationService.getSessionFactory().openSession().createQuery("From Specialization").list();
        return specializations;
    }
}
