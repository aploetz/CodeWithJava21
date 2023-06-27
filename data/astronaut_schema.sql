CREATE TABLE astronauts (
    name VARCHAR(100) PRIMARY KEY,
    nasa_group_id INT,
    dob DATE,
    birthplace VARCHAR(50),
    university_id INT,
    FOREIGN KEY(nasa_group_id) REFERENCES nasa_group(id),
    FOREIGN KEY(university_id) REFERENCES university(id)    
);    
    
CREATE TABLE nasa_group (
    id INT PRIMARY KEY,
    year INT
);

CREATE TABLE university (
    id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE missions (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    start_date TIMESTAMP,
    end_date TIMESTAMP
);

CREATE TABLE astronaut_missions (
    astronaut_name VARCHAR(100),
    mission_id INT,
    PRIMARY KEY (astronaut_name, mission_id)
);

