docker stop postgresEp 2>/dev/null
docker rm postgresEp 2>/dev/null
docker run --name postgresEp -e POSTGRES_USER=root -e POSTGRES_PASSWORD=root123 -e POSTGRES_DB=eduplanner -p 5432:5432 -d postgres:15