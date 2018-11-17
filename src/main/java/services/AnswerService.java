package services;

import dao.AnswerDao;
import model.AnswerModel;

public class AnswerService {

    static AnswerDao answerDao = new AnswerDao();

    public AnswerModel getAnswerById(int id) {
        AnswerModel answer = answerDao.getAnswerById(id);
        return answer;
    }

    public AnswerModel getAnswerByQuesId(int quesId) {
        AnswerModel answer = answerDao.getAnswerByQuesId(quesId);
        return answer;
    }

}
