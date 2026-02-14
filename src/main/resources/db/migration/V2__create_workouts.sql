-- Workouts table: user workout logs linked to ExerciseDB exercise_id
CREATE TABLE workouts (
    id           BIGSERIAL PRIMARY KEY,
    user_id      BIGINT NOT NULL REFERENCES users(id),
    date         DATE NOT NULL,
    exercise_id  VARCHAR(255) NOT NULL,
    sets         INTEGER NOT NULL,
    reps         INTEGER,
    notes        TEXT
);
