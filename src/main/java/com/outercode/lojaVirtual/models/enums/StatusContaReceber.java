package com.outercode.lojaVirtual.models.enums;

public enum StatusContaReceber {

    COBRANCA("Cobrança"),
    VENCIDA("Vencida"),
    QUITADA("Quitada"),
    ABERTA("Aberta");

    private String descricao;

    StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
