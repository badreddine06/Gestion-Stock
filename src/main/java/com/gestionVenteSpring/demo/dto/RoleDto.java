package com.gestionVenteSpring.demo.dto;

import com.gestionVenteSpring.demo.model.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;


    public static RoleDto fromEntity(Role role){
        if (role==null){
            return null;
        }
        return RoleDto.builder()
                .id(role.getId())
                .roleName(role.getRoleName())
                .utilisateur(UtilisateurDto.fromEntity(role.getUtilisateur()))
                .build();
    }

    public static Role toEntity(RoleDto roleDto){
        if (roleDto==null){
            return null;
        }
        Role role=new Role();
        role.setId(roleDto.getId());
        role.setRoleName(role.getRoleName());
        role.setUtilisateur(UtilisateurDto.toEntity(roleDto.getUtilisateur()));

        return role;
    }
}
