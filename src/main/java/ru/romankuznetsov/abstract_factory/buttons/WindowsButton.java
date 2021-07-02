package ru.romankuznetsov.abstract_factory.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Создана кнопка Win");
    }
}
