package com.fer.notekeeper

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses[course.id] = course

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses[course.id] = course

        course = CourseInfo("java_code", "Java Fundamentals: The Core Platform")
        courses[course.id] = course

        course = CourseInfo(title = "Java Fundamentals: The Java Language", id = "java_lang")
        courses[course.id] = course
    }

    private fun initializeNotes(){
        notes.add(NoteInfo(CourseInfo("android_intents", "Android Programming with Intents I"), "this is my note", "note for Intents I"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Android Programming with Intents II"), "this is my note", "note for Intents II"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Android Programming with Intents III"), "this is my note", "note for Intents III"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Android Async Programming and Services I"), "this is my note", "note for Programming and Services I"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Android Async Programming and Services II"), "this is my note", "note for Programming and Services II"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Android Async Programming and Services III"), "this is my note", "note for Programming and Services III"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Java Fundamentals: The Core Platform"), "this is my note", "note for Java Core I"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Java Fundamentals: The Core Platform"), "this is my note", "note for Java Core II"))
        notes.add(NoteInfo(CourseInfo("android_intents", "Java Fundamentals: The Core Platform"), "this is my note", "note for Java Core III"))
    }
}