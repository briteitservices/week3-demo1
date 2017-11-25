package com.briteitservices.week3.repository;

import com.briteitservices.week3.model.User;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;
import org.apache.deltaspike.data.api.SingleResultType;

import java.util.List;

@Repository
public interface UserRepository extends EntityRepository<User, Integer> {

    @Query("select u from User u where u.name=:name")
    List<User> findAll(@QueryParam("name") String name);

    @Query(value = "select u from User u where u.id=:id", singleResult = SingleResultType.OPTIONAL)
    User get(@QueryParam("id") int id);
}