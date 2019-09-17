drop database if exists DBAgenda2018391;
create database DBAgenda2018391;
use DBAgenda2018391;

create table Categorias(
	codigoCategoria int not null auto_increment,
	nombre varchar(50) not null,
	estado boolean default true,
	primary key PK_CodigoCategoria(codigoCategoria)
 );

create table Personas(
	codigoPersona int not null auto_increment,
	nombres varchar(100) not null,
	apellidos varchar(100) not null,
	sexo enum ('M','F') not null,
	fechaNacimiento datetime not null,
	primary key PK_codigoPersona(codigoPersona)
);

create table Telefono(
	codigoTelefono int not null auto_increment,
	numero varchar(9) not null,
	codigoPersona int not null,
	primary key PK_codigoTelefono(codigoTelefono),
	constraint FK_Telefono_Personas foreign key (codigoPersona) references Personas(codigoPersona)
);

create table Usuarios(
	codigoUsuario int not null auto_increment,
	usuario varchar(20) not null,
	clave varchar(40) not null, 
	tipo enum ('A','N') not null,
	estado boolean default true not null,
	primary key PK_codigoUsuario(codigoUsuario),
    constraint FK_Usuarios_Personas foreign key (codigoUsuario) references Personas(codigoPersona)
);

create table Notas(
	codigoNota int not null auto_increment,
	encabezado varchar (50) not null,
	cuerpo varchar(250) not null, 
	fecha datetime not null default current_timestamp,
	comentarioAdmin varchar(50),
	valorizacion enum ('1','2','3','4','5') not null,
	codigoPersona int not null,
	codigoCategoria int not null,
    primary key PK_codigoNota(codigoNota),
    constraint FK_Notas_Personas foreign key (codigoPersona) references Personas(codigoPersona),
    constraint FK_Notas_Categorias foreign key (codigoCategoria) references Categorias(codigoCategoria)
);
 