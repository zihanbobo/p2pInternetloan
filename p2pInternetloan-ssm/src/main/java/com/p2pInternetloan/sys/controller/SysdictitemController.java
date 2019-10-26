package com.p2pInternetloan.sys.controller;

import com.p2pInternetloan.base.utils.PageUtils;
import com.p2pInternetloan.base.utils.Query;
import com.p2pInternetloan.base.utils.R;
import com.p2pInternetloan.sys.entity.Sysdictitem;
import com.p2pInternetloan.sys.service.SysdictitemService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * (Sysdictitem)表控制层
 *
 * @author cpc
 * @since 2019-10-21 11:47:44
 */
@RestController
@RequestMapping("sys/dictitem")
public class SysdictitemController {
    /**
     * 服务对象
     */
    @Resource
    private SysdictitemService sysdictitemService;

    /**
     * 分页查询
     *
     * @param  params 请求参数集
     * @return 对象列表
     */
    @GetMapping("queryPager")
    public  PageUtils queryPager(@RequestParam Map<String, Object> params) {
         Query query = new Query(params);
         List<Sysdictitem> list = sysdictitemService.queryPager(query);
         return new PageUtils(list, query.getTotal());
    }


    /**
     * 添加字段项
     * @param sysdictitem
     * @return
     */
    @PostMapping("add")
    public R add(Sysdictitem sysdictitem){
        return R.update(this.sysdictitemService.insert(sysdictitem));

    }


    /**
     * 删除字典项
     * @param id
     * @return
     */
    @PostMapping("del/{id}")
    @RequiresPermissions(value = {"sys:user:view"})
    public R del(@PathVariable("id") Integer id){
        return R.update(this.sysdictitemService.deleteById(id));
    }


    /**
     * 修改字典项
     * @param sysdictitem
     * @return
     */
    @PostMapping("/update")
    public R update(Sysdictitem sysdictitem){
        return R.update(this.sysdictitemService.update(sysdictitem));
    }



    /**
     * 查询指定字典类被下的字典条目
     * @param sn 这是字典类被的英文编码
     * @return
     */
    @GetMapping("/getSelect")
    public List<Map> getSelect(String sn) {
        return this.sysdictitemService.getSelect(sn);
    }
}