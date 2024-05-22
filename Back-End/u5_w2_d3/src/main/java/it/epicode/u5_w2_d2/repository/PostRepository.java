package it.epicode.u5_w2_d2.repository;

import it.epicode.u5_w2_d2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post,Integer> {
}
