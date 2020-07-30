package core.service;

public interface PersonFactory extends BasePersonAction {
    BasePersonAction getPersonAction(String personType);
}
