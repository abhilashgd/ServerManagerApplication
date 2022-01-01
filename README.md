# ServerManagerApplication
 _____                                         __  __
  / ____|                                       |  \/  |
 | (___     ___   _ __  __   __   ___   _ __    | \  / |   __ _   _ __     __ _    __ _    ___   _ __
  \___ \   / _ \ | '__| \ \ / /  / _ \ | '__|   | |\/| |  / _` | | '_ \   / _` |  / _` |  / _ \ | '__|
  ____) | |  __/ | |     \ V /  |  __/ | |      | |  | | | (_| | | | | | | (_| | | (_| | |  __/ | |
 |_____/   \___| |_|      \_/    \___| |_|      |_|  |_|  \__,_| |_| |_|  \__,_|  \__, |  \___| |_|
                                                                                   __/ |
                                                                                  |___/
                                                                                  
                                                                                  
                                                                                  
Manages server status and gives log of status information. front end - angular js, backend- sbring boot, DB-MySQL

//DOCKER COMMAND TO RUN MYSQL DB: docker container run --name serverdb -e MYSQL_ROOT_PASSWORD=letmein -d -p 3306:3306 mysql
docker exec -it 8df586ce3fda8a233670be25b3a029578e56cf9ab0ab4e165b1a8a80014871ba /bin/sh
mysql -uroot -pletmein
mysql> create database serverdb;
create user 'testuser'@'%' identified by 'testpassword';
grant all on serverdb.* to 'testuser'@'%';
show databases;

//Additional Tools: brew install --cask mysqlworkbench --> for DB inspection

#POSTMAN TESTING
GET: http://localhost:8080/server/list // should list all servers
GET: http://localhost:8080/server/get/2 //should list second object
POST: http://localhost:8080/server/save  //should give created response 200 OK
JSON RAW: {
            "ipAddress": "192.168.1.195",
            "name": "Ubuntu Linux",
            "memory": "32GB",
            "type": "Lenovo",
            "status": "SERVER_DOWN"
        }
 
