package com.volodymyr.pletniov.completed_spring_boot_for_interview.service.impl;

import com.volodymyr.pletniov.completed_spring_boot_for_interview.model.PostBean;
import com.volodymyr.pletniov.completed_spring_boot_for_interview.repository.PostRepository;
import com.volodymyr.pletniov.completed_spring_boot_for_interview.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PostServiceImpl implements PostService {

    private static int counter = 2;
    private final VeryHardBusinessLogicService veryHardBusinessLogicService = new VeryHardBusinessLogicService();


    @Autowired
    private PostRepository postRepository;

    public Iterable<PostBean> getAll() {
        return postRepository.findAll();
    }

    public PostBean create(PostBean postRequest) {
        PostBean postBean = postRepository.save(postRequest);
        veryHardBusinessLogicService.makeSomeLogic();
        return postBean;
    }

    public PostBean get(String id) {
        return postRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public void delete(String id) {
        postRepository.deleteById(id);
    }

    public PostBean update(String id, PostBean postRequest) {
        get(id);
        postRequest.setId(id);
        PostBean postBean = postRepository.save(postRequest);
        int code = randomThrowException();
        if (code > 50)
            postBean.setCode(code);
        else
            postBean.setCode(-1);
        return postBean;
    }

    public void deleteAll(List<String> ids) {
    }

    // Actually not randomly
    private int randomThrowException() {
        System.out.printf("Increment value now is {%s}%n", counter++);
        if (counter % 2 == 0) {
            throw new RuntimeException();
        } else {
            // Like random value
            int code = new Random().nextInt(100);
            System.out.printf("The code is {%s}", code);
            return code;
        }
    }
}
