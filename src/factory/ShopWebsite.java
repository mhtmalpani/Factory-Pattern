package factory;

import pages.*;

public class ShopWebsite extends Website {

    @Override
    protected void createWebsite() {

        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
