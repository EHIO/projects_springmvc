package cn.wg.ssm.mapper;

import cn.wg.ssm.po.ItemsCustom;
import cn.wg.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    //商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}