package Dao;


import config.Config;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import entities.*;

public class AdminDao {
    private EntityManager entityManager = Config.getConfig().getEntityManager();

    public boolean login(String email, String password){
        try{
            TypedQuery<Admin> query = entityManager.createQuery("SELECT a FROM Admin  a WHERE a.email = :email AND a.password = :password", Admin.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            if (query.getSingleResult() != null){
                System.out.println("Successfully");
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
