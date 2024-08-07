package org.soomgo.soomgo_project.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Data
public class RequestVO {
    /*
        private int id;
        private String writer;
        private LocalDateTime regDate;
        private String ref;
    */
    private int id;
    private String writer;
    private LocalDateTime regDate;
    private String sort;
    private String type;
    private String sub;
    private String file1;
    private String file2;
    private boolean cr;
    private String amount;
    private String addService;
    private String delService;
    private String result;
    private String day;
    private String time;
    private String age;
    private String sex;
    private String fav;
    private String place;
    private String date;
    private String region;
    private String ref;

    public RequestVO() {
        this.regDate = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
    }
}