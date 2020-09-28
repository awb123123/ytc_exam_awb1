package com.ytc.mapper;

import com.ytc.model.Problem3;

import java.util.List;

public interface Problem3Mapper {
    int deleteByPrimaryKey(Integer problemid3);

    int insert(Problem3 record);

    int insertSelective(Problem3 record);

    Problem3 selectByPrimaryKey(Integer problemid3);

    int updateByPrimaryKeySelective(Problem3 record);

    int updateByPrimaryKey(Problem3 record);

    List<Problem3> queryProblem3();
}