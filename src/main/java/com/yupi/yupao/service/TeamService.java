package com.yupi.yupao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupao.model.domain.Team;
import com.yupi.yupao.model.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
* @author kui23
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2025-06-22 20:30:06
*/
public interface TeamService extends IService<Team> {

    /**
     *   添加队伍
     * @param team
     * @param loginUser
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    long addTeam(Team team, User loginUser);
}
