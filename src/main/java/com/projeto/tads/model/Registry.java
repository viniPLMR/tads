package com.projeto.tads.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Base64;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Registry {

    private Integer id;

    private String fantasyNameRegistry;

    private String cellphone;

    private String location;

    private Base64 logoRegistry;

}
