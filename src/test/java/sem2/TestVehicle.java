package sem2;

import org.junit.Assert;
import org.junit.Test;

public class TestVehicle {
    @Test
    public void isInstanceOfCar() {
        // - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
        Car car = new Car("BMW", "X6", 2023);
        Assert.assertTrue(car instanceof Car);
    }

    @Test
    public void createCarWithFourWheels() {
        // - Проверить, что объект Car создается с 4-мя колесами.
        Car car = new Car("Mercedes-Benz", "CLS AMG 53 AMG", 2019);
        Assert.assertEquals(4, car.getNumWheels());
    }
    @Test
    public void createMotorcycleWithTwoWheels() {
        // - Проверить, что объект Motorcycle создается с 2-мя колесами.
        Motorcycle moto = new Motorcycle("yamaha", "r6", 2022);
        Assert.assertEquals(2, moto.getNumWheels());
    }

    @Test
    public void carSpeedTestDrive() {
        // - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
        Car car = new Car("Lada", "Niva", 2023);
        car.testDrive();
        Assert.assertEquals(60, car.getSpeed());
    }
    @Test
    public void motorcycleSpeedTestDrive() {
        // - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
        Motorcycle moto = new Motorcycle("ИЖ", "Планета-7", 2008);
        moto.testDrive();
        Assert.assertEquals(75, moto.getSpeed());
    }
    @Test
    public void carStop() {
        // - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
        Car car = new Car("Lada", "Vesta", 2023);
        car.testDrive();
        car.park();
        Assert.assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleStop() {
        // - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
        Motorcycle moto = new Motorcycle("Suzuki", "GSX1300R Hayabusa", 2004);
        moto.testDrive();
        moto.park();
        Assert.assertEquals(0, moto.getSpeed());
    }
}
