package com.example.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Comment {
    @EmbeddedId
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String content;
}
