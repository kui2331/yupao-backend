package com.yupi.yupao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupao.model.domain.Team;
import com.yupi.yupao.model.domain.User;
import com.yupi.yupao.model.dto.TeamQuery;
import com.yupi.yupao.model.request.TeamJoinRequest;
import com.yupi.yupao.model.request.TeamQuitRequest;
import com.yupi.yupao.model.request.TeamUpdateRequest;
import com.yupi.yupao.model.vo.TeamUserVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    /**
     *  查询队伍列表
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     *  修改队伍
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除队伍
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
