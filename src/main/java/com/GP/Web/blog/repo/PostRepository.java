package com.GP.Web.blog.repo;

import com.GP.Web.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
