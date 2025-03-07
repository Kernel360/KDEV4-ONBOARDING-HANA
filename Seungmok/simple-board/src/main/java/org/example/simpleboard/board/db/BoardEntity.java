package org.example.simpleboard.board.db;

import jakarta.persistence.*;
import lombok.*;
import org.example.simpleboard.post.db.PostEntity;
import org.hibernate.annotations.Where;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;

    private String status;

    @OneToMany(
            mappedBy = "board"
    )
    @Where(clause = "status = 'REGISTERED'")
    private List<PostEntity> postList = new ArrayList<>();

}
