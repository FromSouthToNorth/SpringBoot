package com.hy.demo.system.service.impl;

import com.hy.demo.common.core.domain.entity.SysRole;
import com.hy.demo.system.mapper.SysRoleMapper;
import com.hy.demo.system.mapper.SysRoleMenuMapper;
import com.hy.demo.system.mapper.SysUserRoleMapper;
import com.hy.demo.system.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 角色 业务层处理
 */
@Service
public class SysRoleServiceImpl implements ISysRoleService
{
    @Autowired
    private SysRoleMapper roleMapper;

    @Autowired
    private SysRoleMenuMapper roleMenuMapper;

    @Autowired
    private SysUserRoleMapper userRoleMapper;

    @Override
    public List<SysRole> selectRoleList(SysRole role) {
        return null;
    }

    @Override
    public Set<String> selectRolePermissionByUserId(Long userId) {
        return null;
    }

    @Override
    public List<SysRole> selectRoleAll() {
        return null;
    }

    @Override
    public List<Integer> selectRoleListByUserId(Long userId) {
        return null;
    }

    @Override
    public SysRole selectRoleById(Long roleId) {
        return null;
    }

    @Override
    public String checkRoleNameUnique(SysRole role) {
        return null;
    }

    @Override
    public String checkRoleKeyUnique(SysRole role) {
        return null;
    }

    @Override
    public void checkRoleAllowed(SysRole role) {

    }

    @Override
    public int countUserRoleByRoleId(Long roleId) {
        return 0;
    }

    @Override
    public int insertRole(SysRole role) {
        return 0;
    }

    @Override
    public int updateRole(SysRole role) {
        return 0;
    }

    @Override
    public int updateRoleStatus(SysRole role) {
        return 0;
    }

    @Override
    public int authDataScope(SysRole role) {
        return 0;
    }

    @Override
    public int deleteRoleById(Long roleId) {
        return 0;
    }

    @Override
    public int deleteRoleByIds(Long[] roleIds) {
        return 0;
    }
}
