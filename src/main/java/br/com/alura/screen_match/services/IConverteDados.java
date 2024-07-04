package br.com.alura.screen_match.services;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);
}
