package ru.romankuznetsov.abstract_factory.checkboxes;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Создан чекбокс Mac");
    }
}
