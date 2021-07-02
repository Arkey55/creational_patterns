package ru.romankuznetsov.abstract_factory.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Создана кнопка Mac");
    }
}
