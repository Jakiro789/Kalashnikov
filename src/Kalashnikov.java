/*
Автомат имеет спусковой механизм (курок) и рычаг переключения «одиночный выстрел» ‑ «автоматическая стрельба».
При нажатии на курок в зависимости от рычага переключения автомат выстреливает:
— 1 пулю при «одиночный выстрел»;
— 5 пуль при «автоматическая стрельба».
Если обойма пуста, то стрельба производится не может и необходимо сменить обойму. Ёмкость обоймы 30 патронов.
Если в обойме осталось менее 5 патронов, то при «автоматической стрельбе» выстреливаются все остающиеся.
Две обоймы заправлять одновременно нельзя.
Начальное состояние: обойма полна т.е. 30 патронов и рычаг переключен в состояние «одиночный выстрел».
 */
public class Kalashnikov {
    public static void main(String args[]) {
        System.out.println("Kalashnikov gun");
    }
}
