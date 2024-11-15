package com.betrybe.trybevirtualmenu.models

import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.interfaces.Dish

const val PRATO_01 = 65.00
const val PRATO_02 = 45.00
const val PRATO_03 = 85.00
const val PRATO_04 = 90.00
const val PRATO_05 = 20.00
const val PRATO_06 = 10.00

object MenuDatabase {
    private val dishs = listOf(
        Dish(
            "File de Carne com Fritas",
            R.drawable.prato_01,
            """
            Uma suculenta porção de filé de carne grelhado na perfeição,
            servido com deliciosas batatas fritas crocantes. Uma explosão
            de sabor que vai satisfazer seus desejos mais carnívoros.
            """.trimIndent(),
            PRATO_01
        ),
        Dish(
            "Frango Grelhado com Legumes",
            R.drawable.prato_02,
            """
            Uma opção saudável e saborosa: peitos de frango suculentos grelhados à perfeição 
            acompanhados de legumes frescos, preparados para manter a crocância e o sabor. 
            Uma refeição leve e deliciosa para quem busca um toque de frescor.
            """.trimIndent(),
            PRATO_02
        ),
        Dish(
            "Mix de File de Carne e Frango Grelhados",
            R.drawable.prato_03,
            """
            A melhor escolha para os indecisos! Uma combinação harmoniosa 
            de filé de carne suculento e peito de frango grelhado, oferecendo uma 
            explosão de sabores em cada garfada. Acompanhado de opções de molhos que 
            tornam essa escolha ainda mais especial.
            """.trimIndent(),
            PRATO_03
        ),
        Dish(
            "Picanha Grelhada com Macaxeira Frita",
            R.drawable.prato_04,
            """
                Uma refeição de dar água na boca! Picanha de primeira qualidade, 
                grelhada à perfeição e servida com macaxeira frita crocante. 
                Um prato que celebra o melhor da culinária brasileira.
            """.trimIndent(),
            PRATO_04
        ),
        Dish(
            "Porção de Batatas Fritas com Molho",
            R.drawable.prato_05,
            """
                Para os amantes de batatas, esta é a escolha ideal. 
                Nossas batatas fritas são cortadas e preparadas na hora para garantir a 
                crocância perfeita. Acompanhadas de uma variedade de molhos incríveis que 
                vão tornar cada mordida ainda mais especial. Acompanhamento perfeito para 
                qualquer refeição.
            """.trimIndent(),
            PRATO_05
        ),
        Dish(
            "Suco de Laranja",
            R.drawable.bebida_01,
            """
                Um gole de pura refrescância e vitalidade. Nosso suco de laranja é 
                feito com as laranjas mais suculentas e frescas, espremidas na hora 
                para garantir o sabor cítrico e natural que todos adoram. Perfeito para 
                acompanhar suas refeições ou para matar a sede a qualquer hora do dia. 
                Deleite-se com o gosto da natureza em um copo.
            """.trimIndent(),
            PRATO_06
        )
    )

    fun getMenu() = dishs

    fun getByIndex(i: Int) = dishs[i]
}