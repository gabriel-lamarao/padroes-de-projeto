package structural.adapter;

import org.apache.commons.validator.routines.EmailValidator;

public class EmailValidatorAdaptee implements EmailValidatorAdapter {

    @Override
    public boolean validEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }

}
