package com.volodymyr.pletniov.completed_spring_boot_for_interview.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostBean {

    @Id
    private String id = UUID.randomUUID().toString();
    @NotBlank
    @Size(max = 255)
    private String title;
    @NotBlank
    @Size(max = 510)
    private String content;
    private Integer code;

    @OneToMany
    private Set<CommentBean> commentBeans;
}
