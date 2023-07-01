package com.demoqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Browsers {
    public WebDriver driver;
    ChromeOptions options;

    public WebDriver open(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
            options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_settings.popups", 0);
            prefs.put("download.default_directory", "C:\\Users\\Natasha.Kostovska\\Downloads\\DemoQA");
            options.setExperimentalOption("prefs", prefs);
            options.setExperimentalOption("excludeSwitches",
                    List.of("disable-popup-blocking"));
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("msedge")) {
            System.setProperty("webdriver.edge.driver", "D:\\Driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Browser unknown!");
        }
        return driver;
    }

    public WebDriver openWithSwitch(String browser) {
        switch (browser) {
            case "chrome": {
                System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
                options = new ChromeOptions();
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("profile.default_content_settings.popups", 0);
                prefs.put("download.default_directory", "C:\\Users\\Natasha.Kostovska\\Downloads\\DemoQA");
                options.setExperimentalOption("prefs", prefs);
                options.setExperimentalOption("excludeSwitches",
                        List.of("disable-popup-blocking"));
                driver = new ChromeDriver(options);
            }
            break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "msedge":
                System.setProperty("webdriver.edge.driver", "D:\\Driver\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("There is no such browser");
                break;
        }
        return driver;
    }

}
