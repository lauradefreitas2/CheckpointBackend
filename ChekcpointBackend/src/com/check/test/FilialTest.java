package com.check.test;

import com.check.config.ConfiguracaoJDBC;
import com.check.dao.impl.FilialDao;
import com.check.model.Filial;
import com.check.service.FilialService;
import org.junit.Test;

public class FilialTest {

    public FilialService filialService = new FilialService(new FilialDao(new ConfiguracaoJDBC()));

    @Test
    void salvarFiliais () throws Exception {
        Filial filial1 = new Filial(1, "a", "rua a", "13A", "SA", "BA", "true");
        filialService.salvar(filial1);
        Filial filial2 = new Filial(2, "B", "rua b", "13B", "SA", "BA", "false");
        filialService.salvar(filial2);
    }


}