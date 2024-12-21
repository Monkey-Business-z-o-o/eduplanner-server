DO $$
DECLARE
    db_name TEXT := 'eduplanner'; -- Zmień na stałą wartość
    db_user TEXT := 'root'; -- Zmień na stałą wartość
BEGIN
    IF NOT EXISTS (
        SELECT 1
        FROM pg_database
        WHERE datname = db_name
    ) THEN
        RAISE NOTICE 'Database does not exist, creating it now.';
        EXECUTE format('CREATE DATABASE %I OWNER %I', db_name, db_user);
    ELSE
        RAISE NOTICE 'Database already exists, skipping creation.';
    END IF;
END $$;
