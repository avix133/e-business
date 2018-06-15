# --- !Ups

-- we don't know how to generate schema main (class Schema) :(
create table category
(
  id integer not null
    primary key
  autoincrement,
  name varchar not null
)
;

create table keyword
(
  keyword_id INTEGER not null,
  value VARCHAR(30) not null
)
;

create unique index keywords_keyword_id_uindex
  on keyword (keyword_id)
;

-- unexpected locus for key
;

create table play_evolutions
(
  id int not null
    primary key,
  hash varchar(255) not null,
  applied_at timestamp not null,
  apply_script text,
  revert_script text,
  state varchar(255),
  last_problem text
)
;

create table product
(
  id integer not null
    primary key
  autoincrement,
  name varchar not null,
  description text not null,
  category int not null
    references category
)
;

create table opinion
(
  product INTEGER not null
    primary key
    constraint opinion_product_id_fk
    references product,
  comment TEXT not null
)
;

create table product_type
(
  type_id INTEGER not null,
  name VARCHAR(25) not null
)
;

create unique index product_type_type_id_uindex
  on product_type (type_id)
;

-- unexpected locus for key
;

create table user
(
  user_id integer not null
    primary key
  autoincrement,
  firstName varchar not null,
  lastName varchar not null,
  fullName varchar not null,
  email varchar not null,
  token varchar not null
)
;

create table cart_ids
(
  cart_id INTEGER not null,
  user INTEGER not null
    constraint cart_ids_user_user_id_fk
    references user
)
;

create unique index basket_ids_basket_id_uindex
  on cart_ids (cart_id)
;

create unique index basket_ids_user_uindex
  on cart_ids (user)
;

-- unexpected locus for key
;

create table cart_product
(
  cart INTEGER not null
    primary key
    constraint cart_product_cart_ids_cart_id_fk
    references cart_ids,
  product INTEGER not null
    constraint cart_product_product_id_fk
    references product,
  amount INT default 1 not null
)
;

create table "order"
(
  order_id INTEGER not null,
  cart INTEGER not null
    constraint order_cart_ids_cart_id_fk
    references cart_ids,
  date DATE not null,
  address INTEGER not null
)
;

create unique index order_order_id_uindex
  on "order" (order_id)
;

-- unexpected locus for key
;



# --- !Downs

drop table "product";
drop table "category";
drop table cart_ids;
drop table cart_product;
drop TABLE "keyword";
drop table "opinion";
drop table "order";
drop table "product_type";

