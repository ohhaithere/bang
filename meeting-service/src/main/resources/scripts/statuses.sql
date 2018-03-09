CREATE TABLE status (
    id      BIGINT PRIMARY KEY,
    statusname    VARCHAR
);

INSERT INTO status VALUES (1, 'Ждет подтверждения гивером');
INSERT INTO status VALUES (2, 'Отменена (тейкер передумал до подтверждения)');
INSERT INTO status VALUES (3, 'Открыта (создана тейкером, ожидается выбор гивера)');
INSERT INTO status VALUES (4, 'Отклонена (гивер передумал)');
INSERT INTO status VALUES (5, 'Подтверждена');
INSERT INTO status VALUES (6, 'Завершена (всё прошло ок)');
INSERT INTO status VALUES (7, 'Не состоялась (отмена после подтверждения)');