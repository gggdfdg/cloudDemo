package com.cloudDemo.db.domain;

import lombok.Data;

@Data
public class Ad {
   private Integer id;
   private String name;
   private String link;
   private byte position;
   private String content;
}
