package cn.wg.ssm.mapper;

import cn.wg.ssm.po.Items;
import cn.wg.ssm.po.ItemsCustom;
import cn.wg.ssm.po.ItemsExample;
import cn.wg.ssm.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}