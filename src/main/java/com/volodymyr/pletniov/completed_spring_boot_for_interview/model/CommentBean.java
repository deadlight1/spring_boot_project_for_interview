package com.volodymyr.pletniov.completed_spring_boot_for_interview.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Table
@EqualsAndHashCode
@ToString
@Getter
@Setter
public final class CommentBean {

    @NotBlank
    private String content;
    @NotBlank
    private String authorId;

    @OneToMany
    private PostBean postBean;

}
