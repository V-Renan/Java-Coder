import br.com.victor.app.Calculadora;
import br.com.victor.app.calculo.CalculadoraImpl;

module app.calculo {

    requires transitive app.logging;
    exports br.com.victor.app.calculo;

//    exports br.com.victor.app.calculo.interno
//            to app.financeiro; // basta separar por (,) parar adicionar mais exports

    opens br.com.victor.app.calculo
            to app.financeiro;

    requires app.api;
    provides br.com.victor.app.Calculadora
            with CalculadoraImpl;
}