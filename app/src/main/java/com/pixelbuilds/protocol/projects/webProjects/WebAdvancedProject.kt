package com.pixelbuilds.protocol.projects.webProjects

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pixelbuilds.protocol.R

class WebAdvancedProject : Fragment() {
    private var itemTitle = mutableListOf<String>()
    private var itemDescription = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_advanced_project, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView3)
        itemTitle.add("1) Youtube Radio")
        itemDescription.add("This can be the best web app project ideas to make money at a very low investment. Youtube is a sensation. A search-based video platform that everybody follows. How about an app that picks the best contents of youtube and plays them for the audience. No need for searching or taking the pain to make a playlist. Play the radio and the party is on.")
        itemTitle.add("2) Machine Learning-Based Astrology")
        itemDescription.add("Many people in Asian countries believe in Astrology. A Machine learning-based Astrological advisor website can tell real-time predictions to the users and advise the remedies as well without visiting a real astrologer.")
        itemTitle.add("3) AI-Based Browser Cookies")
        itemDescription.add("How about building a web app that adds to your browser and tracks everything intelligently. Your browser caches all your activities and suggests show options as per your behavior. Hence, it can be one of the excellent web app project ideas for you to offer users personalization on the browser.")
        itemTitle.add("4) Chatbot Hosting")
        itemDescription.add("Chatbots are replacing chat support to a great extent. If you can build ai chatbots and sell chatbots hosting services to clients who need a bot for their customer’s regular questions then it can be a good idea. You can build a Chabot with rich machine learning code using the Tensorflow framework.")
        itemTitle.add("5) Hobbymaker")
        itemDescription.add("Many people in the cities cannot continue their hobbies due to a lack of partners. It will be great web project ideas if there is a platform that connects movie lovers, chess players, joggers, bowlers, and gives them an opportunity to meet in person to do their thing.")
        itemTitle.add("6)Childtube")
        itemDescription.add("Making children sleep is sometimes not easy for parents. They need something of their interest. If there is a web platform that plays Youtube videos dimming the lights and changing the sound waves, it will help them sleep faster.")
        itemTitle.add("7) Business Advisor")
        itemDescription.add("A platform like Quora which is specifically built for business issues can be considered as one of the simple web app ideas. Be it accounting, finance, HR, team management, or anything else, people can share their issues and get them resolved by other professionals. This can be one of the top web simple app ideas for those who are well aware of corporates and starting a new business by hiring a web design company.")
        itemTitle.add("8) Blockchain-based Medical Support Platform")
        itemDescription.add(
            "There are many rare diseases that are left untreated only for the lack of awareness. A web portal that connects those patients and helps them to fight such tragedies in a better way." +
                    "If you hire blockchain developers for this medical web app, then this would ensure safe medical records storage of your patient’s data. Nowadays, the government has made this move and approaching top Blockchain development companies in order to maintain records of all their citizens."
        )
        itemTitle.add("9) Local Dating Portal")
        itemDescription.add("Online dating is one of the most emerging web simple app ideas. Apps like Tinder mixes up cultures. Hence, there can be a dating website that focuses on connecting people from the same cultures. This an awesome web application idea for the project in 2021.")
        itemTitle.add("10) Browser Tracker")
        itemDescription.add("A browser plugin that tracks the current activity of employees and in case any suspicious website is opened, it sends a notification to the admin. Moreover, it can also set a timer if there is a time limit for certain websites. In fact, Blockchain technology has introduced encryption digital identities app which provides security to the confidential data. Hence, simple web app ideas like this can benefit a lot.")
        itemTitle.add("11) Reminder App")
        itemDescription.add("Sometimes when working on different things people miss out on important facts. One of the best web app ideas can be a web-based reminder app that sends notifications so that you do not miss important things.")
        itemTitle.add("12) Image editor")
        itemDescription.add("Everyone likes to edit their images before uploading them on social media platforms. If there is a website that offers image editing, collage making, and direct uploading options then it can be great.")
        itemTitle.add("13) Startup club")
        itemDescription.add("A Social network web app where people submit things they’ve created like articles they’ve written, products they’ve released, or YouTube videos. You view a list of them and promote the ones you like on your social media accounts. More promotions of other people’s stuff buy your own posts a higher position on the site.")
        itemTitle.add("14) Bloggers Arena")
        itemDescription.add("A blogging platform(one of the best web app ideas) which automatically links between users’ posts. It matches words and phrases common in posts, preferring longer matches. For example, if this project description were a post on the platform, the words “blogging platform” might automatically be linked to another user’s post on the top blogging platforms in 2018. Links may change over time.")
        itemTitle.add("15) Medicine Review")
        itemDescription.add("It is always good to crosscheck before you take medicine. If there is any website that provides real-time information about compositions and customer reviews of the medicine.")
        itemTitle.add("16) Website Builder")
        itemDescription.add("Startups and bloggers generally opt for readymade DIY websites. If there is a platform where users can build their own website without much technical knowledge then it would be really helpful. So, it is one of the best and simple web app ideas.")
        itemTitle.add("17) Online Storage Space")
        itemDescription.add("There are many microblogging and personal websites that require online storage space. If there is a website that can provide online storage space at an affordable price, then it can be one of the best web simple app ideas.")
        itemTitle.add("18) Memes and Gifs")
        itemDescription.add("Memes and Gifs are all over the internet. If you can build a website where people can find amazing memes and gifs and also others can share their self-made pictures then it can be one of the best web app ideas.")
        itemTitle.add("19) Book Review Platform")
        itemDescription.add("There are millions of people who love to read books and need suggestions for future reading. A common platform that is open for book reviews from every user can be a great help to make purchasing decisions.")
        itemTitle.add("20) Social Platform Alert")
        itemDescription.add("Just like Truecaller, this is a website and plugin which helps to understand if you should talk to a person or not. This is especially beneficial for women who face difficulties with strangers on social platforms such as Linkedin and Facebook and turned out to be one of the best and simple web app ideas.")
        itemTitle.add("21) Payments via UPI")
        itemDescription.add("Nowadays, almost every shopkeeper accepts UPI payments, and apps like Paytm, Phone Pay, and Google Pay are making full use of it. Developing an app that can do the same work, for example, accepting and sending money, linking the app with the account number/ IFSC, PAN number, Aadhaar number, and phone number or QR code for transferring money.")
        itemTitle.add("22) Finding Parking space")
        itemDescription.add("This app can help you find parking space by using webcams, GPS locations in a specific area. This finding parking space web app idea is unique and there are not that many apps till now.")
        itemTitle.add("23) Scan and shop")
        itemDescription.add("Usually, when we all search for any product, we have to type the name of the product or any other related product. This app can help you in a way that you don’t need to type the name of the product, just scan the product, and you will get all details about that product and all other related products.")
        itemTitle.add("24) Reservation in Restaurants")
        itemDescription.add("This app can allow you to see the graphical layout of the restaurants, and according to your desired seat/table, you can do the booking.")
        itemTitle.add("25) Home Security")
        itemDescription.add("This app will let you see all the security devices at your home like cameras or alarms. You can also check every activity through video footage at your office space whenever you want.")
        itemTitle.add("26) Housekeeper Finding")
        itemDescription.add("Finding a Housekeeper was a tough task before, but now, it can be done easily by this app, You can search for the housekeeper according to your needs (like cooking, washing, dusting, dog-walking).")
        itemTitle.add("27) Subscription Alert")
        itemDescription.add("Nowadays, every other app like Amazon Prime, Netflix, Disney Hotstar are asking for subscriptions and this app can help in reminding you to pay payments when the deadline comes.")
        itemTitle.add("28) Railway tracking")
        itemDescription.add("This app can help people who travel via train on most occasions, A railway tracking app can help you by giving the exact location of the train so that you can decide, whether to take the train or chose an alternative option.")
        itemTitle.add("29) Language Translation")
        itemDescription.add("Voice translation app can help you to translate spoken words in real-time. It will reduce the gap between the people who do not know the same language.")
        itemTitle.add("30) GST Return Filing Web App")
        itemDescription.add("This type of app can keep all the records of income, business supplies, expenses, and tax transactions, and according to it, this app can automatically find out the taxpaying liability for that period. This app will help everyone who is a taxpayer.")
        itemTitle.add("31) Writer’s solitude")
        itemDescription.add("Creating this app will definitely help writers as it can block all the distractions on the system except the one needed for the writers. It can be helpful in giving full concentration at work.")
        itemTitle.add("32) Grocery delivery")
        itemDescription.add("You can make this app, as this can help many individuals that are looking for the right service or agents who can do grocery shopping on their behalf and according to the list provided by them.")
        itemTitle.add("33) Traveling")
        itemDescription.add("This app can suggest to you the best places to travel and also the places which you should not travel to according to your interest.")
        itemTitle.add("34) Finding song")
        itemDescription.add("Sometimes, it is hard to find a song when you heard it but didn’t remember the lyrics. This app can help you find the song based on the tone or few words provided by you. It can also give you the link to the song to download, or you can listen online.")
        itemTitle.add("35) Freelancing Web App")
        itemDescription.add("This skill assessment and the freelancing app will let people assess their skills through some automated tests or problems. Based on these tests, the employee can also get in touch with several companies for freelancing work.")
        itemTitle.add("36) Investment")
        itemDescription.add("This app is an AI-based investment web application, This app will invest automatically based on market research and analysis, and will ask you how much you want to spend and how frequently you want to credit the amount.")
        itemTitle.add("37) Help/ Safety Alert")
        itemDescription.add("This app will be very beneficial for women, girls, or anyone who is in need of help. It will allow sending notifications to people who live nearby so that they can come and help the needy person.")
        itemTitle.add("38) Health Monitoring")
        itemDescription.add("This app will not only keep track of or monitor your health but also notify/recommend regular health checkups after every specific time.")
        itemTitle.add("39) Ride-Sharing")
        itemDescription.add("Many people travel long-distance and which costs them a lot of money, this app(Ride-Sharing) can help as it will give them an option for sharing the ride with someone who is also going to the same destination.")
        itemTitle.add("40) Interior Designing")
        itemDescription.add("Through this application, you can design your room or home by adding several options like a sofa, T.V, table, carpet, wall pictures, curtains, etc. It will also recommend places from where you can buy interior design kind of stuff.")
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = WebAdvancedAdapter(itemTitle, itemDescription)
        return view
    }
}