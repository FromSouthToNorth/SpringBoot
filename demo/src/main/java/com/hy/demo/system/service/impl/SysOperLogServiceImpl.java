package com.hy.demo.system.service.impl;

import com.hy.demo.system.domain.SysOperLog;
import com.hy.demo.system.service.ISysOperLogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 操作日志 服务层处理
 */
@Service
public class SysOperLogServiceImpl implements ISysOperLogService
{
    @Override
    public void insertOperlog(SysOperLog operLog) {

    }

    @Override
    public List<SysOperLog> selectOperLogList(SysOperLog operLog) {
        return null;
    }

    @Override
    public int deleteOperLogByIds(Long[] operIds) {
        return 0;
    }

    @Override
    public SysOperLog selectOperLogById(Long operId) {
        return null;
    }

    @Override
    public void cleanOperLog() {

    }
}
