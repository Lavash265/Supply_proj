package org.example.supplyes_project.DataInitializer;



import org.example.supplyes_project.interfaces.DeliveryService;
import org.example.supplyes_project.interfaces.FruitService;
import org.example.supplyes_project.interfaces.SupplierService;
import org.example.supplyes_project.models.Delivery;
import org.example.supplyes_project.models.Fruit;
import org.example.supplyes_project.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.GregorianCalendar;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private SupplierService supplierService;

    @Autowired
    private FruitService fruitService;

    @Autowired
    private DeliveryService deliveryService;

    @Override
    public void run(String... args) throws Exception {
        //Поставщики
        Supplier supplier1 = new Supplier();
        supplier1.setId(1);
        supplier1.setName("John");
        supplierService.addSupplier(supplier1);

        Supplier supplier2 = new Supplier();
        supplier2.setId(2);
        supplier2.setName("Bob");
        supplierService.addSupplier(supplier2);

        Supplier supplier3 = new Supplier();
        supplier3.setId(3);
        supplier3.setName("Michael");
        supplierService.addSupplier(supplier2);

        // Фрукты
        Fruit fruit1 = new Fruit();
        fruit1.setId(1);
        fruit1.setName("Apple1");
        fruit1.setPricePerKg(100);
        fruitService.addFruit(fruit1);

        Fruit fruit2 = new Fruit();
        fruit2.setId(2);
        fruit2.setName("Apple2");
        fruit2.setPricePerKg(150);
        fruitService.addFruit(fruit2);

        Fruit fruit3 = new Fruit();
        fruit3.setId(3);
        fruit3.setName("Pear1");
        fruit3.setPricePerKg(200);
        fruitService.addFruit(fruit3);

        Fruit fruit4 = new Fruit();
        fruit4.setId(4);
        fruit4.setName("Pear2");
        fruit4.setPricePerKg(250);
        fruitService.addFruit(fruit4);

        // Поставки
        Delivery delivery1 = new Delivery();
        delivery1.setId(1);
        delivery1.setSupplier(supplier1);
        delivery1.setFruit(fruit1);
        delivery1.setDeliveryDate(new GregorianCalendar(2024, 9, 10));
        delivery1.setWeight(15);
        deliveryService.addDelivery(delivery1);

        Delivery delivery2 = new Delivery();
        delivery2.setId(2);
        delivery2.setSupplier(supplier2);
        delivery2.setFruit(fruit2);
        delivery2.setDeliveryDate(new GregorianCalendar(2024, 10, 11));
        delivery2.setWeight(20);
        deliveryService.addDelivery(delivery2);
    }

}

