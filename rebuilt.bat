docker-compose -f .\scripts\docker-compose.yml down --rmi all 
.\ektg\mvnw.cmd install -f .\ektg\pom.xml
docker-compose -f .\scripts\docker-compose.yml up