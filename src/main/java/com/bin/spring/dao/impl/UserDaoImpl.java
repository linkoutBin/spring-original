package com.bin.spring.dao.impl;

import com.bin.spring.dao.UserDao;
import com.bin.spring.datasource.DataSource;
import com.bin.spring.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDaoImpl implements UserDao {
    private DataSource dataSource;
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myJPA");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public int save(User user) {
        String sql = "insert into t_user(name) value('" + user.getName() + "')";
        try (Connection connection = dataSource.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void saveByJpa(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    public void close(){
        entityManager.close();
        entityManagerFactory.close();
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
