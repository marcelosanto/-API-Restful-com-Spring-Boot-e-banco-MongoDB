package com.marcelosantos.springwebmongodb.repository;

import com.marcelosantos.springwebmongodb.domain.Post;
import com.marcelosantos.springwebmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
