package dao;

import model.QuestionModel;

import java.sql.*;

public class QuestionDao {

    Connection conn = null;
    Statement stmt = null;

    public QuestionModel getQuestionById(int id) {
        QuestionModel question = null;
        return question;
    }

    public QuestionModel getQuestionByTypeId(int typeId) {
        QuestionModel question = null;
        return question;
    }
}