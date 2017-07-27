package factory;

public class FactoryPatternMain {

    public static void main(String[] args) {

        Website blogWebsite = WebsiteFactory.getWebsite(WebsiteType.BlogWebsite);

        if (blogWebsite != null) {
            System.out.println(blogWebsite.getPages());
        }

        Website shopWebsite = WebsiteFactory.getWebsite(WebsiteType.ShopWebsite);

        if (shopWebsite != null) {
            System.out.println(shopWebsite.getPages());
        }
    }
}
