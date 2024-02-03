package RepresentMethod_;

import RepresentMethod_.Banner;
import RepresentMethod_.Print;

/**
 * @author ryanw
 */
public class PrintBanner extends Print {
    // 这里是区分开委托和继承两种形式的关键
    private Banner banner;

    public PrintBanner(String bannerText) {
        banner = new Banner(bannerText);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
