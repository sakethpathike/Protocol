package com.pixelbuilds.protocol.projects.androidProjects

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageButton
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pixelbuilds.protocol.R

class AndroidBeginnerProjects : Fragment() {
    private var itemTitles = mutableListOf<String>()
    private var itemDescription = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_android_beginner_projects, container, false)
        val toProgrammingLanguages =
            view.findViewById<AppCompatImageButton>(R.id.programmingLanguage_knowmore)
        toProgrammingLanguages.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_androiddevelopment)
        }
        val toAndroidStudio = view.findViewById<AppCompatImageButton>(R.id.androidStudio_knowmore)
        toAndroidStudio.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_androidStudioFragment)
        }
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        itemTitles.add("1. Fake Caller Application")
        itemDescription.add(
            "This application will be used to make a fake call to the device. This application is generally essential for emergency situations. This can be good for situations where the users are alone and in danger. This app will help them pretend like they’re on call and walk out of the path." +
                    "To develop this application, Android Studio is required. For programming, Java||Kotlin||ReactNative and XML will be required in Android Studio. For fake calling, you need to get access to the CallManager package in Your Respective Selected Language." +
                    "The user would need to make an account and set the caller name in the application. After this, they can use this Fake calling app without any issue."
        )
        itemTitles.add("2. College Students Communication App")
        itemDescription.add(
            "This application will enable college students to communicate with each other on a single platform. It will give them the facility to chat, and share important notice through it. There will be a login page for the users and a code to join the same group." +
                    "The development of this application can be done using Android Studio, Java||Kotlin||ReactNative, and XML." +
                    "This app is specifically targeting a group of people and not anyone to one chat. The users would be provided with a login/signup page. Once they register on the app, they’ll be ready to enter the chat room with a code. After they enter the chat room, they can communicate and share the data."
        )
        itemTitles.add("3. Timetable Manager")
        itemDescription.add(
            "This project is specially developed to help people manage their routines properly. This will let users make a timely routine of each day so they can follow it. This will be more useful for the students or the college-going youth." +
                    "This system uses Android Studio for its front end development and functioning. This app doesn’t need a backend as this type of applications use the data from the phone itself and projects that to the user. The data will be stored locally in the device using SQLite." +
                    "The users would need to register themselves using credentials and then log in to the app. Once done, they will be able to use it and enter their tasks and time table in a timely manner."
        )
        itemTitles.add("4. Food for Train App")
        itemDescription.add(
            "This is a nice project idea for beginners. This application is to enable the delivery of food to the passengers of trains who travel long distances. This application will ensure the passengers have a pleasant journey as they’ll be able to order food through the application." +
                    "This application will be based on the Location services of Android. It’ll also have live tracking of the passengers. You can build it on Android Studio using Java||Kotlin||ReactNative and XML. It’ll completely operate on the internet." +
                    "There will be three modules that are the restaurants, passengers, and the delivery person. All three need to login on the app through their credentials. The user will place an order from the restaurant through this app. And the nearest delivery person available would be assigned the job to deliver the food pack."
        )
        itemTitles.add("5. Parental Control Application")
        itemDescription.add(
            "Online Parental Control Application is an application aimed at helping parents to have control over their children. It’ll help them keep track of their kids’ health and their study. This system will have modules Admin, Parent, and Children. The range of children varies in groups like for 1-4, 5-7, 8-11, and teenage." +
                    "Then there would be proper events and event reminders that will help the growth of children. There will be all the things regarding kids’ diets and their exercises. Plus, the app will give them schedules and tracking details." +
                    "To develop this application we will need Android Studio, Java||Kotlin||ReactNative, and XML. The user would need to enter the credentials and login. They’d need to enter the details of their children like their name, age, date of birth , so that the application generates a report and a tracking system accordingly."
        )
        itemTitles.add("6. Color guessing game")
        itemDescription.add(
            "This is a simple project for college students that is aimed at teaching kids the colors in an interactive manner. It will show colors in the form of shapes and drawings to make it interactive learning. First, it will show the colors and their names. After that, it will ask kids what color is shown. If they answer correctly, it will play sounds of claps making kids happy." +
                    "To build this application you would need to make use of Android Studio as a platform for app development. Also, you need to write the code using Java||Kotlin||ReactNative. And for the interactive user interface, you can use XML." +
                    "The users would be mainly the kids; thus this application will be built as simple and interactive as it can. There would be a no. of options provided to them from which they will choose one."
        )
        itemTitles.add("7. Teaching with fun for toddlers")
        itemDescription.add(
            "This is the application developed to teach children counting, alphabets, and other very basic but essential things in an interactive manner. It will have the lessons section wise to help parents teach their kids anywhere. This will help kids to learn with fun while playing itself." +
                    "The requirement for this application is Android Studio, Java||Kotlin||ReactNative, XML for the application. Permission for location and internet from the device. For local databases, SQLite will be used for our Android Application." +
                    "The users would need to register themselves in the app and choose their kid’s age range. This will help fetch the lessons age-wise and in an effective way. This application can be beneficial to teach kids while they’re growing."
        )
        itemTitles.add("8. Seed testing using image processing")
        itemDescription.add(
            "This is an interesting android project for beginners. This application will help the farmers to detect if the seeds they are using have not defected. This application will detect the type of seeds and give every information about it to the users. Plus, it will show how they can check if the seed is not defective. This app itself will test the seed using Image processing." +
                    "To develop this application the Android Studio is required. For the coding, it will need Java||Kotlin||ReactNative and XML. The image processing will be done using some specific AI algorithm." +
                    "The farmer is supposed to login, and their data will be stored. They simply need to take a picture of the seed through the app, and it will show the result. The recent search history would be stored in the database using SQLite.,"
        )
        itemTitles.add("9. Unit Converter Application")
        itemDescription.add(
            "This application will aim at helping its users by converting the units from one another. This app will take input from the user and convert it to the desired unit and give the result. For example, it will be able to convert a value in centimeters to Meters or grams to kilograms and vice versa." +
                    "To develop this application, Android Studio is required. The knowledge of XML would be required for the user interface and the Java||Kotlin||ReactNative programming for the application’s conversion functionality." +
                    "The user would need to install this application, and they can use it immediately. They just need to enter the value and choose a unit. After that, they would simply choose the unit in which it is to be converted. This app will give them the result value."
        )
        itemTitles.add("10. Tuition notes of the student app")
        itemDescription.add(
            "This project is based on the tracking of students who go to tuition's. This app will have three modules that are the student, the tutor, and the parents. This app will contain all the details of the student, like when they had gone for classes and when they didn’t. Also, the tutors will give them remarks on a daily basis." +
                    "This application needs to be built using Android Studio And Use Java||Kotlin||ReactNative For Logic. The interface can be designed using JSON or XML." +
                    "The tutor will make the account of the student and their parents and will handle the things. All the users are then supposed to login using the credentials. This app will make sure that the parents are also keeping track of their children. Along with that, they can also be in constant touch with the tutors."
        )
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = AndroidBeginnerProjectsRecylerView(itemTitles, itemDescription)
        return view
    }
}