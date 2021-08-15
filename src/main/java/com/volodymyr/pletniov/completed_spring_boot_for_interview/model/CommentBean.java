package com.volodymyr.pletniov.completed_spring_boot_for_interview.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentBean {
    @Id
    private String id = UUID.randomUUID().toString();
    @NotBlank
    private String content;
    @NotBlank
    private String authorId;

    @ManyToOne
    private PostBean postBean;

}
