package com.volodymyr.pletniov.completed_spring_boot_for_interview.repository;

import com.volodymyr.pletniov.completed_spring_boot_for_interview.model.PostBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostBean, String> {
}
