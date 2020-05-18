package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * HackerLand University has the following grading policy:
 *
 * Every student receives a  in the inclusive range from  to .
 * Any  less than  is a failing grade.
 * Sam is a professor at the university and likes to round each student's  according to these rules:
 *
 * If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
 * If the value of  is less than , no rounding occurs as the result will still be a failing grade.
 * For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .
 *
 * Given the initial value of  for each of Sam's  students, write code to automate the rounding process.
 *
 * Function Description
 *
 * Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.
 *
 * gradingStudents has the following parameter(s):
 *
 * grades: an array of integers representing grades before rounding
 * Input Format
 *
 * The first line contains a single integer, , the number of students.
 * Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.
 *
 * Constraints
 *
 * Output Format
 *
 * For each , print the rounded grade on a new line.
 * Sample Input 0
 *
 * 4
 * 73
 * 67
 * 38
 * 33
 * Sample Output 0
 *
 * 75
 * 67
 * 40
 * 33
 */

public class StudentGradeIdentification {

    public static void main(String[] args) throws IOException {

        Scanner inputStr = new Scanner(System.in);

        int gradesCount = Integer.parseInt(inputStr.next().trim());

        String[] grades = inputStr.next().split(",");

        List<Integer> result = gradingStudents(grades);
        List<Integer> temp = new ArrayList<>();
        for (String str: grades) {
            temp.add(Integer.parseInt(str));
        }


        List<Integer> result1 = gradingStudents1(temp);
        System.out.println(result);
        System.out.println(result1);
    }

    private static List<Integer> gradingStudents1(List<Integer> collect) {
        List<Integer> finalList = new ArrayList<>();
        for (Integer grade : collect) {
            if (grade >= 38) {
                for (Integer roundOffGrade : IntStream.range(grade, 101).boxed().collect(Collectors.toList())) {
                    if (roundOffGrade % 3 < 3 && roundOffGrade % 5 == 0) {
                        if (roundOffGrade - grade < 3) {
                            finalList.add(roundOffGrade);
                            break;
                        }
                        else {
                            finalList.add(grade);
                            break;
                        }

                    }
                }
            }
            else {
                finalList.add(grade);
            }
        }
        return finalList;
    }

    private static List<Integer> gradingStudents(String[] grades) {

        List<Integer> finalList = new ArrayList<>();
        for (int i = 0 ; i < grades.length ; i++) {
            Integer grade = Integer.parseInt(grades[i]);
            if (grade >= 38) {
                for (Integer roundOffGrade : IntStream.range(grade, 101).boxed().collect(Collectors.toList())) {
                    if (roundOffGrade % 3 < 3 && roundOffGrade % 5 == 0) {
                        if (roundOffGrade - grade < 3) {
                            finalList.add(roundOffGrade);
                            break;
                        }
                        else {
                            finalList.add(grade);
                            break;
                        }

                    }
                }
            }
            else {
                finalList.add(grade);
            }
        }
        return finalList;
    }

}
