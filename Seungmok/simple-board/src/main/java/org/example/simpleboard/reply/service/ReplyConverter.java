package org.example.simpleboard.reply.service;

import lombok.RequiredArgsConstructor;
import org.example.simpleboard.crud.Converter;
import org.example.simpleboard.post.db.PostRepository;
import org.example.simpleboard.reply.db.ReplyEntity;
import org.example.simpleboard.reply.model.ReplyDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReplyConverter implements Converter<ReplyDto, ReplyEntity> {

    private final PostRepository postRepository;

    @Override
    public ReplyDto toDto(ReplyEntity replyEntity) {

        ReplyDto replyDto = ReplyDto.builder()
                .id(replyEntity.getId())
                .postId(replyEntity.getPost().getId())
                .status(replyEntity.getStatus())
                .title(replyEntity.getTitle())
                .content(replyEntity.getContent())
                .userName(replyEntity.getUserName())
                .password(replyEntity.getPassword())
                .repliedAt(replyEntity.getRepliedAt())
                .build();

        return replyDto;
    }

    @Override
    public ReplyEntity toEntity(ReplyDto replyDto) {

        var postEntity = postRepository.findById(replyDto.getPostId());

        ReplyEntity replyEntity = ReplyEntity.builder()
                .id(replyDto.getId())
                .post(postEntity.get())
                .status(replyDto.getStatus())
                .title(replyDto.getTitle())
                .content(replyDto.getContent())
                .userName(replyDto.getUserName())
                .password(replyDto.getPassword())
                .repliedAt(replyDto.getRepliedAt())
                .build();

        return replyEntity;
    }
}
