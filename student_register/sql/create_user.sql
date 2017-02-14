DROP TABLE sen_db.user_details;

CREATE TABLE user_details(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(100) NOT NULL,
email_id VARCHAR(100) NOT NULL UNIQUE,
mobile_number INT(12),
PASSWORD VARCHAR(15));
INSERT INTO user_details(NAME,email_id,mobile_number,PASSWORD) VALUES('senthamil','itsmesentamil@gmail.com',9656328,'pass@123');

SELECT * FROM user_details;

SELECT * FROM user_details WHERE email_id='itsmesentamil@gmail.com' AND PASSWORD='pass@123';