package com.my.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.pojo.Article;

@Mapper
public interface ArticleMapper extends BaseMapper<Article>{

	void addComment(Long articleId);


}
