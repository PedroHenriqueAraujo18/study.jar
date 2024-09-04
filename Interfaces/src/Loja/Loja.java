package Loja;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;
import Equipamentos.Multifuncional.EquipamentoMultificional;

public class Loja {
    public static void main(String[] args) {
    EquipamentoMultificional e = new EquipamentoMultificional();
    Impressora imp =e;
    Copiadora cop = e;
    Digitalizadora dg = e;
    imp.imprimir();
    dg.Digitalizar();
    cop.copiar();


    }
}
