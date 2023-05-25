DROP DATABASE IF EXISTS member_service;
CREATE DATABASE member_service;
USE member_service;
DROP TABLE IF EXISTS member CASCADE;
CREATE TABLE member (
    id BIGINT AUTO_INCREMENT,
    name VARCHAR(255),
    PRIMARY KEY (id)
);