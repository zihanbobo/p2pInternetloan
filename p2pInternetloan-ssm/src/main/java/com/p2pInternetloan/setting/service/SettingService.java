package com.p2pInternetloan.setting.service;

import com.p2pInternetloan.setting.entity.Setting;
import java.util.List;
import com.p2pInternetloan.base.utils.Query;

/**
 * (Setting)表服务接口
 *
 * @author cpc
 * @since 2019-10-22 21:16:54
 */
public interface SettingService {

    /**
     * 通过ID查询单条数据
     *
     * @param key 主键
     * @return 实例对象
     */
    Setting queryById(String key);


    /**
     * 新增数据
     *
     * @param setting 实例对象
     * @return 添加行数
     */
     int insert(Setting setting);

    /**
     * 通过query对象查询
     *
     * @param  query 分页查询对象 
     * @return 对象列表
     */
    List<Setting> queryPager(Query query);


    /**
     * 修改数据
     *
     * @param setting 实例对象
     * @return 修改行数
     */
     int update(Setting setting);

    /**
     * 通过主键删除数据
     *
     * @param key 主键
     * @return 删除行数
     */
    int deleteById(String key);



}