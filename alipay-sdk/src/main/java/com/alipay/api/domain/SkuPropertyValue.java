package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库存单元属性值详情
 *
 * @author auto create
 * @since 1.0, 2017-03-14 14:11:10
 */
public class SkuPropertyValue extends AlipayObject {

	private static final long serialVersionUID = 1596137277125753728L;

	/**
	 * 外部sku属性值ID,由外部商户定义
	 */
	@ApiField("out_pv_id")
	private String outPvId;

	/**
	 * 外部商户sku属性值
	 */
	@ApiField("value")
	private String value;

	public String getOutPvId() {
		return this.outPvId;
	}
	public void setOutPvId(String outPvId) {
		this.outPvId = outPvId;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}