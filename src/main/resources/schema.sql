
create TABLE city (
	id bigint generated by default as identity,
	country varchar(256),
	name varchar(256),
	state varchar(256),
	map varchar(256)
);



create TABLE user(
	id bigint generated by default as identity,
	firstname varchar(20),
	lastname varchar(20),
	middlename varchar(20),
	user_role varchar(50),
	username varchar(25),
	password varchar(50),
	status enum('Active','InActive'),
	organization_id int,
	employee_id varchar(20),
	employee_photo varchar(50),
	gender enum('Male','Female'),
	marital_status enum('Single','Married'),
	dob varchar(40),
	country varchar(50),
		PRIMARY KEY(id),
	);
/*create TABLE user(	
	id bigint generated by default as identity,
	firstname varchar(20),
	lastname varchar(20),
	PRIMARY KEY(id))*/

/*	FOREIGN KEY (organization_id) REFERENCES ohrm_organization(id),
	FOREIGN KEY (country)REFERENCES ohrm_country(id),
	 FOREIGN KEY (user_role) REFERENCES ohrm_role(id)
*/