# Microservices-Lab4
1. Why is it important to create separate databases for each microservice (e.g., product_service, order_service, inventory_service)?

It lets the services run independly of each other to let them be decoupled for each other. 

2. What role does Flyway play in managing the database schema, and how does it ensure consistency across environments?

This keeps the database up to date with current information by using SQL files to make migrations.

3. How does Spring Data JPA simplify working with databases in each of the microservices?

This allows for less code that is not needed to be constenly repeated.

4. In the InventoryService, why did we use the @Transactional(readOnly = true) annotation, and what is its significance?

This peice of code make the inventory read only, we can use this to find if there is anything wrong with completing a request.

5. In a microservices architecture, what are some challenges when ensuring communication between the Product, Order, and Inventory Services?

You have to track multiple services to make sure that they are communicating properly and simply. This can become tricky if something changes in order for example and not updated in product, it can show a discreponcy of what it should be showing.

6. What are the advantages of using TestContainers for integration testing with MySQL in this lab?

They have there own area or container, away from other data that has already been used to keep a constant clean slate.
