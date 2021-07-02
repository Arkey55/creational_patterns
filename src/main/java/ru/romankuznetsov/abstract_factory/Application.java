package ru.romankuznetsov.abstract_factory;

import ru.romankuznetsov.abstract_factory.buttons.Button;
import ru.romankuznetsov.abstract_factory.checkboxes.Checkbox;
import ru.romankuznetsov.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
