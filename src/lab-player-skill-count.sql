SELECT * FROM skillS;
SELECT * FROM PLAYERS;

CREATE TABLE SKILLS (SKILL_ID NUMBER(20), SKILL_NAME VARCHAR(40));

ALTER TABLE SKILLS
ADD PRIMARY KEY (SKILL_ID);


CREATE TABLE PLAYERS (PLAYER_ID NUMBER(20),SKILL_ID NUMBER(20), PLAYER_NAME VARCHAR(40), FOREIGN KEY (SKILL_ID) REFERENCES SKILLS(SKILL_ID));

    

insert into SKILLS(SKILL_id,skill_name)values(2,'BOWLER');
insert into SKILLS(SKILL_id,skill_name)values(1,'BATSMAN');
insert into SKILLS(SKILL_id,skill_name)values(3,'ALLROUNDER');
insert into SKILLS(SKILL_id,skill_name)values(4,'WICKETKEEPING');


insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(1,1,'SHIKAR DHAWAN');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(2,1,'ROHIT SHARMA');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(3,1,'SHREYAS IYER');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(4,1,'VIRAT KOHLI');

insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(5,4,'RISHAB PANT');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(6,3,'HARDHIK PANDYA');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(7,3,'JADEJA');

insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(8,2,'CHAHAL');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(9,2,'BHUVI');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(10,2,'SHAMI');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(11,2,'BUMRAH');
insert into players(PLAYER_ID,SKILL_id,PLAYER_NAME)values(12,2,'chahar');

    SELECT  * FROM  SKILLS INNER JOIN PLAYERS ON skills.skill_id = players.skill_id;


    
    