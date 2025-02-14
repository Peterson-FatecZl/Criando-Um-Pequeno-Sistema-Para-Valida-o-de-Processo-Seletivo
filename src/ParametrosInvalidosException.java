public class ParametrosInvalidosException extends Exception {

    ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    ParametrosInvalidosException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }
}
