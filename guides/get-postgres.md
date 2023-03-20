# Setup PostgreSQL 
For purposes of getting up and running quickly, we are using a [PostgreSQL docker container](https://www.docker.com/blog/how-to-use-the-postgres-docker-official-image/) and can be run using [Docker Compose](https://docs.docker.com/compose/gettingstarted/) via 

```shell
# start
docker compose -f data/psql/docker-compose.yml up

# see running process
docker ps

# terminate
docker compose -f data/psql/docker-compose.yml down

```

