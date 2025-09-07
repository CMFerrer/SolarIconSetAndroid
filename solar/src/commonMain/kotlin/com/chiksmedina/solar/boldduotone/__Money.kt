package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.money.Banknote
import com.chiksmedina.solar.boldduotone.money.Banknote2
import com.chiksmedina.solar.boldduotone.money.Bill
import com.chiksmedina.solar.boldduotone.money.BillCheck
import com.chiksmedina.solar.boldduotone.money.BillCross
import com.chiksmedina.solar.boldduotone.money.BillList
import com.chiksmedina.solar.boldduotone.money.Card
import com.chiksmedina.solar.boldduotone.money.Card2
import com.chiksmedina.solar.boldduotone.money.CardRecive
import com.chiksmedina.solar.boldduotone.money.CardSearch
import com.chiksmedina.solar.boldduotone.money.CardSend
import com.chiksmedina.solar.boldduotone.money.CardTransfer
import com.chiksmedina.solar.boldduotone.money.Cardholder
import com.chiksmedina.solar.boldduotone.money.CashOut
import com.chiksmedina.solar.boldduotone.money.Dollar
import com.chiksmedina.solar.boldduotone.money.DollarMinimalistic
import com.chiksmedina.solar.boldduotone.money.Euro
import com.chiksmedina.solar.boldduotone.money.MoneyBag
import com.chiksmedina.solar.boldduotone.money.Ruble
import com.chiksmedina.solar.boldduotone.money.Safe2
import com.chiksmedina.solar.boldduotone.money.SafeCircle
import com.chiksmedina.solar.boldduotone.money.SafeSquare
import com.chiksmedina.solar.boldduotone.money.Sale
import com.chiksmedina.solar.boldduotone.money.SaleSquare
import com.chiksmedina.solar.boldduotone.money.Tag
import com.chiksmedina.solar.boldduotone.money.TagHorizontal
import com.chiksmedina.solar.boldduotone.money.TagPrice
import com.chiksmedina.solar.boldduotone.money.TickerStar
import com.chiksmedina.solar.boldduotone.money.Ticket
import com.chiksmedina.solar.boldduotone.money.TicketSale
import com.chiksmedina.solar.boldduotone.money.VerifiedCheck
import com.chiksmedina.solar.boldduotone.money.WadOfMoney
import com.chiksmedina.solar.boldduotone.money.Wallet
import com.chiksmedina.solar.boldduotone.money.Wallet2
import com.chiksmedina.solar.boldduotone.money.WalletMoney
import kotlin.collections.List as KtList

object MoneyGroup

val BoldDuotoneSolar.Money: MoneyGroup
    get() = MoneyGroup

private var _AllIcons: KtList<ImageVector>? = null

val MoneyGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Banknote,
            Banknote2,
            Bill,
            BillCheck,
            BillCross,
            BillList,
            Card,
            Cardholder,
            Card2,
            CardRecive,
            CardSearch,
            CardSend,
            CardTransfer,
            CashOut,
            Dollar,
            DollarMinimalistic,
            Euro,
            MoneyBag,
            Ruble,
            Safe2,
            SafeCircle,
            SafeSquare,
            Sale,
            SaleSquare,
            Tag,
            TagHorizontal,
            TagPrice,
            TickerStar,
            Ticket,
            TicketSale,
            VerifiedCheck,
            WadOfMoney,
            Wallet,
            Wallet2,
            WalletMoney
        )
        return _AllIcons!!
    }
