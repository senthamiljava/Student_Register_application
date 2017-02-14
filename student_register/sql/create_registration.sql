CREATE TABLE registration_details
(
id INT PRIMARY KEY AUTO_INCREMENT,
email_id VARCHAR(100) NOT NULL,
event_id INT NOT NULL,
register_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (email_id) REFERENCES user_details(email_id),
FOREIGN KEY (event_id) REFERENCES EVENT(id)
);