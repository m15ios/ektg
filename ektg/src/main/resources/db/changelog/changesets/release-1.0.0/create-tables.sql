--liquibase formatted sql
--changeset ektg:1

/*==============================================================*/
/* Table: profile                                               */
/*==============================================================*/

create table public.profile
(
    id                   bigint not null,
                         constraint pk_profile
                         primary key,
    tg_id                bigint not null,
    profile_status       smallint,  
    create_date          date,
    create_ip_address    varchar(255)
);

/* comment on table public.profile is 'Учетная запись пользователя';       */
/* comment on column public.profile.id is 'Порядковый номер пользователя'; */

/*==============================================================*/
/* Index: profile                                               */
/*==============================================================*/

create index profile_tg_index
    on profile (tg_id);


/*==============================================================*/
/* Table: offer                                                 */
/*==============================================================*/

create table public.offer
(
    id                   bigint not null,
                         constraint pk_offer
                         primary key,
    profile_id           bigint not null,
    offer_code           varchar(255),
    offer_status         smallint,
    offer_price          numeric(18, 10),
    offer_description    text
    create_date          date,
    create_ip_address    varchar(255)
);

/*==============================================================*/
/* Index: offer                                                 */
/*==============================================================*/

create index offer_profile_index
    on profile (profile_id);

create index offer_code_index
    on profile (offer_code);

