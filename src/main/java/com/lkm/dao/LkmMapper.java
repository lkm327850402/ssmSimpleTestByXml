package com.lkm.dao;

import com.lkm.entity.Lkm;
import java.util.List;

public interface LkmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lkm record);

    Lkm selectByPrimaryKey(Integer id);

    List<Lkm> selectAll();

    int updateByPrimaryKey(Lkm record);
}