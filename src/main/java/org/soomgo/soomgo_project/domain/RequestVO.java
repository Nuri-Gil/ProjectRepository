package org.soomgo.soomgo_project.domain;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class RequestVO {
    private int id;
    private String writer;
    private LocalDateTime regDate;
    private String ref;
}