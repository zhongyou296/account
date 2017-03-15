package com.wqm.demo4.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * <p>文件名称：AccountDAOImpl </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/3/14 </p>
 *
 * @author wangqiming
 */
public class AccountDAOImpl implements AccountDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void transferOut(String out, double amount) {
        String preparedStatement = "update account set money = money - ? where name = ?";
        jdbcTemplate.update(preparedStatement, amount, out);
    }

    @Override
    public void transferIn(String in, double amount) {
        String preparedStatement = "update account set money = money + ? where name = ?";
        jdbcTemplate.update(preparedStatement, amount, in);
    }
}
