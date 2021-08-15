package com.volodymyr.pletniov.completed_spring_boot_for_interview.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;

@Table
@EqualsAndHashCode
@ToString
@Getter
@Setter
public final class PostBean {

    @NotBlank
    @Size(max = 255)
    private String title;
    @NotBlank
    @Size(max = 510)
    private String content;
    private Integer code;

    @ManyToOne
    private Set<CommentBean> commentBeans;
}
