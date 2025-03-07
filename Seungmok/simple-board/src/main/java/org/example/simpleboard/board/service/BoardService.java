package org.example.simpleboard.board.service;

import lombok.RequiredArgsConstructor;
import org.example.simpleboard.board.db.BoardEntity;
import org.example.simpleboard.board.db.BoardRepository;
import org.example.simpleboard.board.model.BoardDto;
import org.example.simpleboard.board.model.BoardRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final BoardConverter boardConverter;

    public BoardEntity create(
            BoardRequest boardRequest
    ) {
        BoardEntity entity = BoardEntity.builder()
                .boardName(boardRequest.getBoardName())
                .status("REGISTERED")
                .build();

        return boardRepository.save(entity);
    }

    public BoardDto view(Long id) {
        var entity = boardRepository.findById(id).get();

        var saveEntity = boardRepository.save(entity);

        return boardConverter.toDto(saveEntity);
    }
}
