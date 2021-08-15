package com.volodymyr.pletniov.completed_spring_boot_for_interview.controller;

import com.volodymyr.pletniov.completed_spring_boot_for_interview.model.PostBean;
import com.volodymyr.pletniov.completed_spring_boot_for_interview.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@ResponseBody
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public Iterable<PostBean> getAll() {
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public PostBean get(@PathVariable("id") String id) {
        return postService.get(id);
    }

    @PostMapping
    public PostBean create(@Valid @RequestBody PostBean postBean) {
        return postService.create(postBean);
    }

    @PatchMapping("/{id}")
    public PostBean update(@PathVariable("id") String id, @Valid @RequestBody PostBean postBean) {
        return postService.update(id, postBean);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        postService.delete(id);
    }
}
