package com.scme.pojo;

import org.springframework.stereotype.Repository;

import java.util.Date;

public class bloginfo {
    private Integer id;

    @Override
    public String toString() {
        return "bloginfo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postdate=" + postdate +
                ", autherId=" + autherId +
                '}';
    }

    private String title;

    private String content;

    private Date postdate;

    private Integer autherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public Integer getAutherId() {
        return autherId;
    }

    public void setAutherId(Integer autherId) {
        this.autherId = autherId;
    }
}