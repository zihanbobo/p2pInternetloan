package com.p2pInternetloan.assets.controller;

import com.p2pInternetloan.assets.entity.MoneyWithdraw;
import com.p2pInternetloan.assets.service.MoneyWithdrawService;
import com.p2pInternetloan.base.utils.R;
import org.springframework.web.bind.annotation.*;
import com.p2pInternetloan.base.utils.Query;
import com.p2pInternetloan.base.utils.PageUtils;
import java.util.Map;
import javax.annotation.Resource;
import java.util.List;

/**
 * (MoneyWithdraw)表控制层   提现记录
 *
 * @author cpc
 * @since 2019-10-24 17:02:01
 */
@RestController
@RequestMapping("moneyWithdraw")
public class MoneyWithdrawController {
    /**
     * 服务对象
     */
    @Resource
    private MoneyWithdrawService moneyWithdrawService;

    /**
     * 分页查询
     *
     * @param  params 请求参数集
     * @return 结果集封装对象 
     */
    @GetMapping("queryPager")
    public  PageUtils queryPager(@RequestParam Map<String, Object> params) {
         Query query = new Query(params);
         List<MoneyWithdraw> list = moneyWithdrawService.queryPager(query);
         return new PageUtils(list, query.getTotal());
    }


//    用户模块
    /**
     *  用户提现操作，状态改为待审核
     * @param state
     * @return
     */
    @PostMapping("updateState")
    public R updateState(MoneyWithdraw state){
        return R.update(this.moneyWithdrawService.update(state));
    }



//    管理员模块



}