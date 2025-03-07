package org.example.simpleboard.reply.service;

import lombok.RequiredArgsConstructor;
import org.example.simpleboard.crud.CRUDAbstractService;
import org.example.simpleboard.post.db.PostRepository;
import org.example.simpleboard.reply.db.ReplyEntity;
import org.example.simpleboard.reply.db.ReplyRepository;
import org.example.simpleboard.reply.model.ReplyDto;
import org.example.simpleboard.reply.model.ReplyRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService extends CRUDAbstractService<ReplyDto, ReplyEntity> {

    private final ReplyRepository replyRepository;
    private final PostRepository postRepository;

//    public ReplyEntity create(
//            ReplyRequest replyRequest
//    ) {
//        var postEntity = postRepository.findById(replyRequest.getPostId()).get();
//
//        ReplyEntity entity = ReplyEntity.builder()
//                .post(postEntity)
//                .userName(replyRequest.getUserName())
//                .password(replyRequest.getPassword())
//                .status("REGISTERED")
//                .title(replyRequest.getTitle())
//                .content(replyRequest.getContent())
//                .repliedAt(LocalDateTime.now())
//                .build();
//
//        return replyRepository.save(entity);
//    }
//
//    public List<ReplyEntity> findAllByPostId(Long postId) {
//
//        return replyRepository.findAllByPostIdAndStatusOrderByIdDesc(postId, "REGISTERED");
//    }
}
