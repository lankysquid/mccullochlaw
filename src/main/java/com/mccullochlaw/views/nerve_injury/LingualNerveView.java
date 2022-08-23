package com.mccullochlaw.views.nerve_injury;

import com.mccullochlaw.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Lingual Nerve")
@Route(value = "lingual_nerve", layout = MainLayout.class)
public class LingualNerveView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public LingualNerveView() {
        name = new TextField("Lingual Nerve Page");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
    }

}
