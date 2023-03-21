# Setup PostgreSQL

For purposes of getting up and running quickly, we are using a [PostgreSQL docker container](https://github.com/docker-library/docs/blob/master/postgres/README.md) and can be run using [Docker Compose](https://docs.docker.com/compose/gettingstarted/) via

```bash

# docker download and run
docker run --name chase-demo -p 5432:5432 -d \
    -e POSTGRES_PASSWORD=postgres \
    -e POSTGRES_USER=postgres \
    -e POSTGRES_DB=chase-db \
    postgres

# start with compose
docker compose -f data/psql/docker-compose.yml up

# confirm running docker container
docker ps

# psql inside docker container
docker exec -it chase-demo psql -U postgres chase-db

# or psql externally with psql client installed 
psql chases-example -h localhost -U postgres

# terminate

    # if using docker run
    docker stop chase-demo

    # if using docker compose: 
    docker compose -f data/psql/docker-compose.yml down

# delete the container cache
docker container prune

```
