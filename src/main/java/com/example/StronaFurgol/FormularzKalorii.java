package com.example.StronaFurgol;

public class FormularzKalorii {
        private String gender;
        private int age;
        private double weight;
        private int height;
        private int activity_level;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getActivityLevel() {
        return activity_level;
    }

    public void setActivityLevel(int activity_level) {
        this.activity_level = activity_level;
    }

    public double calculateCalories()  {
        double base_const = 1, weight_const = 1, height_const = 1, age_const = 1, activity_const = 1;
        if(gender.equals("male")) {
            base_const = 66.47;
            weight_const = 13.75;
            height_const = 5;
            age_const = 6.75;
        }
        else if(gender.equals("female")) {
            base_const = 665.1;
            weight_const = 9.56;
            height_const = 1.85;
            age_const = 4.67;
        }

        switch(activity_level) {
            case 1: activity_const = 1.2; break;
            case 2: activity_const = 1.4; break;
            case 3: activity_const = 1.6; break;
            case 4: activity_const = 1.8; break;
        }

        return (base_const + (weight_const * weight) + (height_const * height) + (age_const * age)) * activity_const;
    }
}
