class Obra implements Cloneable {
    public Object clone() throws CloneNotSupportedException {  
        return super.clone();  
    }  
}

class ControleAcervo {
    public List<Obra> carregarCacheObra() {
        //Aqui ele usaria alguma instancia global, framework ou algo do genero para carregar as
        //instancias de Obra que precisam ser clonadas ou copiadas (nesse caso clonadas), ou seja, 
        //usar o design pattern prototype para realizar esse processo
    }
}