package vn.edu.likelion.Day11.entity;

import java.util.List;

/**
 * CourseOnline -
 *
 * @param
 * @return
 * @throws
 */
public class CourseOnline extends Course {
    private String nentang;
    private int thoiluong;

    public CourseOnline() {
        super();
        this.nentang = "";
        this.thoiluong = 0;
    }

    public CourseOnline(int courseId, String courseName, String mentorName, int credit, String nentang, int thoiluong) {
        super(courseId, courseName, mentorName, credit);
        this.nentang = nentang;
        this.thoiluong = thoiluong;
    }

    public String getNentang() {
        return nentang;
    }

    public void setNentang(String nentang) {
        this.nentang = nentang;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }
}
