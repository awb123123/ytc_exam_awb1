package com.ytc.mapper;

import com.ytc.model.Problem1;

import java.util.List;

public interface Problem1Mapper {
    int deleteByPrimaryKey(Integer problemid1);

    int insert(Problem1 record);

    int insertSelective(Problem1 record);

    Problem1 selectByPrimaryKey(Integer problemid1);

    int updateByPrimaryKeySelective(Problem1 record);

    int updateByPrimaryKey(Problem1 record);

    List<Problem1> queryProblem1();
}