-- Добавляем поле city_name типа varchar(255)
ALTER TABLE offer
ADD COLUMN city_name varchar(255);

-- Добавляем поле city_id типа int
ALTER TABLE offer
ADD COLUMN city_id int;