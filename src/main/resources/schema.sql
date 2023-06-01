# DROP DATABASE IF EXISTS member_db;
# CREATE DATABASE member_db;
USE member_db;
DROP TABLE IF EXISTS tbl_member CASCADE;
CREATE TABLE tbl_member (
    member_num INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    member_id VARCHAR(100) NOT NULL UNIQUE,
    member_name VARCHAR(20)
);