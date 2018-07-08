package com.eshare.markdown.repository;

import com.eshare.markdown.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by liangyh on 2018/7/8.
 * Email:10856214@163.com
 */
public interface BlogRepository extends JpaRepository<Blog,Long>{

    @Transactional(Transactional.TxType.NEVER)
    @Query("select b from Blog b where b.title = ?1")
    List<Blog> findByTitle(String title);
}
