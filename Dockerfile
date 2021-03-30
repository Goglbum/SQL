FROM mysql:8
WORKDIR /docker-entrypoint-initdb.d/
#ENTRYPOINT mysql -uapp -ppass app < schema.sql
#ENTRYPOINT mysql -uapp -ppass app -e "show tables" | grep -v Tables_in | grep -v "+" | gawk '{print "TRUNCATE TABLE `" $1 "`;"}' | mysql -uapp -ppass app