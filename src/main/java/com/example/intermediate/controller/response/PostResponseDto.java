package com.example.intermediate.controller.response;

import java.time.LocalDateTime;
import java.util.List;

import com.example.intermediate.domain.Img;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {
  private Long id;
  private String title;
  private String content;
  private List<String> imgList;
  private int price;
  private Integer likes;
  private String nickname;
  private Integer view;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;
}
