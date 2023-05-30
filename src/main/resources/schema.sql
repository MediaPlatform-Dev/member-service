DROP DATABASE IF EXISTS member_service;
CREATE DATABASE member_service;
USE member_service;
DROP TABLE IF EXISTS tbl_member CASCADE;
CREATE TABLE tbl_member (
    member_num INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    member_id VARCHAR(100) NOT NULL UNIQUE,
    member_name VARCHAR(20)
);