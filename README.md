# Mobile Automation with Appium & Cucumber

## Overview
Automate mobile app testing using **Appium** and **Cucumber (Gherkin)**.

🚀 Quick Start - Appium set up on MAC (Android):
Install Homebrew
Install NodeJS
Install Java JDK and IntelliJ IDEA
Install Appium server using npm (CLI) or Appium desktop client
Install Android studio
Install Appium Inspector
Install uiAutomator2
Install element wait plugin
Set JAVA_HOME and ANDROID_HOME environment variables

## Installation
```sh
git clone https://github.com/hilmiiaziiz/appium-mobile-automation.git
mvn clean install
```

## Adding the Apps to your directory following this path
``` options.setApp(System.getProperty("user.dir") + "/apps/android.wdio.native.app.v1.0.8.apk");```

## Running Tests from GUI IDE
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure all dependencies are installed.
3. Navigate to `src/test/resources/features`.
4. Right-click on the feature file (e.g., `loginAutomation.feature`).
5. Click **Run 'loginAutomation.feature'**.

