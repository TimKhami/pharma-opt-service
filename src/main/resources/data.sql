-- 1. Добавляем тестовые компании (аптеки)
INSERT INTO companies (login, password_hash, inn, kpp, company_name, company_address)
VALUES ('pharmacy_center', 'hash_123', '7701002003', '770101001', 'Аптека Центр ООО', 'г. Москва, ул. Новый Арбат, д. 5');

INSERT INTO companies (login, password_hash, inn, kpp, company_name, company_address)
VALUES ('pharmacy_24', 'hash_456', '7802004005', '780201001', 'Аптека 24 Часа АО', 'г. Санкт-Петербург, Невский пр., д. 20');


-- 2. Добавляем карточки товаров в справочник склада
INSERT INTO products (warehouse_code, name, producer, country)
VALUES ('WH-PARACET-01', 'Парацетамол 500мг таб №20', 'Фармстандарт', 'Россия');

INSERT INTO products (warehouse_code, name, producer, country)
VALUES ('WH-ASPIRIN-02', 'Аспирин экспресс 500мг таб №10', 'Bayer', 'Германия');

INSERT INTO products (warehouse_code, name, producer, country)
VALUES ('WH-MIRAMIS-03', 'Мирамистин р-р 0.01% 150мл', 'Инфамед', 'Россия');


-- 3. Заполняем остатки на оптовом складе (с учетом серий и сроков годности)
-- Для Парацетамола (ID = 1) добавляем две разные серии
INSERT INTO stock (product_id, quantity, price, series, expiration_date)
VALUES (1, 500, 45.50, 'SER-PAR-2026', '2028-12-31');

INSERT INTO stock (product_id, quantity, price, series, expiration_date)
VALUES (1, 200, 48.00, 'SER-PAR-2027', '2029-06-30');

-- Для Аспирина (ID = 2)
INSERT INTO stock (product_id, quantity, price, series, expiration_date)
VALUES (2, 150, 320.00, 'BAY-ASP-99', '2027-10-15');

-- Для Мирамистина (ID = 3)
INSERT INTO stock (product_id, quantity, price, series, expiration_date)
VALUES (3, 80, 450.00, 'INF-MIR-11', '2028-01-01');
