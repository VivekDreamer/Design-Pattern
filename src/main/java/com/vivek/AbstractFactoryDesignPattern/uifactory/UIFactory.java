package com.vivek.AbstractFactoryDesignPattern.uifactory;

import com.vivek.AbstractFactoryDesignPattern.Button;
import com.vivek.AbstractFactoryDesignPattern.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
