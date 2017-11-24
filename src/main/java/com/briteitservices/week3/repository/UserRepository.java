package com.briteitservices.week3.repository;

import com.briteitservices.week3.model.User;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface UserRepository extends EntityRepository<User, Integer> {
}