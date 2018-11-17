package dao;

import model.AnswerModel;

import java.sql.Connection;
import java.sql.Statement;

public class AnswerDao {

    Connection conn = null;
    Statement stmt = null;

    public AnswerModel getAnswerById(int id) {
        AnswerModel answer = null;
        return answer;
    }

    public AnswerModel getAnswerByQuesId(int quesId) {
        AnswerModel answer = null;
        return answer;
    }
}