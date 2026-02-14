-- Habits table: daily sleep and steps per user
CREATE TABLE habits (
    id           BIGSERIAL PRIMARY KEY,
    user_id      BIGINT NOT NULL REFERENCES users(id),
    date         DATE NOT NULL,
    sleep_hours  DOUBLE PRECISION,
    steps        INTEGER
);
