package com.company.secondmodulehomework.postcoreapi;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/post")
public class PostController {
    private final HashMap<Long, Post> repository = new HashMap<>();
    private final Long id = 0L;


    @PostMapping()
    public void createPost(@RequestParam(value = "id") Long id, @RequestParam(value = "content") String content){
        try {
            repository.put(id, new Post(id, content));
            System.out.println("Successfully created");
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }

    @PutMapping("/{postId}")
    public void updatePost(@RequestParam(value = "content") String content, @PathVariable Long postId){
        try {
            Post post = repository.get(postId);
            post.setContent(content);
            System.out.println("Successfully changed");
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }


    @GetMapping("/all")
    public HashMap<Long, Post> getAllPosts(){
        return repository;
    }

    @GetMapping("/{postId}")
    public Post getPost(@PathVariable Long postId){
        return repository.get(postId);
    }

    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable Long postId){
        try {
            repository.remove(postId);
            System.out.println("Successfully changed");
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }


}
