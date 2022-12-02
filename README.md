# Задача 1. Игра-шутер
### Описание
Это игра-шутер. У игрока должна быть возможность использовать разные виды оружия, в будущем в игру могут быть добавлены новые. Необходимо спроектировать иерархию классов, а также систему слотов для оружия у игрока.

#### Функционал программы
- Создание объекта Player у которого будет набор оружия;
- Возможность у игрока вызвать метод выстрела, внутри которогo    будут проверки на допустимость номера оружия для выстрела;
- Классы оружия должны быть в пакете weapon (вспомните какие ДВЕ вещи нужно сделать, чтобы поместить классы в пакеты; мы их проходили на втором занятии);
- Возможность выбора оружия для выстрела в main.
___Процесс реализации___
1. Создадим класс игрока.
Класс `Player` содержит список оружия и метод "выстрелить"
~~~
public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new RPG(),
                new WaterPistol(),
                new Machine(),
                new Slingshot(),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot == weaponSlots.length) {
            System.out.println("нет такого оружия!!!!");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}

~~~
2. Метод main
~~~
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.format("У игрока %d слотов с оружием,"
            + " введите номер, чтобы выстрелить,"
            + " -1 чтобы выйти%n", 
            player.getSlotsCount();
        int slot;
    
        System.out.println("Game over!");
}
3. Создадим классы для некоторых видов оружия.
Базовый класс для всех видов оружия
class Weapon {
    public void shot() {
    }
~~~
4. Создадим дочерние классы.
`Pistol`
`RPG`
`WaterPistol`
`Slingshot`
`Machine`
В каждом из дочерних классов переопределил метод `shot()`, чтобы он изменил поведение оружия в соответствии с его типом. Например, чтобы оно выводило в консоль соответствующие выстрелу звуки: Пив-Пав!.

5. Теперь можно вернуться к классу Player и создать по экземпляру каждого оружия.
