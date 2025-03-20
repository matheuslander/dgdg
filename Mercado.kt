class Mercado(
    val nome: String = "Mercado Padrão",
    val endereco: String = "Endereço Padrão",
    val tipo: String = "Geral",
    var estoque: Int = 0
) {
    fun venderProduto(quantidade: Int) {
        if (estoque >= quantidade) {
            estoque -= quantidade
            println("Venda realizada! Estoque restante: $estoque")
        } else {
            println("Estoque insuficiente!")
        }
    }
}
