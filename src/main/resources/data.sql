insert into city(country, name, state, map) values ('Australia', 'Brisbane', 'Queensland', '-27.470933, 153.023502');
insert into city(country, name, state, map) values ('Australia', 'Melbourne', 'Victoria', '-37.813187, 144.96298');
insert into city(country, name, state, map) values ('Australia', 'Sydney', 'New South Wales', '-33.868901, 151.207091');
insert into city(country, name, state, map) values ('Canada', 'Montreal', 'Quebec', '45.508889, -73.554167');
insert into city(country, name, state, map) values ('Israel', 'Tel Aviv', '', '32.066157, 34.777821');
insert into city(country, name, state, map) values ('Japan', 'Tokyo', '', '35.689488, 139.691706');
insert into city(country, name, state, map) values ('Spain', 'Barcelona', 'Catalunya', '41.387917, 2.169919');
insert into city(country, name, state, map) values ('Switzerland', 'Neuchatel', '', '46.992979, 6.931933');
insert into city(country, name, state, map) values ('UK', 'Bath', 'Somerset', '51.381428, -2.357454');
insert into city(country, name, state, map) values ('UK', 'London', '', '51.500152, -0.126236');
insert into city(country, name, state, map) values ('UK', 'Southampton', 'Hampshire', '50.902571, -1.397238');
insert into city(country, name, state, map) values ('USA', 'Atlanta', 'GA', '33.748995, -84.387982');
insert into city(country, name, state, map) values ('USA', 'Chicago', 'IL', '41.878114, -87.629798');
insert into city(country, name, state, map) values ('USA', 'Eau Claire', 'WI', '44.811349, -91.498494');

insert into ohrm_role(name, organization_id, status)values ('admin', 1, 'active');
insert into ohrm_role(name, organization_id, status)values ('user', 1, 'active');


insert into ohrm_users(firstname, lastname, middlename, user_role, username, password, status, organization_id,employee_id, employee_photo, gender, marital_status, dob, country) values ( 'Sunil', 'Suresh', 'Raja', 1, 'uname', 'pword', 'Active', 1, 'EPM008', 'photo.png', 'Male', 'Single', null , 'india');  