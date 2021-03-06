package com.p2pInternetloan.borrowing.service;

import com.p2pInternetloan.base.utils.Query;
import com.p2pInternetloan.borrowing.entity.BidRequest;
import com.p2pInternetloan.borrowing.entity.RefundDetail;

import java.util.List;

/**
 * (RefundDetail)表服务接口
 *
 * @author cpc
 * @since 2019-10-31 14:03:42
 */
public interface RefundDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RefundDetail queryById(Integer id);


    /**
     * 新增数据
     *
     * @param refundDetail 实例对象
     * @return 添加行数
     */
     int insert(RefundDetail refundDetail);

    /**
     * 通过query对象查询
     *
     * @param  query 分页查询对象 
     * @return 对象列表
     */
    List<RefundDetail> queryPager(Query query);




    /**
     * 修改数据
     *
     * @param refundDetail 实例对象
     * @return 修改行数
     */
     int update(RefundDetail refundDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 删除行数
     */
    int deleteById(Integer id);


    /**
     * 计算还款计划
     * @param bidRequest
     * @return
     */
    public List<RefundDetail> calculationRefundDetail(BidRequest bidRequest);

}