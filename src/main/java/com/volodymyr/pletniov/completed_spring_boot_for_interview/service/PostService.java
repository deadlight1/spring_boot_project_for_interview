package com.volodymyr.pletniov.completed_spring_boot_for_interview.service;

import com.volodymyr.pletniov.completed_spring_boot_for_interview.model.PostBean;

import java.util.List;

public interface PostService {
    Iterable<PostBean> getAll();

    PostBean create(PostBean postRequest);

    PostBean get(String id);

    void delete(String id);

    PostBean update(String id, PostBean postRequest);

    void deleteAll(List<String> ids);
}
