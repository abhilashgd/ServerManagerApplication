# ServerManagerApplication
Manages server status and gives log of status information. front end - angular js, backend- sbring boot, DB-MySQL

//DOCKER COMMAND TO RUN MYSQL DB: docker container run --name serverdb -e MYSQL_ROOT_PASSWORD=letmein -d -p 3306:3306 mysql
docker exec -it 8df586ce3fda8a233670be25b3a029578e56cf9ab0ab4e165b1a8a80014871ba /bin/sh
mysql -uroot -pletmein
mysql> create database serverdb;
create user 'testuser'@'%' identified by 'testpassword';
grant all on serverdb.* to 'testuser'@'%';
show databases;

//Additional Tools: brew install --cask mysqlworkbench --> for DB inspection
