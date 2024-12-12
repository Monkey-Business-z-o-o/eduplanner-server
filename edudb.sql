DO $$
BEGIN
    IF NOT EXISTS (
        SELECT FROM pg_database WHERE datname = 'eduplanner'
    ) THEN
        CREATE DATABASE eduplanner;
    END IF;
END $$;

GRANT ALL PRIVILEGES ON DATABASE eduplanner TO root;
