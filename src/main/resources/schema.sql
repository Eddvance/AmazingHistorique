DROP TABLE IF EXISTS HISTORIQUE;
CREATE TABLE HISTORIQUE
(
    id              BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre          INT         NOT NULL,
    langue          VARCHAR(50) NOT NULL,
    local_date_time TIMESTAMP   NOT NULL
);