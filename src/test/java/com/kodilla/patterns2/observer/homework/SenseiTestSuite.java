package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SenseiTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Homeworks backEndHomeworks = new BackEndHomeworks();
        Homeworks frontEndHomeworks = new FrontEndHomeworks();

        HomeworkTask januszTask1 = new HomeworkTask(
                "Janusz",Title.COLLECTIONS,"import java.util.ArrayList;",Status.TO_CHECK);
        HomeworkTask januszTask2 = new HomeworkTask(
                "Janusz",Title.STREAM,"package com.kodilla.stream;",Status.TO_CHECK);
        HomeworkTask grazynkaTask1 = new HomeworkTask(
                "Grażynka",Title.JQUERY,"<!DOCTYPE html>",Status.TO_CHECK);
        HomeworkTask grazynkaTask2 = new HomeworkTask(
                "Grażynka",Title.CSS,"text-align: center;",Status.TO_CHECK);
        HomeworkTask slawomirTask1 = new HomeworkTask(
                "Sławomir",Title.PATTERNS,"@SpringBootApplication",Status.TO_CHECK);

        Sensei maciej = new Sensei("Maciej");
        Sensei erwin = new Sensei("Erwin");

        backEndHomeworks.registerObserver1(maciej);
        frontEndHomeworks.registerObserver1(maciej);
        backEndHomeworks.registerObserver1(erwin);

        //When
        backEndHomeworks.addHomeworkTask(januszTask1);
        backEndHomeworks.addHomeworkTask(januszTask2);
        backEndHomeworks.addHomeworkTask(slawomirTask1);
        frontEndHomeworks.addHomeworkTask(grazynkaTask2);
        frontEndHomeworks.addHomeworkTask(grazynkaTask1);

        //Then
        assertEquals(5,maciej.getUpdateCount());
        assertEquals(3,erwin.getUpdateCount());
    }
}