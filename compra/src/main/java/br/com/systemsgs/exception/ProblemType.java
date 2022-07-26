package br.com.systemsgs.exception;

import lombok.Getter;

@Getter
public enum ProblemType {

    DADOS_INVALIDOS("/dados-invalidos", "Dados Inválidos"),
    ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de Sistema"),
    PARAMETRO_INVALIDO("/parametro-invalido", "Parametro Inválido"),
    MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel", "Mensagem Incompreensivel"),
    RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não Encontrado"),
    ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
    ERRO_NEGOCIO("/erro-negocio", "Erro regra de Negócio");

    private String title;
    private String uri;

    ProblemType(String path, String title){
        this.uri = "http://localhost:8080" + path;
        this.title = title;
    }

}
