package factory;

import pages.*;

public class BlogWebsite extends Website {

    @Override
    protected void createWebsite() {

        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
        pages.add(new PostPage());
    }
}
