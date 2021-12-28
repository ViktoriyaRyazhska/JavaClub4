package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.entity.Author;
import com.team1.spring_hibernate.entity.Role;

import java.util.List;

public interface RoleService {

    public List<Role> getAllRole();

    public void saveRole(Role Role);

    public Role getRoleByID(int id);

    public void deleteRoleByID(int id);

}
