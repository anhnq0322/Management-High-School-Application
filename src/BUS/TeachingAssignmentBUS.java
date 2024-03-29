/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.TeachingAssignmentDAO;
import DTO.TeachingAssignment;
import GUI.AlertWarning;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author quoca
 */
public class TeachingAssignmentBUS {
    private final TeachingAssignmentDAO teachingAssignmentDAO = new TeachingAssignmentDAO();

    public ArrayList<TeachingAssignment> getAllTeachingAssignments() throws SQLException {
        return teachingAssignmentDAO.getAllTeachingAssignments();
    }

    public TeachingAssignment getTeachingAssignmentByID(String Id) {
        ArrayList<TeachingAssignment> teachingAssignmentsList = teachingAssignmentDAO.getAllTeachingAssignments();
        for(TeachingAssignment teachingAssignment : teachingAssignmentsList) {
            if(teachingAssignment.getId().equals(Id)) {
                return teachingAssignment;
            }
        }
        return null;
    }

    public boolean addTeachingAssignment(TeachingAssignment teachingAssignment) throws SQLException {
        boolean isExist = teachingAssignmentDAO.checkTeachingAssignmentExistById(teachingAssignment.getId());
        if (!isExist) {
            boolean isSuccess = teachingAssignmentDAO.addTeachingAssignment(teachingAssignment);
            if (isSuccess) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String editTeachingAssignment(TeachingAssignment teachingAssignment) throws SQLException {
            boolean isExist = teachingAssignmentDAO.checkTeachingAssignmentExistById(teachingAssignment.getId());
            if (isExist) {
                boolean isSuccess = teachingAssignmentDAO.editTeachingAssignment(teachingAssignment);
                if (isSuccess) {
                    new AlertWarning("Cập nhật " + teachingAssignment.getId()+ " thành công!").setVisible(true);
                    return "Delete thanh cong";
                } else {
                    new AlertWarning("Cập nhật " + teachingAssignment.getId()+ "không thành công!").setVisible(true);
                    return "Delete khong thanh cong";
                }
            } else {
                    new AlertWarning("id = " + teachingAssignment.getId()+ " đã không được tìm thấy").setVisible(true);
                    return "khong tim thay";
            }
    }   

    public String deleteTeachingAssignmentByID(String id) throws SQLException {
            boolean isExist = teachingAssignmentDAO.checkTeachingAssignmentExistById(id);
            if (isExist) {
                    boolean isDeleted = teachingAssignmentDAO.deleteTeachingAssignmentByID(id);
                    if (isDeleted) {
                            new AlertWarning("Đã xóa " + id + " thành công!").setVisible(true);
                            return "Delete thanh cong";
                    } else {
                            new AlertWarning("Xóa " + id + "không thành công!").setVisible(true);
                            return "Delete khong thanh cong";
                    }
            } else {
                    new AlertWarning("id = " + id + " đã không được tìm thấy").setVisible(true);
                    return "khong tim thay";
            }
    }

    
}
