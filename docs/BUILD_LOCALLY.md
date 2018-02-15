# Building locally
## Prerequisites
* You should have a computer with you. (Obviously!)
* You should have a stable WiFi connection which has an average broadband (as Forge has to download some stuff from online)
* You should know how to use your computer's terminal

## Get started!
1. Clone the project locally:
   ```bash
   git clone https://github.com/Chan4077/First-Mod.git
   ```
2. Next, do a `checkout` of the branch that you want (`1.12`, etc.):
   ```bash
   git checkout 1.12 # Or 1.9, 1.10.2, 1.11.2
   ```
3. This will branch out for the specific operating system.
   * Windows:
       1. Enter the following code into Terminal or PowerShell:
          ```shell
          gradlew.bat setupCiWorkspace
          gradlew.bat build
          ```
       2. The mod jar should be available at the following location: ``
   * macOS:
       1. Enter the following code into Terminal:
          ```shell
          ./gradlew setupCiWorkspace
          ./gradlew build
          ```
       2. The mod jar should be available at the following location: ``
   
## Notes
* This documentation will soon be available at the official website. Stay tuned!
* The code snippets above should also apply for Windows (hopefully anyway, have to check on an actual Windows computer...)