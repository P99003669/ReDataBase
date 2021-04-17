package com.example.py7.crudkotlin

class Student {

    var sid: Int? = null
    var sname: String? = null
    var collegename: String? = null
    var rollnumber: String? = null

    constructor(id: Int, name: String, college: String, rollno:String){
        this.sid = id
        this.sname = name
        this.collegename = college
        this.rollnumber = rollno
    }
}