-- Nutrition logs: food entries with calories and macros from CalorieNinjas
CREATE TABLE nutrition_logs (
    id           BIGSERIAL PRIMARY KEY,
    user_id      BIGINT NOT NULL REFERENCES users(id),
    date         DATE NOT NULL,
    food_query   VARCHAR(500) NOT NULL,
    calories     INTEGER NOT NULL,
    protein_g    DOUBLE PRECISION,
    carbs_g      DOUBLE PRECISION,
    created_at   TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
