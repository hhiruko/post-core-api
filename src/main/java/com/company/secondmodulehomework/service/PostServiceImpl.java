package com.company.secondmodulehomework.service;

import com.company.secondmodulehomework.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    private static final HashMap<String, PostModel> postMap = new HashMap<>();

    @Override
    public void createPost(PostModel postModel) {
        postMap.put(postModel.getPostId(), postModel);
    }

    @Override
    public void updatePost(String postId, PostModel postModel) {
        postModel.setPostId(postId);
        postMap.put(postId, postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public PostModel getPost(String postId) {
        return postMap.get(postId);
    }

    @Override
    public void deletePost(String postId) {
        postMap.remove(postId);
    }
}
