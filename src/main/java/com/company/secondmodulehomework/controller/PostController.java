package com.company.secondmodulehomework.controller;

import com.company.secondmodulehomework.model.PostModel;
import com.company.secondmodulehomework.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<String> createPost(@Valid @RequestBody PostModel postModel){
        postService.createPost(postModel);
        return new ResponseEntity<String>("Successfully created.", HttpStatus.OK);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePost(@PathVariable String postId, @Valid @RequestBody PostModel postModel){
        postService.updatePost(postId, postModel);
        return new ResponseEntity<String>("Successfully updated.", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostModel getPost(@PathVariable String postId){
        return postService.getPost(postId);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePost(@PathVariable String postId){
        postService.deletePost(postId);
        return new ResponseEntity<String>("Successfully deleted.", HttpStatus.OK);
    }


}
