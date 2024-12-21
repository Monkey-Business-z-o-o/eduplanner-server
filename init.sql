DO $$
DECLARE
    db_name TEXT := '${POSTGRES_DB}';
    db_user TEXT := '${POSTGRES_USER}';
BEGIN
    IF db_name IS NULL THEN
        RAISE EXCEPTION 'POSTGRES_DB is not set.';
    END IF;

    IF db_user IS NULL THEN
        RAISE EXCEPTION 'POSTGRES_USER is not set.';
    END IF;

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
