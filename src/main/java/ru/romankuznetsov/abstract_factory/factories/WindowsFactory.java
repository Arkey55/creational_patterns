package ru.romankuznetsov.abstract_factory.factories;

import ru.romankuznetsov.abstract_factory.buttons.Button;
import ru.romankuznetsov.abstract_factory.buttons.MacOSButton;
import ru.romankuznetsov.abstract_factory.buttons.WindowsButton;
import ru.romankuznetsov.abstract_factory.checkboxes.Checkbox;
import ru.romankuznetsov.abstract_factory.checkboxes.MacOSCheckbox;
import ru.romankuznetsov.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
