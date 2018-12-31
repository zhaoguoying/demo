package com.example.demo.repository.mybaits;

/*
 * 作者：赵国应
 * 时间：2018-12-31 16:58
 * 描述：通过手机号查找用户
 */

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
/*
 * @Repository用于标注数据访问组件
 */

public interface UserRepository {
    /**
     *  通过手机号查找用户
     * @param phone 手机号
     * @return 用户
     */
    User findByPhone(String phone);
}
