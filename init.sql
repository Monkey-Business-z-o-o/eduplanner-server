-- Ensure the 'root' role exists
DO
$$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_roles WHERE rolname = 'root') THEN
        CREATE ROLE root WITH LOGIN PASSWORD 'root123';
        ALTER ROLE root CREATEDB;
    END IF;
END
$$;

-- Create the 'edudb' database if it doesn't exist
DO
$$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_database WHERE datname = 'edudb') THEN
        PERFORM dblink_exec('dbname=postgres user=root password=root123', 'CREATE DATABASE edudb OWNER root');
    END IF;
END
$$;
