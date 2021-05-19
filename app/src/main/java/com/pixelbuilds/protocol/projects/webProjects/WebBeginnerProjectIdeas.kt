package com.pixelbuilds.protocol.projects.webProjects

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pixelbuilds.protocol.R

class WebBeginnerProjectIdeas : Fragment() {
    private var itemTitle = mutableListOf<String>()
    private var itemDescription = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_beginner_project_ideas, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView2)
        itemTitle.add("1. One-page layout")
        itemDescription.add("This project aims to recreate a pixel perfect design and make a one-page responsive layout. This is also a beginner-level project that allows freshers to test their newly acquired knowledge and skill level. " +
                "You can use the Conquer template to build this project. This template comes loaded with a host of unique layouts. Also, it brings before you a series of challenges that Web Developers often face in real-world scenarios. As a result, you are pushed to experiment with new technologies like Floats and Flexbox to hone the implementation of CSS layout techniques.")
         itemTitle.add("2. Login authentication")
        itemDescription.add("This is a beginner-level project that is great for honing your JavaScript skills. In this project, you will design a website’s login authentication bar – where users enter their email ID/username and password to log in to the site. Since almost every website now comes with a login authentication feature, learning this skill will come in handy in your future web projects and applications.")
        itemTitle.add("3. Product landing page")
        itemDescription.add("To develop a product landing page of a website, you must have sound knowledge of HTML and CSS. In this project, you will create columns and align the components of the landing page within the columns. You will have to perform basic editing tasks like cropping and resizing images, using design templates to make the layout more appealing, and so on.")
         itemTitle.add("4. Giphy with a unique API")
        itemDescription.add("This project involves developing a web application that uses search inputs and Giphy API for presenting GIFs on a webpage. This is an excellent beginner-level project wherein you use the Giphy API to recreate the Giphy website. We recommend you to use the Giphy API since you need not request for any API key to use it. Another advantage of using the Giphy API is that you don’t require to worry about configuration while requesting data. " +
                "You can use the Giphy API to build a web application that has a search input where users can search for specific GIFs, can display trending GIFs in a column/grid format, and has a load more option at the bottom for searching more GIFs.")
         itemTitle.add("5. JavaScript quiz game")
        itemDescription.add("This web development project aims to create a JavaScript quiz game that can take multiple answers and show the correct result to users. While gaining JavaScript knowledge isn’t tricky, applying that knowledge in real-world scenarios is usually challenging. However, you can experiment with your skills by working on a small JavaScript-based quiz game. " +
                "While building this project, you will not only deal with complex logic, but you will also learn a lot about data management and DOM manipulation. Depending on your JavaScript skills and ability to handle complex logic, you can make the game as simple or complicated as you want it to be!")
         itemTitle.add("6. To-do list")
        itemDescription.add("You can use JavaScript to build a web app that allows you to make to-do lists for routine tasks. For this project, you must be well-versed with HTML and CSS. JavaScript is the best choice for a to-do project since it allows users to design interactive coding lists where you can add, delete, and also group items.")
       itemTitle.add("7. SEO-friendly website")
        itemDescription.add("Today, SEO is an integral part of website building. Without SEO, your website will not have the visibility to drive traffic from organic searches in SERPs (search engine result pages). While Web Developers are primarily concerned about the website functionality, they must have a basic idea of web design and SEO. In this project, you will take up the role of a Digital Marketer and gain in-depth knowledge of SEO. It will be helpful if you are aware of the technical SEO for this project. " +
                "When you are well-versed in SEO, you can build a website having user-friendly URLs and featuring an integrated, responsive design. This will allow the site to load quickly on both desktop or mobile devices, thereby strengthening a brand’s social media presence.")
        itemTitle.add("8. JavaScript drawing")
        itemDescription.add("This project is inspired by Infinite Rainbow on CodePen. This JavaScript-based project uses JavaScript as a drawing tool to bring to life HTML and CSS elements on a web browser. The best thing about this project is that you can take advantage of JavaScript’s supercool drawing libraries like oCanvas, Canviz, Raphael, etc. " +
                "By working on this project, you can learn how to use and implement JavaScript’s drawing capabilities. This skill will come in handy for enhancing the appeal of static pages by adding graphical elements to them.")
        itemTitle.add("9. Search engine result page")
        itemDescription.add("This is a super interesting and exciting project! In this project, you have to create a search engine result page that resembles Google’s SERPs. While building this project, you must ensure that the webpage can display at least ten search results (just like Google). Also, you must include the navigation arrow at the bottom of the webpage so that users can switch to the next page.")
       itemTitle.add("10. Google home page lookalike")
        itemDescription.add("Another interesting JavaScript project on our list, this project requires you to build a webpage that resembles Google’s home page. Keep in mind that you have to build a replica of Google home page along with the Google logo, search icons, text box, Gmail, and images buttons – basically, everything that you see on Google’s home page. This should be relatively easy, provided you proficient in HTML and CSS. " +
                "Since the aim here is to build a replica of Google’s home page, you need not worry too much about the functionality of the components of the page.")
        itemTitle.add("11. Tribute page")
        itemDescription.add("Yes, tribute pages are a real thing. If you Google “tribute page,” you will find a comprehensive list of links showing you how to build tribute pages. Essentially a tribute page is a webpage dedicated in honor of someone you love, admire, or respect. It can be a person or a beloved pet. " +
                "A tribute page is a perfect project for sharpening your HTML and CSS skills and knowledge. In this project, you will make a webpage where you can write and dedicate a tribute to someone and publish the same. Apart from the writeup for the tribute, you need to add relevant images, links, etc., on the page.")
        itemTitle.add("12. Survey form")
        itemDescription.add("Building a survey form or questionnaire is easy if you are proficient in HTML or HTML5. Even today, lots of companies use survey forms as a means of collecting relevant data about their target audience. " +
                "In this project, you will have to design a full-fledged survey form that includes relevant questions like name, age, email, address, contact number, and other questions, depending on the type of company or organization you are shaping the form. This project will put to the test your webpage structuring skills.")
        itemTitle.add("13. Exit plugin")
        itemDescription.add("In this project, you will design an exit widget or plugin. When you visit a website or a webpage, you must have seen the tiny pop-ups that show on the screen when you wish to exit the site/page. Companies usually use exit plugins to show exciting offers to keep a user on the page. This is precisely what you have to design. " +
                "You can use your JavaScript and skills to design unique exit plugins wherein the content will be customized based on how long the user stays on a page.")
         itemTitle.add("14. Note log")
        itemDescription.add("This project will be much like the to-do list project we’ve mentioned above. The aim here is to design and build a notes app that can take multiple entries per note. It should allow users to select a note when they launch the app. When they choose a note, a new entry will be automatically tagged along with the current date, time, and location. Users can also sort and filter their entries based on this metadata. " +
                "This is a great web app for tracking events and resolving messy calendar problems.")
         itemTitle.add("15. Social share buttons")
        itemDescription.add("Most websites (particularly, content-based ones) built on WordPress have social share buttons that allow users to share content on various social media platforms. However, for static sites that aren’t based on WordPress, adding social share buttons is a challenge. " +
                "In this project, you will take up the challenge of writing a JavaScript code that will allow you to add social share buttons to static sites. While you can do this by incorporating HTML elements or images in the site’s template, using JavaScript allows you to add the share buttons dynamically.")
         itemTitle.add("16. Toast notifications")
        itemDescription.add("A toast notification is an unobtrusive and non-modal window element that is used to display brief, auto-expiring information to users. You can see toast notifications primarily on Android OS platforms. " +
                "In this project, you will be required to design a toast notification tool. Using your JavaScript skills and knowledge, you’ve to create a functional toast notification tool that can respond to events on the page and notify the users as and when an event has completed successfully. You could also use the setTimeout function to represent the delay in loading or saving data.")
         itemTitle.add("17. AJAX-style login")
        itemDescription.add("The focus of this project is to build the front-end of an AJAX-style login site/page. In AJAX-style login, the login page does not need to be reloaded to ensure whether or not you have to input the correct login details. " +
                "If you want, you can also create a mockup of both successful and invalid login situations by hard-coding a username and password and compare this to the information entered by a user. You can also include error messages for situations where the input data is incorrect or not found.")
         itemTitle.add("18. Word counter")
        itemDescription.add("This is a nifty tool for people who write detailed documentation, blogs, essays, etc., online. A word counter tool allows you to see how many words you’ve written so far and how much more you need to write. " +
                "This is a pretty simple project which requires you to build an application that can parse texts and show the number of words and characters contained in a writeup. You can also include additional functionality in the word counter to provide more advanced information such as the number of passive sentences in a block of text.")
         itemTitle.add("19. Countdown timer")
        itemDescription.add("Another simple project on our list is a countdown timer or clock. For this project, you just need to create a simple webpage that can update the time every second. With JavaScript as its foundation, you can make the page more appealing by including start, stop, and pause buttons on the page.")
       itemTitle.add("20. Modal pop-ups")
        itemDescription.add("This project is very similar to the social share button project. Here, you need to create a JavaScript code that will be immediately triggered every time a user clicks a button on the page or loads the page. " +
                "You will design modal pop-ups to provide notifications, promotions, and email signups to users. The pop-up should be such that it can be closed with a click as well. To make the project more challenging, you can experiment with different animations and modal entrances like fade-in and slide-out.")
        itemTitle.add("21. Address book")
        itemDescription.add("In this project, you have to build an application that can search for particular entries in your address book by filtering the attributes you specify. " +
                "You can either use an API that generates placeholder data, or you can also structure the JSON (JavaScript Object Notation). Once the data is in place, you must load it in your application by using an AJAX request (jQuery or XML HTTP request) just as you would in a real-world application. Also, you can design the web application to cache requests in the local storage to avoid unnecessary network requests.")
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = WebBeginnerAdapter(itemTitle, itemDescription)
        return view
    }
}