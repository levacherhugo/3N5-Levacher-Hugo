import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver




fun main() {
    println("Hello World!")
    val driver = ChromeDriver()
    driver.get("http://info.cegepmontpetit.ca/")
    val title = driver.title
    println(title)
    val button = driver.findElement(By.cssSelector("mat-toolbar mat-icon"))
    button.click()
    // find the mat-icon whose content is "school"
    val schoolIcon = driver.findElement(By.xpath("//*[text()='school']"));
    schoolIcon.click()
    val progButton = driver.findElement(By.xpath("//*[text()=' Prog. ']"))
    progButton.click()
    // find all elements with classes badge badge-info ng-star-inserted
    val badges = driver.findElements(By.cssSelector(".badge.badge-info.ng-star-inserted"))
    for (badge in badges) {
        println(badge.text)
        val url = badge.getAttribute("href")
        println(badge.text + " goes to " + url)
        val courseDriver = ChromeDriver()
        courseDriver.get(url)
        val courseTitle = courseDriver.title
        println(courseTitle)
        courseDriver.quit()
    }

    driver.quit()
}