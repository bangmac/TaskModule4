package com.bangmacblog.model;

import javax.persistence.*;

@Entity
@Table(name = "blogPage")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameBlogger;
    private String TitleBlog;
    private String Content;
    private String timePublish;

    public Blog(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBlogger() {
        return nameBlogger;
    }

    public void setNameBlogger(String nameBlogger) {
        this.nameBlogger = nameBlogger;
    }

    public String getTitleBlog() {
        return TitleBlog;
    }

    public void setTitleBlog(String titleBlog) {
        TitleBlog = titleBlog;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getTimePublish() {
        return timePublish;
    }

    public void setTimePublish(String timePublish) {
        this.timePublish = timePublish;
    }

}
