package ru.romankuznetsov.abstract_factory.factories;

import ru.romankuznetsov.abstract_factory.buttons.Button;
import ru.romankuznetsov.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
