package com.gestionVenteSpring.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestionVenteSpring.demo.model.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client){
        if (client == null){

            // todo throw an exception
            return null;
        }
        ClientDto clientDto = new ClientDto();
        BeanUtils.copyProperties(client, clientDto);
        clientDto.setAdresse(AdresseDto.fromEntity(client.getAdresse()));
        return clientDto;

//        return ClientDto.builder()
//                .id(client.getId())
//                .nom(client.getNom())
//                .prenom(client.getPrenom())
//                .adresse(AdresseDto.fromEntity(client.getAdresse()))
//                .photo(client.getPhoto())
//                .mail(client.getMail())
//                .numTel(client.getNumTel())
//                .build();
    }

    public static Client toEntity(ClientDto clientDto){
        if (clientDto == null){
            return null;
        }

        Client client = new Client();

        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(clientDto.getAdresse()));
        client.setPhoto(clientDto.getPhoto());
        client.setMail(clientDto.getMail());
        client.setNumTel(clientDto.getNumTel());

        return client;
    }
}