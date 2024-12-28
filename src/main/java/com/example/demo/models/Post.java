package com.example.demo.models;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Table(name = "blog_t")
@Entity
@AllArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title", length=1000)
    private String title;
    @Column(name = "anons", length = 1000)
    private String anons;
    @Column(name = "full_text", length = 100000)
    private String full_text;
    @Column(name = "views")
    private int views;
    public Post() {

    }

    public Post(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }
}
