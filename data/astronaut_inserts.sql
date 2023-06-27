INSERT INTO nasa_group (id, year) VALUES (1, 1959);
INSERT INTO nasa_group (id, year) VALUES (2, 1962);
INSERT INTO nasa_group (id, year) VALUES (3, 1963);

INSERT INTO university (id, name) VALUES (1,'US Military Academy');
INSERT INTO university (id, name) VALUES (2,'Purdue University');
INSERT INTO university (id, name) VALUES (3,'Princeton University');
INSERT INTO university (id, name) VALUES (4,'Air Force Institute of Technology');
INSERT INTO university (id, name) VALUES (5,'University of Washington');
INSERT INTO university (id, name) VALUES (6,'US Naval Academy');
INSERT INTO university (id, name) VALUES (7,'University of Michigan');
INSERT INTO university (id, name) VALUES (8,'Georgia Institute of Technology');

INSERT INTO missions (id, name, start_date, end_date)
VALUES (1, 'Gemini 3', '1965-03-23 14:24:00', '1965-03-23 17:16:31');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (2, 'Gemini 4', '1965-06-03 15:15:59','1965-06-07 17:12:11');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (3, 'Gemini 5', '1965-08-21 13:59:59', '1965-08-29 12:55:13');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (4, 'Gemini 6', '1965-12-15 13:37:26', '1965-12-16 15:28:50');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (5, 'Gemini 7', '1965-12-04 19:30:03', '1965-12-18 14:05:04');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (6, 'Gemini 8', '1966-03-16 16:41:02', '1966-03-17 03:22:28');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (7, 'Gemini 9', '1966-06-03 13:39:33', '1966-06-06 14:00:23');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (8, 'Gemini 10', '1966-07-18 22:20:26', '1966-07-21 21:07:05');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (9, 'Gemini 11', '1966-09-12 14:42:26', '1966-09-15 13:59:35');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (10, 'Gemini 12', '1966-11-11 20:46:33', '1966-11-15 19:21:04');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (11, 'Apollo 8', '1968-12-21 12:51', '1968-12-27 15:51:42');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (12, 'Apollo 9', '1969-03-03 16:00', '1969-03-13 17:00:54');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (13, 'Apollo 10', '1969-05-18 16:49', '1969-05-25 16:52:23');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (14, 'Apollo 11', '1969-07-16 13:32', '1969-07-24 16:50:35');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (15, 'Apollo 12', '1969-11-14 16:22', '1969-11-24 20:58:24');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (16, 'Apollo 13', '1970-04-11 19:13', '1970-04-17 18:07:41');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (17, 'Apollo 14', '1971-01-31 21:03:02', '1971-02-09 21:05');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (18, 'Apollo 15', '1971-07-26 13:34', '1971-08-07 20:45:53');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (19, 'Apollo 16', '1972-04-16 17:54', '1972-04-27 19:45:05');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (20, 'Apollo 17', '1972-12-07 05:33', '1972-12-19 19:54:58');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (21, 'Skylab 2', '1973-05-25', '1973-06-22 13:49:48');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (22, 'Mercury 9', '1963-05-15 13:04:13', '1963-05-16 23:24:02');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (23, 'Mercury 4', '1961-07-21 12:20:36', '1961-07-21 12:36:13');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (24, 'Apollo 7', '1968-10-11 15:02:45', '1968-10-22 11:11:48');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (25, 'Apollo-Soyuz Test Project', '1975-07-15 19:50', '1975-07-24 21:18');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (26, 'STS-1 (Columbia)', '1981-04-12 12:00:04', '1981-04-14 18:20:57');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (27, 'STS-9 (Columbia)', '1983-11-28 16:00', '1983-12-08 23:47:24');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (28, 'Apollo 1', '1967-02-21 18:00', '1967-02-21 23:31:19');
INSERT INTO missions (id, name, start_date, end_date)
VALUES (29, 'Mercury 8', '1962-10-03 12:15:12', '1962-10-03 21:28:22');


INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Buzz Aldrin','1930-01-20','Montclair, NJ', 3, 1);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Neil Armstrong','1930-08-05','Wapakoneta, OH', 2, 2);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Frank Borman','1928-03-14','Gary, IN', 2, 1);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Gene Cernan','1934-03-14','Chicago, IL', 3, 2);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Michael Collins','1930-10-31','Rome, Italy', 3, 1);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Pete Conrad','1930-05-02','Philadelphia, PA', 2, 3);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Gordon Cooper','1927-03-06','Shawnee, OK', 1, 4);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Richard Gordon','1929-10-05','Seattle, WA', 3, 5);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Gus Grissom','1926-04-03','Mitchell, IN', 1, 2);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Jim Lovell','1928-03-25','Cleveland, OH', 2, 6);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Jim McDivitt','1929-06-10','Chicago, IL', 2, 7);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Wally Schirra','1923-03-12','Hackensack, NJ', 1, 6);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Dave Scott','1932-06-06','San Antonio, TX', 3, 1);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Tom Stafford','1930-09-17','Weatherford, OK', 2, 6);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('Ed White','1930-11-14','San Antonio, TX', 2, 1);
INSERT INTO astronauts (name, dob, birthplace, nasa_group_id, university_id)
VALUES ('John Young','1930-09-24','San Francisco, CA', 2, 8);

INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Buzz Aldrin',10);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Buzz Aldrin',14);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Neil Armstrong',6);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Neil Armstrong',14);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Frank Borman',5);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Frank Borman',11);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gene Cernan',7);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gene Cernan',13);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gene Cernan',20);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Michael Collins',8);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Michael Collins',14);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Pete Conrad',3);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Pete Conrad',9);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Pete Conrad',15);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Pete Conrad',21);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gordon Cooper',3);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gordon Cooper',22);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Richard Gordon',9);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Richard Gordon',15);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gus Grissom',1);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gus Grissom',23);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Gus Grissom',28);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Jim Lovell',5);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Jim Lovell',10);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Jim Lovell',16);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Jim McDivitt',2);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Jim McDivitt',12);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Wally Schirra',23);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Wally Schirra',4);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Wally Schirra',29);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Dave Scott',6);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Dave Scott',12);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Dave Scott',18);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Tom Stafford',4);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Tom Stafford',7);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Tom Stafford',13);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Ed White',2);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('Ed White',28);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('John Young',1);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('John Young',8);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('John Young',13);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('John Young',19);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('John Young',26);
INSERT INTO astronaut_missions(astronaut_name, mission_id)
VALUES ('John Young',27);

