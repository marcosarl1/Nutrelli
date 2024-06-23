package com.nutrelli;

import com.nutrelli.view.Login;
import com.nutrelli.view.UISettings;
import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        UISettings.setupUI();
        EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
}