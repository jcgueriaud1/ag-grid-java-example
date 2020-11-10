package org.vaadin.example;

import com.vaadin.aggrid.AgGrid;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
public class ExampleView extends VerticalLayout {
    public ExampleView() {
        setSizeFull();
        AgGrid<String> grid = new AgGrid<>();
        grid.setSizeFull();
        grid.addColumn("value",value -> value)
            .setHeader("Value")
            .setFlex(1)
            .setSortable(true);
        grid.refreshColumnDefs();
        grid.setDataProvider(DataProvider.ofItems("item 1", "item 2", "item 3"));
        add(grid);
    }
}
