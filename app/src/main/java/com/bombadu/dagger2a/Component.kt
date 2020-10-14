package com.bombadu.dagger2a

import dagger.Component

@Component
interface MagicBox {
    fun poke(app: MainActivity)
}