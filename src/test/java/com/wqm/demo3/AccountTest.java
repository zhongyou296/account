package com.wqm.demo3;

import com.wqm.demo3.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * <p>文件名称：AccountTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：测试转账操作</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/3/15 </p>
 *
 * @author wangqiming
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean-all3.xml")
public class AccountTest {

    @Resource
    private AccountService accountService;

    @Test
    public void testTransfer() {
        String out = "zhangsan";
        String in = "lisi";
        accountService.transfer(out,in,500);
    }
}
