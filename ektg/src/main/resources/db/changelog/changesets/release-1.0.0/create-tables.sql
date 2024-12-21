create table profile
(
    id                   bigint not null primary key,
    tg_id                bigint not null,
    profile_status       smallint,  
    create_date          date,
    create_ip_address    varchar(255)
);

create index profile_tg_index
    on profile (tg_id);


create table offer
(
    id                   bigint not null primary key,
    profile_id           bigint not null,
    offer_code           varchar(255),
    offer_status         smallint,
    offer_price          numeric(18, 10),
    offer_description    text,
    create_date          date,
    create_ip_address    varchar(255)
);


create index offer_profile_index
    on offer (profile_id);

create index offer_code_index
    on offer (offer_code);

