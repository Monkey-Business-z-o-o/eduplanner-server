-- Włączenie rozszerzenia dblink
DO $$
BEGIN
    IF NOT EXISTS (
        SELECT 1
        FROM pg_available_extensions
        WHERE name = 'dblink'
    ) THEN
        CREATE EXTENSION dblink;
    END IF;
END $$;

-- Tworzenie bazy danych, jeśli nie istnieje
DO $$
BEGIN
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

-- Nadanie uprawnień użytkownikowi
GRANT ALL PRIVILEGES ON DATABASE eduplanner TO root;
