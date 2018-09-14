package com.cloudDemo.db.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Ad {
   private Integer id;
   private String name;
   private String link;
   private byte position;
   private String content;
   private LocalDateTime startTime;
   private LocalDateTime endTime;
}
