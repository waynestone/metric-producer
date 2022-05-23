package com.wayne.metric.producer;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Auther: Wayne
 * @Date: 2022/5/11 17:09
 * @Description:
 */
public class ServiceTagVO {

    private Long id;

    private String name;

//    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8",shape =JsonFormat.Shape.STRING)
    private Date createAt;
    private String createBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
