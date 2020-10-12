package com.hy.demo.system.service.impl;

import com.hy.demo.system.domain.SysLogininfor;
import com.hy.demo.system.service.ISysLogininforService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统访问日志情况信息 服务层处理
 */
@Service
public class SysLogininfoServiceImpl implements ISysLogininforService
{
    @Override
    public void insertLogininfor(SysLogininfor logininfor) {

    }

    @Override
    public List<SysLogininfor> selectLogininforList(SysLogininfor logininfor) {
        return null;
    }

    @Override
    public int deleteLogininforByIds(Long[] infoIds) {
        return 0;
    }

    @Override
    public void cleanLogininfor() {

    }
}
