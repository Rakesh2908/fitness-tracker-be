-- Indexes for user_id and date to speed up findByUserIdAndDate queries
CREATE INDEX idx_workouts_user_id_date ON workouts (user_id, date);
CREATE INDEX idx_nutrition_logs_user_id_date ON nutrition_logs (user_id, date);
CREATE INDEX idx_habits_user_id_date ON habits (user_id, date);
