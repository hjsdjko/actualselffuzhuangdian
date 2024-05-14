package com.entity.view;

import com.entity.CartEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购物车
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cart")
public class CartView extends CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 fuzhaung
			/**
			* 服装编号
			*/
			private String fuzhaungUuidNumber;
			/**
			* 服装名称
			*/
			private String fuzhaungName;
			/**
			* 服装照片
			*/
			private String fuzhaungPhoto;
			/**
			* 服装类型
			*/
			private Integer fuzhaungTypes;
				/**
				* 服装类型的值
				*/
				private String fuzhaungValue;
			/**
			* 服装库存
			*/
			private Integer fuzhaungKucunNumber;
			/**
			* 购买获得积分
			*/
			private Integer fuzhaungPrice;
			/**
			* 服装原价
			*/
			private Double fuzhaungOldMoney;
			/**
			* 现价/积分
			*/
			private Double fuzhaungNewMoney;
			/**
			* 点击次数
			*/
			private Integer fuzhaungClicknum;
			/**
			* 服装介绍
			*/
			private String fuzhaungContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer fuzhaungDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 总积分
			*/
			private Double yonghuSumJifen;
			/**
			* 现积分
			*/
			private Double yonghuNewJifen;
			/**
			* 会员等级
			*/
			private Integer huiyuandengjiTypes;
				/**
				* 会员等级的值
				*/
				private String huiyuandengjiValue;

	public CartView() {

	}

	public CartView(CartEntity cartEntity) {
		try {
			BeanUtils.copyProperties(this, cartEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




















				//级联表的get和set fuzhaung

					/**
					* 获取： 服装编号
					*/
					public String getFuzhaungUuidNumber() {
						return fuzhaungUuidNumber;
					}
					/**
					* 设置： 服装编号
					*/
					public void setFuzhaungUuidNumber(String fuzhaungUuidNumber) {
						this.fuzhaungUuidNumber = fuzhaungUuidNumber;
					}

					/**
					* 获取： 服装名称
					*/
					public String getFuzhaungName() {
						return fuzhaungName;
					}
					/**
					* 设置： 服装名称
					*/
					public void setFuzhaungName(String fuzhaungName) {
						this.fuzhaungName = fuzhaungName;
					}

					/**
					* 获取： 服装照片
					*/
					public String getFuzhaungPhoto() {
						return fuzhaungPhoto;
					}
					/**
					* 设置： 服装照片
					*/
					public void setFuzhaungPhoto(String fuzhaungPhoto) {
						this.fuzhaungPhoto = fuzhaungPhoto;
					}

					/**
					* 获取： 服装类型
					*/
					public Integer getFuzhaungTypes() {
						return fuzhaungTypes;
					}
					/**
					* 设置： 服装类型
					*/
					public void setFuzhaungTypes(Integer fuzhaungTypes) {
						this.fuzhaungTypes = fuzhaungTypes;
					}


						/**
						* 获取： 服装类型的值
						*/
						public String getFuzhaungValue() {
							return fuzhaungValue;
						}
						/**
						* 设置： 服装类型的值
						*/
						public void setFuzhaungValue(String fuzhaungValue) {
							this.fuzhaungValue = fuzhaungValue;
						}

					/**
					* 获取： 服装库存
					*/
					public Integer getFuzhaungKucunNumber() {
						return fuzhaungKucunNumber;
					}
					/**
					* 设置： 服装库存
					*/
					public void setFuzhaungKucunNumber(Integer fuzhaungKucunNumber) {
						this.fuzhaungKucunNumber = fuzhaungKucunNumber;
					}

					/**
					* 获取： 购买获得积分
					*/
					public Integer getFuzhaungPrice() {
						return fuzhaungPrice;
					}
					/**
					* 设置： 购买获得积分
					*/
					public void setFuzhaungPrice(Integer fuzhaungPrice) {
						this.fuzhaungPrice = fuzhaungPrice;
					}

					/**
					* 获取： 服装原价
					*/
					public Double getFuzhaungOldMoney() {
						return fuzhaungOldMoney;
					}
					/**
					* 设置： 服装原价
					*/
					public void setFuzhaungOldMoney(Double fuzhaungOldMoney) {
						this.fuzhaungOldMoney = fuzhaungOldMoney;
					}

					/**
					* 获取： 现价/积分
					*/
					public Double getFuzhaungNewMoney() {
						return fuzhaungNewMoney;
					}
					/**
					* 设置： 现价/积分
					*/
					public void setFuzhaungNewMoney(Double fuzhaungNewMoney) {
						this.fuzhaungNewMoney = fuzhaungNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getFuzhaungClicknum() {
						return fuzhaungClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setFuzhaungClicknum(Integer fuzhaungClicknum) {
						this.fuzhaungClicknum = fuzhaungClicknum;
					}

					/**
					* 获取： 服装介绍
					*/
					public String getFuzhaungContent() {
						return fuzhaungContent;
					}
					/**
					* 设置： 服装介绍
					*/
					public void setFuzhaungContent(String fuzhaungContent) {
						this.fuzhaungContent = fuzhaungContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getFuzhaungDelete() {
						return fuzhaungDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setFuzhaungDelete(Integer fuzhaungDelete) {
						this.fuzhaungDelete = fuzhaungDelete;
					}











				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 总积分
					*/
					public Double getYonghuSumJifen() {
						return yonghuSumJifen;
					}
					/**
					* 设置： 总积分
					*/
					public void setYonghuSumJifen(Double yonghuSumJifen) {
						this.yonghuSumJifen = yonghuSumJifen;
					}

					/**
					* 获取： 现积分
					*/
					public Double getYonghuNewJifen() {
						return yonghuNewJifen;
					}
					/**
					* 设置： 现积分
					*/
					public void setYonghuNewJifen(Double yonghuNewJifen) {
						this.yonghuNewJifen = yonghuNewJifen;
					}

					/**
					* 获取： 会员等级
					*/
					public Integer getHuiyuandengjiTypes() {
						return huiyuandengjiTypes;
					}
					/**
					* 设置： 会员等级
					*/
					public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
						this.huiyuandengjiTypes = huiyuandengjiTypes;
					}


						/**
						* 获取： 会员等级的值
						*/
						public String getHuiyuandengjiValue() {
							return huiyuandengjiValue;
						}
						/**
						* 设置： 会员等级的值
						*/
						public void setHuiyuandengjiValue(String huiyuandengjiValue) {
							this.huiyuandengjiValue = huiyuandengjiValue;
						}




}
