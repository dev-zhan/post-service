package kz.zhan.service;

import kz.zhan.model.PostModel;

import java.util.List;

public interface PostService {
    void checkPost();
    void sendPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePost(String postId, PostModel postModel);
    void deletePostById(String postId);
}
