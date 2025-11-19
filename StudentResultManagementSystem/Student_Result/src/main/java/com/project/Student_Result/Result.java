package com.project.Student_Result;

public class Result {

    public static String getResultStatus(int marks) {
        return marks >= 40 ? "PASS" : "FAIL";
    }

}
