
        }
    }

    public static void dropCourse(String courseName) {
        if (courses.contains(courseName)) {
            courses.remove(courseName);
            enrollments.remove(courseName);
            System.out.println("Course dropped successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    public static void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {