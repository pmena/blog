INSERT INTO author (name, email, phone, birthdate) VALUES ('Pablo','pablo@correo.com','987213452','01/01/2022');


INSERT INTO blog (name, description, url, status, usuario) VALUES ('Blog 1','Contenido de blog 1','http://blog/1','activo',1);
INSERT INTO blog (name, description, url, status, usuario) VALUES ('Blog 2','Contenido de blog 2','http://blog/2','activo',1);
INSERT INTO blog (name, description, url, status, usuario) VALUES ('Blog 3','Contenido de blog 3','http://blog/3','activo',1);


INSERT INTO post (title, date, status, content, blog, author) VALUES ('Post 1','12/01/2022','publicado', 1, 1);
INSERT INTO post (title, date, status, content, blog, author) VALUES ('Post 2','13/01/2022','borrador', 1, 1);
INSERT INTO post (title, date, status, content, blog, author) VALUES ('Post 3','14/01/2022','publicado', 1, 1);
