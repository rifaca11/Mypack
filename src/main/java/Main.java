import config.Config;
import entities.Admin;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");

        try {
            System.out.println("try");
            EntityManager entityManager = Config.getConfig().getEntityManager();
            entityManager.getTransaction().begin();
            Admin admin = new Admin();
            admin.setUsername("admin2");
            admin.setEmail("a@a2");
            admin.setPassword("123");
            entityManager.persist(admin);
            entityManager.getTransaction().commit();
        }catch(Exception e)
        {
            System.out.println("catch");
            System.out.println(e.getMessage());
        }
    }
}
