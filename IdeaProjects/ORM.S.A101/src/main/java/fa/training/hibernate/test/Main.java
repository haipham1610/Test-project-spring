package fa.training.hibernate.test;

import fa.training.hibernate.common.HibernateConfig;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateConfig.getSessionFactory().openSession();
    }
}
