package com.qcby.entity;

public class Comprehensivelist {
    private Integer id;

    private String model;

    private String modelChil;

    private Integer postId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelChil() {
        return modelChil;
    }

    public void setModelChil(String modelChil) {
        this.modelChil = modelChil;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "Comprehensivelist{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", modelChil='" + modelChil + '\'' +
                ", postId=" + postId +
                '}';
    }
}