package com.task.one.hibernate.entegration.command;

import java.util.HashMap;

public interface ICommand {

    void execute(HashMap<String,Object> parameterMap) throws Exception;
}
