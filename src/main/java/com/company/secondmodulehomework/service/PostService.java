package com.company.secondmodulehomework.service;

import com.company.secondmodulehomework.model.PostModel;

import java.util.List;

public interface PostService {
    void createPost(PostModel postModel);
    void updatePost(String postId, PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPost(String postId);
    void deletePost(String postId);
}
