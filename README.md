COMP 228: Java Programming
LAB #5 - Developing Database Applications using JDBC.

Purpose:	The purpose of this Lab assignment is to:
•	Practice JDBC in Java Applications 
•	Develop a GUI Java application with data access capabilities

Exercise 1:

Develop a GUI Java application that will allow the players to submit information about themselves and the games that they are playing on-line. The information will be stored in a simple Oracle database. The database tables are shown in the following picture:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/83415e63-fead-4f28-b0b2-42f9ecb0786c)

 

You should populate the table Game with titles of games that you have "played" during this semester. 

Your GUI should provide the necessary SWING or JavaFX components that will allow the user to enter and display the data. You will use JDBC to provide the following operations:
1.	Insert game and player information into the database.
2.	Update the existing player information.
3.	Display reports with player and played games information. You may use a JTable or other components to display the reports. Allow the user to select player_id.

Use prepared statements to implement all database operations.
(10 marks)
Evaluation:
Functionality	
Correct implementation of UI and event handling.		35%

Correct implementation of JDBC 		50%
Comments, correct naming of variables, methods, classes, etc.	5%

Friendly input/output	10%
Total	100%

The UI may look like the following:

[IN YOUR APPLICATION DO NOT USE THE SAME DATA. USE YOUR FULL NAME AS ONE OF THE PLAYERS.] 
![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/32d4f1cd-7eb3-4d5c-b71c-56d532d2feb6)


Display All Players

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/ef7268f1-562b-4b0a-9ebd-656f4bc2fbe5)


Update Operation:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/c8526e76-994b-4ed9-bd81-e365c206d209)



After Updating Display All Players:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/8f3c9a7e-8a5a-425e-bb73-00e609663e22)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Screenshot of my Output
Create Player

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/3d682fe1-15ba-4639-a3c1-48ac38679307)


 

Player is Created

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/4a466e91-3cf8-449b-8b30-3b440548e80e)
![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/79ce49b3-c64b-4537-936f-5f1542c5a1c6)

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/0cead402-0169-48d1-9a31-6455f9c26b97)



   
 

Search by ID functionality:
Before:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/421534c9-6a56-401e-8625-2e09f4454017)

 
After clicking Search by ID button:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/6989a563-9202-4123-b93d-da6eb4d1f019)

 

Update functionality:

Before Update

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/e62bcbd9-cf9e-446b-ad7a-99531c166190)

 
After Update

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/35e47175-1998-4ee8-8ffa-ee2316982c01)

 

After clicking Update button:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/233dc5a9-adab-4837-aed4-de2c1d3d8dbf)
 
Table is updated

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/3ab40020-b68d-47a7-b0f3-63e0ab4c11b6)




 



Display All Players Functionality:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/d19af7e9-4a0d-4b25-b6bb-ca0821bceea5)

 


Additional validations:
Error displayed when date is not valid

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/2eddb254-2f90-4efc-a0ac-88ea0394a868)

 

Error displayed when phone number is invalid

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/4eda1902-4e45-4092-bbcb-2491a0414047)

 

Error game score

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/4ce31ffc-7515-4573-984c-4afac0b8d280)

 

Error displayed when Clicking the Update button when Player ID is empty

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/6465a3f2-95e6-4c46-a9dc-c4156df130e8)

 

Error displayed when Clicking Search by ID button when PlayerID is empty

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/38ed290d-42fb-4e84-ae3c-df2efb16a771)

 

Error displayed when No data for playerID (PlayerID 5 does not exist in DB)

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/ac74e293-c37d-4e26-8db4-e4b0f4de7f26)

 

Clear functionality:
Before:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/70f86df5-a424-4aed-98a8-cd8fd230967d)

 

After:

![image](https://github.com/dyeyniyel/comp228-lab5-JDBC/assets/158533198/4801defb-e9b8-461e-85a2-3313f2cb391c)

 


Note:
I created sequence in Oracle database to handle the autogenerated primary ID (game_id, player_id, player_game_id). Below are the SQL queries I ran before executing the java program:

CREATE TABLE PLAYER (
    player_id VARCHAR(255) PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    address VARCHAR(255),
    postal_code VARCHAR(255),
    province VARCHAR(255),
    phone_number INT
);


CREATE TABLE GAME (
    game_id VARCHAR(255) PRIMARY KEY,
    game_title VARCHAR(255)
);

CREATE TABLE PLAYERANDGAME (
    player_game_id VARCHAR(255) PRIMARY KEY,
    game_id VARCHAR(255),
    player_id VARCHAR(255),
    playing_date DATE,
    score VARCHAR(255),
    FOREIGN KEY (game_id) REFERENCES GAME(game_id),
    FOREIGN KEY (player_id) REFERENCES PLAYER(player_id)
);	


CREATE SEQUENCE player_game_id_seq
START WITH 1
INCREMENT BY 1;	


CREATE SEQUENCE game_id_seq
START WITH 1
INCREMENT BY 1;

CREATE SEQUENCE player_id_seq
START WITH 1
INCREMENT BY 1;

ALTER TABLE PLAYERANDGAME MODIFY (PLAYER_GAME_ID DEFAULT player_game_id_seq.NEXTVAL);	
ALTER TABLE Game MODIFY (GAME_ID DEFAULT game_id_seq.NEXTVAL);	
ALTER TABLE Player MODIFY (PLAYER_ID DEFAULT player_id_seq.NEXTVAL);
