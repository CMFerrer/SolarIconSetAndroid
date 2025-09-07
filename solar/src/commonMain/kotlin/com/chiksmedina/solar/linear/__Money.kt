package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.money.Banknote
import com.chiksmedina.solar.linear.money.Banknote2
import com.chiksmedina.solar.linear.money.Bill
import com.chiksmedina.solar.linear.money.BillCheck
import com.chiksmedina.solar.linear.money.BillCross
import com.chiksmedina.solar.linear.money.BillList
import com.chiksmedina.solar.linear.money.Card
import com.chiksmedina.solar.linear.money.Card2
import com.chiksmedina.solar.linear.money.CardRecive
import com.chiksmedina.solar.linear.money.CardSearch
import com.chiksmedina.solar.linear.money.CardSend
import com.chiksmedina.solar.linear.money.CardTransfer
import com.chiksmedina.solar.linear.money.Cardholder
import com.chiksmedina.solar.linear.money.CashOut
import com.chiksmedina.solar.linear.money.Dollar
import com.chiksmedina.solar.linear.money.DollarMinimalistic
import com.chiksmedina.solar.linear.money.Euro
import com.chiksmedina.solar.linear.money.MoneyBag
import com.chiksmedina.solar.linear.money.Ruble
import com.chiksmedina.solar.linear.money.Safe2
import com.chiksmedina.solar.linear.money.SafeCircle
import com.chiksmedina.solar.linear.money.SafeSquare
import com.chiksmedina.solar.linear.money.Sale
import com.chiksmedina.solar.linear.money.SaleSquare
import com.chiksmedina.solar.linear.money.Tag
import com.chiksmedina.solar.linear.money.TagHorizontal
import com.chiksmedina.solar.linear.money.TagPrice
import com.chiksmedina.solar.linear.money.TickerStar
import com.chiksmedina.solar.linear.money.Ticket
import com.chiksmedina.solar.linear.money.TicketSale
import com.chiksmedina.solar.linear.money.VerifiedCheck
import com.chiksmedina.solar.linear.money.WadOfMoney
import com.chiksmedina.solar.linear.money.Wallet
import com.chiksmedina.solar.linear.money.Wallet2
import com.chiksmedina.solar.linear.money.WalletMoney
import kotlin.collections.List as KtList

object MoneyGroup

val LinearSolar.Money: MoneyGroup
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
