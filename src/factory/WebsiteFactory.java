package factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType type) {

        switch (type) {
            case BlogWebsite:
                return new BlogWebsite();

            case ShopWebsite:
                return new ShopWebsite();

            default:
                return null;
        }
    }
}
