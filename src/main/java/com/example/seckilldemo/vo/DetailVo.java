package com.example.seckilldemo.vo;

import com.example.seckilldemo.entity.TUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 详情返回对象
 * <p>
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 *
 * @author zhoubin
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailVo {

	private TUser user;

	private GoodsVo goodsVo;

	private int secKillStatus;

	private int remainSeconds;
}
