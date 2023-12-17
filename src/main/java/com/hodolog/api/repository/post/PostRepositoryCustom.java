package com.hodolog.api.repository.post;

import com.hodolog.api.domain.Post;
import com.hodolog.api.request.post.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(PostSearch postSearch);
}
