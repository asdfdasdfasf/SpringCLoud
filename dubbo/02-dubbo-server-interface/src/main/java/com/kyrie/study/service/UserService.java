package com.kyrie.study.service;

import com.kyrie.study.domain.User;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/10 16:08
 */
public interface UserService {
    public List<User> queryAllUsers();
}
