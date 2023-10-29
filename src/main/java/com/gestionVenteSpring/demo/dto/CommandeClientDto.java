package com.gestionVenteSpring.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestionVenteSpring.demo.model.Client;
import com.gestionVenteSpring.demo.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private String dateCommande;

    private ClientDto client;

    @JsonIgnore
    private List<LigneCommandeClientDto> ligneCommandeClients;

    public static CommandeClientDto fromEntity(CommandeClient commandeClient){
        if (commandeClient == null){
            // todo throw an exception
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .build();
    }

    public static CommandeClient toEntity(CommandeClientDto commandeClientDto){
        CommandeClient commandeClient=new CommandeClient();
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));
        return commandeClient;

    }
}
