package com.wqm.demo2.dao;

/**
 * <p>文件名称：AccountDAO </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：转账操作的操作数据库的接口</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/3/14 </p>
 *
 * @author wangqiming
 */
public interface AccountDAO {

    /**
     * 转出操作
     *
     * @param out    转出账户
     * @param amount 转账金额
     */
    void transferOut(String out, double amount);

    /**
     * 转入操作
     *
     * @param in     转入账户
     * @param amount 转账金额
     */
    void transferIn(String in, double amount);
}
