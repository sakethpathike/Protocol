package com.pixelbuilds.protocol.projects.androidProjects

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pixelbuilds.protocol.R

class AndroidAdvancedProjects : Fragment() {
    private var itemTitle = mutableListOf<String>()
    private var itemDescription = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_android_advanced_projects, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView1)
        itemTitle.add("1. Online Complaint Management System")
        itemDescription.add(
            "This project provides a smart system where the users can place complaints about the cities. It is an app that is not developed for people to file complaints about where they live, but for wherever they are. This app will let people add the location of whichever place they are and add the photo and its description. This will help resolve issues like overflowing drainage, leakages, street light issues, etc." +
                    "The requirement to develop this application is Android Studio along with Java||Kotlin||ReactNative and XML. JSON, HTML can also help to design the front end of the application. It will have access to google maps and give an accurate location of the place to file a complaint." +
                    "There would be two modules that are the User and the Admin. The users would register themselves on this application. And then they can login in to the application and make use of it for the improvement of our country and the safety of our people. The admin can see all the complaints and the users who placed it. The admin can then take necessary actions."
        )
        itemTitle.add("2. White Card Project")
        itemDescription.add(
            "This project named White Card aims at designing an application for a well secured dynamic application in sensor reading. This white card can be an all in one card. This app has a personal identification card and a future Indian project that will denote Indians. An Id card can be any document that is useful to verify a person’s identity. This card will include details of all cards like Driving license, Pan Card, Voter Id card, or Ration Card." +
                    "This application will use Android Studio IDE along with Java||Kotlin||ReactNative programming for its functioning and XML for its user interface. SQLite will be useful for the back end tool to store data locally." +
                    "The modules are White card creation, Barcode updating, Centralization of data, Mining data from the server, and Getting details. The users can use this application without any issue as it has security."
        )
        itemTitle.add("3. Digital Vehicle")
        itemDescription.add(
            "This is a full-stack android project, good for the final year. This app will store the data of public vehicle details. As we know, the use of vehicles has increased, and people do not follow the rules while on roads. This app will enable police to view, check, and track the driver details. These details include License, Insurance, RC books, etc. It will also let them write the punishments for disobeying the rules." +
                    "For this application, you would need to use Android Studio as a platform for its development. In Android Studio, we’ll use Java||Kotlin||ReactNative Programming and XML for its functionality and front end development. The Admin would handle the databases of this app, and only the admin would be able to enter or update it." +
                    "The two modules for this application are the Police and the Public. The Police would be able to login, check license, and RC books. They can also update the punishment of the public. The public would be able to login, update their documents, and maintain databases this way."
        )
        itemTitle.add("4. Android based Bluetooth Chat")
        itemDescription.add(
            "This is a very simple but useful project idea, to enable people to chat with each other even if they do not have the internet. This is a bluetooth chatting app that enables users to create profiles and chat with a server with the help of the device’s bluetooth." +
                    "For this application, you would need Android Studio as a platform for app development. Java||Kotlin||ReactNative and XML for the front end that is the user interface and also it’s functioning." +
                    "The users would be able to chat with each other only when their devices connect to each other using bluetooth. It will also maintain a chat history, for every time you connect and chat, it saves the messages. Thus with this users would be able to chat even when they do not have any Internet facility."
        )
        itemTitle.add("5. Android Call Managing App")
        itemDescription.add(
            "This is a simple idea to begin with in order to practice and improve your android app development skills. It will be an application that will be useful to manage the phone calls with an auto-reply if the users are busy. This application will send a message to the caller if the user does not pick or respond to the calls." +
                    "This application will use Android Studio with Java and XML. Java||Kotlin||ReactNative and XML will support the front-end of the application. For the backend, we will use SQLite for our project." +
                    "For this application, the users would need to register themselves with the app. And then grant permission to access the messages and calls on the device. Once done, it is ready for use."
        )
        itemTitle.add("6. Residential Management")
        itemDescription.add(
            "This Residential management application is especially aiming at helping people by solving their problems. This application is basically for a township or a residential area, where so many families reside. This application would be as a residential complaint management system. It will store everything right from the complaints to the visitors and all." +
                    "To develop this application you would need to use Android Studio with Java||Kotlin||ReactNative and XML. Java will be to make the application work and XML for the user interface. For the backend, you can use PHP and SQL for database management." +
                    "There are two modules for his project that are the Admin and the User. The admin will keep a record of every user along with their requirements, their complaints, registry, and also their feedback. The user will be able to login, register, place complaints, and see their complaint status. Users can also generate alert SOS for the urgent need at their place and write feedback."
        )
        itemTitle.add("7. Disaster management helping app")
        itemDescription.add(
            "This project aims to be useful during the natural calamities to get timely and accurate information about it. This will let the rescuers and sufferers exchange information about the latest circumstances. It will also lead the rescue wing to provide support as soon as possible. This system will use mobile services to acquire real-time information of users and environment." +
                    "For the development of this project you can use Android Studio with Java||Kotlin||ReactNative and XML. Here, the user can send their queries immediately. The users can post queries even if they are not registered.\n" +
                    "There are three modules for this project that are\n" +
                    "The Admin: The admin will have track of whatever the users are posting, and suggest solutions. They can also view the disaster location and details." +
                    "\n" +
                    "The User: The user would be able to register and login. They will have a profile with their personal details as well. They can post their queries and get solutions for their queries." +
                    "\n" +
                    "The Public: Public here would be able to post queries and get suggestions and solutions."
        )
        itemTitle.add("8. Matrimonial Application")
        itemDescription.add(
            "Matrimonial Application is a project to overcome the problem faced by many bachelors to find their perfect match for marriage. This will get a lot of tests and screenings for the users to continue to find a match for them. The users would register with their details such as Date of birth, Place of birth, location, and many details for the same." +
                    "The platform we need for the development of this project is Android Studio IDE with Java||Kotlin||ReactNative Programming and XML. The user would need to register themselves with the app, with all their details that we need for this purpose." +
                    "The users here would register and login. They will be finding suggestions that best matches their requirements. If they like a person, they can send a request. Once the user accepts the request, they’ll be able to contact each other through application."
        )
        itemTitle.add("9. Healthy Diet App")
        itemDescription.add(
            "This project aims at providing a healthy Diet system to people online. We know that an essential part that makes our body is the food that we eat. Food plays a vital role in order to keep us healthy and working. Thus this suggests the diets and intakes while suffering from some illness. Here, the users can ask what to take and when to take, like if they have diarrhea, what they should eat, during nausea, what they should eat." +
                    "To develop this application we need to use Android Studio with Java||Kotlin||ReactNative and XML. To store the data locally, you can use SQLite for this android project. Making this application easier and interactive will help more and more people with this." +
                    "There will be users and nutritionists. The user would be able to register and ask for the doubts and suggestions that they need to ask. The nutritionist would register along with their proper proof of certification. Once registered they’ll be able to respond to the users with whatever the possible way be."
        )
        itemTitle.add("10. Survey Land registration")
        itemDescription.add(
            "This system seeks to facilitate the orderly development of transparent land markets, through registration of real estate rights. This app will help in removing the current impediments to investments in urban areas and also produce property titles in rural areas. This app tries to prevent the selling of agricultural regions and illegal land." +
                    "We can develop this application using Android Studio along with the help of Java||Kotlin||ReactNative and XML. In the backend we can use PHP and SQL. There will be users who need to login to check if the land is agricultural or not. Also, they can find if the land is already registered or is illegally underused." +
                    "The users would need to register themselves and login to get the details of the land in order to check about the land and area. This application will help the agricultural as well as illegal land to be safe."
        )
        itemTitle.add("11. Expense tracker system")
        itemDescription.add(
            "Expense tracking systems are of great help for those who have a limited budget but are bad at keeping it. It can be best for the youngsters, as they do not have any control over how they spend money. This project will help them keep track of where and how much they have spent. Along with that, it will also calculate the total expenses made yet." +
                    "The platform that we need for the development of this project is Android Studio IDE with Java||Kotlin||ReactNative Programming and XML. To store the database locally in the Android device, you can use SQLite. SQLite is specifically made to be useful for Android Application Development." +
                    "The user would need to register themselves with the app, and then they can use it. They can also set the target amount, more than which they do not want to spend; thus this system will help them a lot."
        )
        itemTitle.add("12. Remote Control Robot Car using Android")
        itemDescription.add(
            "This project, Remote Control Robot Car, aims at making a straightforward robot with strong computational platforms. This will help the users to learn and improve their programming skills with this project. We will control this robot car wirelessly using the Android application, " +
                    "The development of this application would require these things- AT89S52, HC Serial Bluetooth, L293D, UARTS, and DC Motor for this. For the development of this application you can use Android Studio with the help of Java||Kotlin||ReactNative and XML for its functioning and user interface. " +
                    "In this application, the users will be able to control the robot using the remote and utilize its functionalities. It will enable the movement of the robot as per the buttons pressed by the users. The implementation of this would be for a developer of Advanced level."
        )
        itemTitle.add("13. File sharing Android Application")
        itemDescription.add(
            "It is an essential application, as it is useful for sharing the files in a secure way. Therefore this is a hybrid solution for file storage cloud. The users can upload their files on the cloud, and the other users would be able to download it. But, it is not as simple as it sounds. As, file uploading will take part with the help of key, and using encryption method. This system will divide the file into two parts. Here, the first part is encrypted using the AES algorithm and the other using the DES algorithm. " +
                    "The platform that we need for the development of this project is Android Studio IDE with Java||Kotlin||ReactNative Programming and XML. To store the database locally in the Android device, you can use SQLite. SQLite is specifically made for Android Application Development. " +
                    "The users would be able to register themselves and create their accounts. So, user 1 will upload with a key, and user 2 will login with his credentials to find the files shared with him. After that, for the user 2 to access, the system will automatically check if the SMS is there with the right encryption. If it finds that, the encrypted file will be decrypted for the user 2 to use it."
        )
        itemTitle.add("14. Public News App")
        itemDescription.add(
            "A public news app is an informative system that helps the users know the news, article, and many other important things going in and around their places. This project will help people stay updated with the latest happening things. In this app, the user would require to register themselves to the application. " +
                    "The development of this application will make use of Android Studio IDE. For the development of this application, its front end, and functionalities we will use XML and Java||Kotlin||ReactNative .For the backend SQL server would be useful for this project. " +
                    "There will be two modules for this that are: the user and the admin. The user here can view the news, and even add the news with images. The admin on, the other hand, would be keeping track of all the uploads by the user to make sure there is nothing wrong or abusive."
        )
        itemTitle.add("15. General Knowledge Chatbot")
        itemDescription.add(
            "This project helps its users to learn and know more and more about general knowledge. This system works on the algorithm that analyzes the queries and understands the user’s message. This system will provide answers to users based on their queries. Once the users enter their question, it will analyze the keywords and respond accordingly. " +
                    "The platform that we need for the development of this project is Android Studio IDE with Java||Kotlin||ReactNative Programming and XML. To store the database locally in the Android device, you can use SQLite. SQLite is specifically made for Android Application Development for Android devices. " +
                    "The module for this project is the User Module. The users need to register themselves and login to this app. The user can ask questions from anywhere, be it sports, history, entertainment, politics, or any other. They can also respond to the results if they like them and report if the result shown is wrong."
        )
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = AndroidAdvancedAdapter(itemTitle, itemDescription)
        return view
    }
}