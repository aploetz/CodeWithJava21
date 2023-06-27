CREATE TABLE astronauts (
    name TEXT PRIMARY KEY,
    dob DATE,
    birthplace TEXT,
    nasa_group_id INT,
    nasa_group_year INT,
    university_name TEXT
);    

CREATE TABLE astronauts_by_group (
    nasa_group_id INT,
    nasa_group_year INT STATIC,
    astronaut_name TEXT,
    dob DATE,
    birthplace TEXT,
    university_name TEXT,
    PRIMARY KEY (nasa_group_id, astronaut_name)
);

CREATE TABLE astronauts_by_university (
    university_name TEXT,
    astronaut_name TEXT,
    nasa_group_id INT,
    nasa_group_year INT,
    dob DATE,
    birthplace TEXT,
    PRIMARY KEY (university_name, astronaut_name)   
);

CREATE TABLE astronauts_by_mission (
    mission_name TEXT,
    astronaut_name TEXT,
    mission_start_date TIMESTAMP STATIC,
    mission_end_date TIMESTAMP STATIC,
    university_name TEXT,
    nasa_group_id INT,
    nasa_group_year INT,
    dob DATE,
    birthplace TEXT,
    PRIMARY KEY (mission_name, astronaut_name)
);

