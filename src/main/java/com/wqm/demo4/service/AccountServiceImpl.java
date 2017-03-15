package com.wqm.demo4.service;

import com.wqm.demo4.dao.AccountDAO;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * <p>文件名称：AccountServiceImpl </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：转账操作的服务层的具体实现</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/3/14 </p>
 *
 * @author wangqiming
 */
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void transfer(String out, String in, double amount) {
        // 转出操作
        accountDAO.transferOut(out, amount);
//        int num = 10 / 0;
        // 转入操作
        accountDAO.transferIn(in, amount);
    }
}
