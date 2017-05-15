package cn.wg.ssm.po;

/**
 * 
 * <p>Title: ItemsCustom</p>
 * <p>Description: 商品信息的扩展类</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-13下午3:24:05
 * @version 1.0
 */
public class ItemsCustom extends Items {
	
	//添加商品信息的扩展属性

	@Override
	public String toString() {
		return "ItemsCustom [getId()=" + getId() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getPic()=" + getPic()
				+ ", getCreatetime()=" + getCreatetime() + ", getDetail()="
				+ getDetail() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
