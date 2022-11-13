# java-explore-with-me
Ссылка на pull request: https://github.com/hpki/java-explore-with-me/pull/1
Ссылка на pull request: https://github.com/hpki/java-explore-with-me/pull/2

Приложение Explore with me. Дипломный проект курса Java разработчик от Яндекс.Практикум

Возможности приложения:
1. Добавлять пользователя/события/категории/подборки событий/заявки на события
2. Администрирование
3. Удаление пользователя/события/категории/подборки событий/заявки на события
4. Изменения пользователя/события/категории/подборки событий/заявки на события
5. Получение пользователя/события/категории/подборки событий/заявки на события
   Также в приложении реализован сбор и хранение статистики по просмотрам событий

Спецификация - [https://editor-next.swagger.io/](https://editor-next.swagger.io/)
Основной сервис   - [ewm-main-service-spec.json](ewm-main-service-spec.json)
Сервис статистики - [ewm-stats-service-spec.json](ewm-stats-service-spec.json)

Для запуска приложения необходим docker
Приложение запускается командой из терминала: docker compose up

Postman тесты для сервисов:
Основной сервис   - [ewm-main-service.json]()
Сервис статистики - [ewm-stat-service.json]()

