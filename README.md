# ektg
ek tg connector


## run pgsql
cd .\scripts\database\init\
/* and run dockerfile with [dot] for using current directory */
docker build -t ektg:ektg .
docker run ektg:ektg