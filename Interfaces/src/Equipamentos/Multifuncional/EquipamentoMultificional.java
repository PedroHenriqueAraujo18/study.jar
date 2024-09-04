package Equipamentos.Multifuncional;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;

public class EquipamentoMultificional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar(){
            System.out.print("Copias - MULTIFUNCIONAL");
        }

    @Override
    public void imprimir() {
        System.out.print("Imprimir - MULTIFUNCIONAL");
    }

    @Override
    public void Digitalizar() {
        System.out.print("Digitalizar - MULTIFUNCIONAL");
    }
}
