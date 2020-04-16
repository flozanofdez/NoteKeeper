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

    fun addNote(course: CourseInfo, noteTitle: String, noteText: String): Int{
        val note = NoteInfo(course, noteTitle, noteText)
        notes.add(note)
        return notes.lastIndex
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
        notes.add(NoteInfo( CourseInfo("android_intents", "Android Programming with Intents"), "Android Programming with Intents", "note for Android Programming with Intents"))
        notes.add(NoteInfo(CourseInfo("android_async", "Android Async Programming and Services"), "Android Async Programming and Services", "note for Android Async Programming and Services"))
        notes.add(NoteInfo(CourseInfo("java_code", "Java Fundamentals: The Core Platform"), "Java Fundamentals: The Core Platform", "Java Fundamentals: The Core Platform"))
        notes.add(NoteInfo(CourseInfo(title = "Java Fundamentals: The Java Language", id = "java_lang"), "Java Fundamentals: The Java Language", "note for Java Fundamentals: The Java Language"))
    }
}