package services;

import dao.QuestionDao;
import model.QuestionModel;

public class QuestionService {

    static QuestionDao questionDao = new QuestionDao();

    public QuestionModel getQuestionById(int id) {
        QuestionModel question = questionDao.getQuestionById(id);
        return question;
    }

    public QuestionModel getQuestionByTypeId(int typeId) {
        QuestionModel question = questionDao.getQuestionByTypeId(typeId);
        return question;
    }

}
