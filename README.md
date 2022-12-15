# Мобильное приложение «Сервис для технического обслуживания трансопртных средств»

## Актуальность

Отсутствие удобного сервиса для записи, позволяющего своевременно записать клиента на оказание услуги по тех. обслуживанию транспортного средства.

## Цель

Создание удобного сервиса для записи на тех. обслуживание транспортного средства.

## Права и роли веб приложения:

Инженер – это роль, пользователь которой, используя веб приложение, сможет просматривать созданные оператором заявки:

- авторизоваться в приложении (по логину и паролю);
- просмотр даты и времени заявки;
- просмотр модели машины в заявке;
- просмотр статуса заявки.

Оператор – это роль, пользователь которой, используя мобильное приложение, сможет:

- авторизоваться в приложении (по логину и паролю);
- выбрать тему, язык, часовой пояс;
- записать клиента на оказание услуги;
- просматривать список доступных услуг;
- создавать новую услуг;
- выбрать дату и время оказания услуги;
- выбрать организацию (адрес);
- просматривать данные журнала заявок на оказание услуг;
- менять статус заявки на оказание услуги (выполнено, в ожидании); 
- просматривать список всех клиентов;
- создавать нового клиента.

Администраторы приложения - это роль, которая включает в себя те же права, что у инженера и оператора, а также следующие:

- возможность добавления/удаления/редактирования аккаунтов пользователей;
- возможность добавления/удаления/редактирования ролей;

## Сценарий использования приложения:

1) Клиент совершает звонок в организацию для оказания услуг по обслуживанию транспортных средств.
2) Оператор уточняет - пользовался ли клиент услугами данной организации ранее.
3) Если нет, то собирает данные и создает нового клиента в приложении, заполняя необходимую информацию (ФИО, телефон, марку машины и т.д.).
4) Далее оператор уточняет удобное время и место (филиал), а также вид услуги. Информирует о стоимости и времени ожидания.
5) Получив необходимые данные, оператор формирует заявку на оказание услуги.
6) Далее инженер при просмотре списка заявок, какие технические средства ему будут необходимы и начинает подготовку к выполнению услуги.
7) После оказания услуги оператор переводит заявку в статус "выполнено".