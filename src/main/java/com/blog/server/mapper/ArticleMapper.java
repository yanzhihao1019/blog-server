package com.blog.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.server.entity.Article;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yanzhihao
 * @since 2022-07-06
 */
@Repository
public interface ArticleMapper extends BaseMapper<Article> {

}
