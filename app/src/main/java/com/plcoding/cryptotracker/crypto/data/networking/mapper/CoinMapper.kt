package com.plcoding.cryptotracker.crypto.data.networking.mapper

import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinDto
import com.plcoding.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id, rank, name, symbol, marketCapUsd, priceUsd, changePercent24Hr
    )
}