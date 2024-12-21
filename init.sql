DO $$
BEGIN
    -- Sprawdza, czy baza danych istnieje, jeśli nie, tworzy ją
    IF NOT EXISTS (
        SELECT FROM pg_database WHERE datname = current_setting('POSTGRES_DB', true)
    ) THEN
        PERFORM dblink_exec(
            'dbname=' || current_setting('POSTGRES_DB', true) || 
            ' user=' || current_setting('POSTGRES_USER', true),
            'CREATE DATABASE ' || current_setting('POSTGRES_DB', true)
        );
    END IF;
END $$;

DO $$
BEGIN
    -- Sprawdza, czy użytkownik istnieje, jeśli nie, tworzy go
    IF NOT EXISTS (
        SELECT 1 FROM pg_roles WHERE rolname = current_setting('POSTGRES_USER', true)
    ) THEN
        CREATE USER root WITH PASSWORD current_setting('POSTGRES_PASSWORD', true);
        GRANT ALL PRIVILEGES ON DATABASE current_setting('POSTGRES_DB', true) TO root;
    END IF;
END $$;
