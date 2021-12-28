package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.Role;

import java.util.List;

public interface RoleDAO {

    public List<Role> getAllRole();

    public void saveRole(Role Role);

    public Role getRoleByID(int id);

    public void deleteRoleByID(int id);

}
