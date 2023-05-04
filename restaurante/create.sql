-- Active: 1683212371823@@127.0.0.1@3306@restaurante
 create table Camarero (
       id bigint not null auto_increment,
        
   
        cliente_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table Cliente (
       id bigint not null auto_increment,
        apellidos varchar(255),
        consentimiento bit,
        dni varchar(255),
        email varchar(255),
        estatura double precision,
        fecha_consentimiento date,
        fecha_nacimiento date,
        nombre varchar(255),
        peso double precision,
        sexo varchar(255),
        telefono integer,
        primary key (id)
    ) engine=InnoDB;

    create table Plato (
       id binary(255) not null,
        date date,
        hour time,
        location_url varchar(255),
        name varchar(255),
        registry_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
        primary key (id)
    ) engine=InnoDB;

    create table Mesa (
       id bigint not null auto_increment,
        costo double precision,
        descripcion varchar(255),
        fecha_entrada datetime(6),
        fecha_salida datetime(6),
      
   
        primary key (id)
    ) engine=InnoDB;

    /*create table users (
       id bigint not null auto_increment,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        surname varchar(255),
        weigth double precision,
        uuid binary(255) not null,
        primary key (id)
    ) engine=InnoDB;*/

    alter table camarero 
       add constraint FKig7lpdrp6yce85efvnsao01uy 
       foreign key (cliente_id) 
       references clientes (id);

    alter table mesa
       add constraint FK4uipgut59t90x5d556e7qi0ua 
       foreign key (camarero_id) 
       references camareo (id);

    alter table mesa 
       add constraint FKnyilo37p7kr8119gbuqi9h3ij 
       foreign key (cliente_id) 
       references clientes (id);

    create table camarero (
       id bigint not null auto_increment,
       
        cliente_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table cliente (
       id bigint not null auto_increment,
        apellidos varchar(255),
        consentimiento bit,
        dni varchar(255),
        email varchar(255),
        estatura double precision,
        fecha_consentimiento date,
        fecha_nacimiento date,
        nombre varchar(255),
        peso double precision,
        sexo varchar(255),
        telefono integer,
        primary key (id)
    ) engine=InnoDB;

    create table plato (
       id binary(255) not null,
        date date,
        hour time,
        location_url varchar(255),
        name varchar(255),
        registry_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
        primary key (id)
    ) engine=InnoDB;

    create table mesa (
       id bigint not null auto_increment,
        costo double precision,
        descripcion varchar(255),
        fecha_entrada datetime(6),
        fecha_salida datetime(6),
        
        cliente_id bigint,
        primary key (id)
    ) engine=InnoDB;

    

    alter table camarero 
       add constraint FKig7lpdrp6yce85efvnsao01uy 
       foreign key (cliente_id) 
       references clientes (id);

    alter table mesa 
       add constraint FK4uipgut59t90x5d556e7qi0ua 
       foreign key (plato_id) 
       references plato (id);

    alter table camarero
       add constraint FKnyilo37p7kr8119gbuqi9h3ij 
       foreign key (cliente_id) 
       references clientes (id);
