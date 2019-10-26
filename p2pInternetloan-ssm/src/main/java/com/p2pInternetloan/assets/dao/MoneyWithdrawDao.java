package com.p2pInternetloan.assets.dao;

import com.p2pInternetloan.assets.entity.MoneyWithdraw;
import org.apache.ibatis.annotations.Param;
import com.p2pInternetloan.base.utils.Query;
import java.util.List;

/**
 * (MoneyWithdraw)表数据库访问层
 *
 * @author cpc
 * @since 2019-10-24 17:02:01
 */
public interface MoneyWithdrawDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MoneyWithdraw queryById(Integer id);

    /**
     * 通过query对象查询
     *
     * @param  query 分页查询对象 
     * @return 对象列表
     */
    List<MoneyWithdraw> queryPager(Query query);

    /**
     * 新增数据
     *
     * @param moneyWithdraw 实例对象
     * @return 影响行数
     */
    int insert(MoneyWithdraw moneyWithdraw);

    /**
     * 修改数据
     *
     * @param moneyWithdraw 实例对象
     * @return 影响行数
     */
    int update(MoneyWithdraw moneyWithdraw);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}