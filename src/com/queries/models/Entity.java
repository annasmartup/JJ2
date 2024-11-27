package com.queries.models;

import com.queries.Column;

import java.util.UUID;

@com.queries.Entity
public class Entity {

    @Column(name= "id", primaryKey = true)
    private UUID id;

}
