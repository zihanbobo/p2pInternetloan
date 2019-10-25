package com.p2pInternetloan.assets.dao;

import com.p2pInternetloan.assets.entity.Members;
import org.apache.ibatis.annotations.Param;
import com.p2pInternetloan.base.utils.Query;
import java.util.List;

/**
 * (Members)表数据库访问层
 *
 * @author cpc
 * @since 2019-10-24 22:01:26
 */
public interface MembersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Members queryById(Integer id);

    /**
     * 通过query对象查询
     *
     * @param  query 分页查询对象 
     * @return 对象列表
     */
    List<Members> queryPager(Query query);

    /**
     * 新增数据
     *
     * @param members 实例对象
     * @return 影响行数
     */
    int insert(Members members);

    /**
     * 修改数据
     *
     * @param members 实例对象
     * @return 影响行数
     */
    int update(Members members);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}