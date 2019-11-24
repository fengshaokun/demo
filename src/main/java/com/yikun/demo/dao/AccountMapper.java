package com.yikun.demo.dao;


import com.yikun.demo.po.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
public interface AccountMapper {

   int update(@Param("money") double money, @Param("id") int id);

   List<Account> selectAll ();
}
