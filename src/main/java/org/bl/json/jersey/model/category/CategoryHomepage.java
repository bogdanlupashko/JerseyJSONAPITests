package org.bl.json.jersey.model.category;

import org.bl.json.jersey.model.components.Category;

import java.util.LinkedList;

/**
 * Created by blupashko on 17.04.2015.
 */
public class CategoryHomepage {
    private LinkedList<Category> categories = new LinkedList<Category>();

    public LinkedList<Category> getCategories() {
        return categories;
    }

    public void setCategories(LinkedList<Category> categories) {
        this.categories = categories;
    }
}
