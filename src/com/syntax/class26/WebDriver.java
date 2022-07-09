package com.syntax.class26;


    public interface WebDriver {

        /*
        Create a WebDriver Interface that will have the following unimplemented behaviour:
        openBrowser(), closeBrowser(), maximizeWindow(), findElement().
        Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
         */
        void openBrowser();

        void closeBrowser();

        void maximizeWindow();

        void findElement();

    }

    class ChromeDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("WebDriver opens the Chrome Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("WebDriver closing the Chrome Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("WebDriver maximizing the window of Chrome Browser");
        }

        @Override
        public void findElement() {
            System.out.println("WebDriver find elements from web page opened in Chrome Browser");
        }
    }

    class FireFoxDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("WebDriver opens the FireFox Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("WebDriver closing the FireFox Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("WebDriver maximizing the window of FireFox Browser");
        }

        @Override
        public void findElement() {
            System.out.println("WebDriver find elements from web page opened in FireFox Browser");
        }
    }