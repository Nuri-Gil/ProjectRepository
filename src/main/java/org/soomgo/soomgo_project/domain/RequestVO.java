package org.soomgo.soomgo_project.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestVO {
    private String req_id;
    private String req_newbie;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime req_regDate;

    private String req_sort;
    private String req_type;
    private String req_sub;
    private String req_file1;
    private String req_file2;
    private String req_cr;
    private String req_amount;
    private String req_addService;
    private String req_result;
    private String req_day;
    private String req_time;
    private String req_age;
    private String req_sex;
    private String req_fav;
    private String req_place;
    private String req_date;
    private String req_region;
    private String req_ref;
}
