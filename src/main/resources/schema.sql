DROP TABLE IF EXISTS HISTORIQUE;
CREATE TABLE HISTORIQUE
(
    id     BIGINT AUTO_INCREMENT PRIMARY KEY,
    number INT          NOT NULL,
    langue VARCHAR(255) NOT NULL,
    date VARCHAR(255) NOT NULL
);