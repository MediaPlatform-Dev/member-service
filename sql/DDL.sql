DROP DATABASE IF EXISTS member_service;
CREATE DATABASE member_service;
USE member_service;
DROP TABLE IF EXISTS member CASCADE;
CREATE TABLE member (
    member_id VARCHAR(255),
    member_name VARCHAR(255),
    PRIMARY KEY (member_id)
);