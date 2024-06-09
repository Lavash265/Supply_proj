Приложение для приемки поставок.

Стек: Backend java, hebernate, spring framework, база данных H2. Frontend - thymeleaf


В данном приложении можно:
1)Добавить, удалить и отредактировать поставщиков. 
2)Добавить, удалить и отредактировать продукцию для поставок. 
3)Добавить, удалить и отредактировать поставку.
4)Приложение формирует отчет по поставкам, с итогами по весу и стоимости, за выбранный промежуток времени.

 
Запуск приложения:

1)http://localhost:8080 - главное меню приложения, откуда можно попасть в разделы: поставщиков, продукции для поставки, поставок и раздел формирования отчета.

2)http://localhost:8080/suppliers - раздел поставщиков. Кнопка Edit отвечает за редактирование информации о поставщике, Delete - удаляет поставщика, Create supplier - интерфейс создания нового поставщика. Main page - выход в меню выбора разделов.

3)http://localhost:8080/fruits - раздел продукции для поставок. Кнопка Edit отвечает за редактирование информации о продукте, Delete - удаляет продукт, Create fruit - интерфейс создания нового продукта. Main page - выход в меню выбора разделов.

4)http://localhost:8080/deliveries - раздел создания поставок.  Кнопка Edit отвечает за редактирование информации о поставке, Delete - удаляет поставку, Create delivery - интерфейс создания новой поставки . Main page - выход в меню выбора разделов.

5)http://localhost:8080/report - меню выбора даты для формирования отчета. Generate report отвечает за создание отчета за выбранный период, Main page - выход в меню выбора разделов.

6)http://localhost:8080/list - отчет с итогами по весу и стоимости. Generate another report - создание другого отчета. Main page - выход в меню выбора разделов.

7)http://localhost:8080/suppliers/add-supplier - интерфейс создания нового поставщика

8)http://localhost:8080/fruits/add-fruit - интерфейс создания нового продукта

9)http://localhost:8080/deliveries/add-delivery - интерфейс создания новой поставки

10)http://localhost:8080/suppliers/update-supplier/{id} - редактирование информации о поставщике

11)http://localhost:8080/fruits/update-fruit/{id} - редактирование информации о продукте

12)http://localhost:8080/deliveries/update-delivery/{id} - редактирование информации о поставке

13) http://localhost:8080/report - интерфейс создания отчета

Улучшение приложения:

В перспективе, в данное приложение я бы добавил тесты, аутентификацию и авторизацию, полноценную базу данных, улучшил frontend стили. 
