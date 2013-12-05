# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bracket (
  bracket_id                integer not null,
  constraint pk_bracket primary key (bracket_id))
;

create table forum (
  forum_id                  integer not null,
  forum_name                varchar(255),
  parent_id                 integer,
  constraint pk_forum primary key (forum_id))
;

create table post (
  post_id                   integer not null,
  post_date                 timestamp,
  post_content              varchar(255),
  constraint pk_post primary key (post_id))
;

create table topic (
  topic_id                  integer not null,
  subject_line              varchar(255),
  view_count                integer,
  constraint pk_topic primary key (topic_id))
;

create table user (
  username                  varchar(255) not null,
  password                  varchar(255),
  i_user_class              integer,
  location                  varchar(255),
  age                       integer,
  email                     varchar(255),
  eso_id                    varchar(255),
  post_count                integer,
  constraint pk_user primary key (username))
;

create sequence bracket_seq;

create sequence forum_seq;

create sequence post_seq;

create sequence topic_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists bracket;

drop table if exists forum;

drop table if exists post;

drop table if exists topic;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists bracket_seq;

drop sequence if exists forum_seq;

drop sequence if exists post_seq;

drop sequence if exists topic_seq;

drop sequence if exists user_seq;

