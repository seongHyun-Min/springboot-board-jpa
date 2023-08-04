package com.example.board.dto.post;

import com.example.board.domain.entity.Comment;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostWithCommentResponseDto {
    private String title;

    private String content;

    private String name;

    private LocalDateTime createdAt;

    private List<Comment> comments;
}