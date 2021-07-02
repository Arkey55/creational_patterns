package ru.romankuznetsov.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Создан чекбокс Win");
    }
}
