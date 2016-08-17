create database juego
go

create table Juegos_Tiempos(
conejoTiempo varchar(10)not null,
tortugaTiempo varchar(10)not null,
ZorroTiempo varchar(10)not null
)

create table Juegos_Ganadores(
conejoGano varchar(10)not null,
tortugaGano varchar(10)not null,
ZorroGano varchar(10)not null
)

create table Juegos_Partidas(
conejoPartidas varchar(10)not null,
tortugaPartidas varchar(10)not null,
ZorroPartidas varchar(10)not null
)
