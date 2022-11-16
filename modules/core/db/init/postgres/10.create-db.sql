-- begin SERVICE_FOR_VEHICLES
create table SERVICE_FOR_VEHICLES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CITY_NAME varchar(255),
    STREET_NAME varchar(255),
    HOUSE_NUMBER varchar(255),
    --
    primary key (ID)
)^
-- end SERVICE_FOR_VEHICLES
-- begin SERVICE4VEHICLES_SERVICE
create table SERVICE4VEHICLES_SERVICE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PRICE bigint,
    SERVICE_TYPE varchar(50),
    --
    primary key (ID)
)^
-- end SERVICE4VEHICLES_SERVICE
-- begin SERVICE4VEHICLES_CLIENT
create table SERVICE4VEHICLES_CLIENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    SURNAME varchar(255),
    PHONE_NUMBER varchar(255),
    VEHICLE varchar(255),
    --
    primary key (ID)
)^
-- end SERVICE4VEHICLES_CLIENT
-- begin SERVICE4VEHICLES_ORDER
create table SERVICE4VEHICLES_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    START_TIME timestamp,
    DONE boolean not null,
    ADDRESS_ID uuid,
    CLIENT_ID uuid,
    SERVICE_ID uuid not null,
    END_TIME timestamp,
    --
    primary key (ID)
)^
-- end SERVICE4VEHICLES_ORDER
