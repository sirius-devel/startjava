CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT NOT NULL,
    mark CHAR(6) NOT NULL,
    height REAL,
    weight REAL,
    status TEXT NOT NULL,
    origin TEXT NOT NULL,
    launch DATE NOT NULL,
    kaijuKill INT
);
