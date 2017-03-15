package com.wqm.demo1.service;

import com.wqm.demo1.dao.AccountDAO;
import org.springframework.transaction.TransactionStatus;
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
public class AccountServiceImpl implements AccountService {

    private TransactionTemplate transactionTemplate;

    private AccountDAO accountDAO;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void transfer(final String out, final String in, final double amount) {

        transactionTemplate.execute(new TransactionCallback<Object>() {

            @Override
            public Object doInTransaction(TransactionStatus status) {
                // 转出操作
                accountDAO.transferOut(out, amount);
//                int num = 10 / 0;
                // 转入操作
                accountDAO.transferIn(in, amount);
                System.out.println("status: " + status.isCompleted());
                return null;
            }
        });
    }
}
