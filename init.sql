-- Włączenie rozszerzenia dblink, jeśli jeszcze nie jest włączone
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

-- Tworzenie bazy danych tylko wtedy, gdy nie istnieje
DO $$
BEGIN
    IF NOT EXISTS (
        SELECT 1
        FROM pg_database
        WHERE datname = current_setting('POSTGRES_DB', true)
    ) THEN
        RAISE NOTICE 'Database does not exist, creating it now.';
        EXECUTE format('CREATE DATABASE %I OWNER %I',
            current_setting('POSTGRES_DB', true),
            current_setting('POSTGRES_USER', true)
        );
    ELSE
        RAISE NOTICE 'Database already exists, skipping creation.';
    END IF;
END $$;

-- Nadanie uprawnień użytkownikowi
GRANT ALL PRIVILEGES ON DATABASE eduplanner TO root;
