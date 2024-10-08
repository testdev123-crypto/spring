package com.example.School.service;

import com.example.School.dto.RoleDTO;
import com.example.School.models.Role;
import com.example.School.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public void addRole(RoleDTO roleDTO) {
        try {
            System.out.println("ID:"+roleDTO.getId());
            roleRepository.addRole(roleDTO.getId(),roleDTO.getName());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addRole2(List<RoleDTO> roleDTOList){
        try {

            for (RoleDTO roleDTO : roleDTOList) {
                roleRepository.addRole(roleDTO.getId(),roleDTO.getName());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<RoleDTO> getAllUsers() {
        try {
            List<RoleDTO> response = roleRepository.getAllRole();
            return response;
        } catch (Exception ex) {
            System.out.println("Exception occured ||" + ex.getMessage());
        }
    return null;
    }

    public RoleDTO getRoleById(String id) {
        try {
            RoleDTO response = roleRepository.getRoleById(id);
//            Role response = roleRepository.getRoleById(String id);
            return response;
        } catch (Exception ex) {
            System.out.println("Exception occured ||" + ex.getMessage());
        }
        return null;
    }

    public void updateRole(String id, String name){
        try {
            roleRepository.updateRole(id, name);
        }catch (Exception ex){
            System.out.println("Exception occured ||" + ex.getMessage());
        }

    }

    public void deleteRole(String id){
        try {
            roleRepository.deleteRole(id);
        }catch (Exception ex){
            System.out.println("Exception occured ||" + ex.getMessage());
        }
    }

    public int add(int i, int i1) {
        return i+i1;
    }
}
