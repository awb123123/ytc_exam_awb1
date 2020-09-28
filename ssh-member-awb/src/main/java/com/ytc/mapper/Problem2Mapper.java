package com.ytc.mapper;

import com.ytc.model.Problem2;

import java.util.List;

public interface Problem2Mapper {
    int deleteByPrimaryKey(Integer problemid2);

    int insert(Problem2 record);

    int insertSelective(Problem2 record);

    Problem2 selectByPrimaryKey(Integer problemid2);

    int updateByPrimaryKeySelective(Problem2 record);

    int updateByPrimaryKey(Problem2 record);

    List<Problem2> queryProblem2();
}