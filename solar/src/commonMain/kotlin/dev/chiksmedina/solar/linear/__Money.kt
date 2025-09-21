package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.money.Banknote
import dev.chiksmedina.solar.linear.money.Banknote2
import dev.chiksmedina.solar.linear.money.Bill
import dev.chiksmedina.solar.linear.money.BillCheck
import dev.chiksmedina.solar.linear.money.BillCross
import dev.chiksmedina.solar.linear.money.BillList
import dev.chiksmedina.solar.linear.money.Card
import dev.chiksmedina.solar.linear.money.Card2
import dev.chiksmedina.solar.linear.money.CardRecive
import dev.chiksmedina.solar.linear.money.CardSearch
import dev.chiksmedina.solar.linear.money.CardSend
import dev.chiksmedina.solar.linear.money.CardTransfer
import dev.chiksmedina.solar.linear.money.Cardholder
import dev.chiksmedina.solar.linear.money.CashOut
import dev.chiksmedina.solar.linear.money.Dollar
import dev.chiksmedina.solar.linear.money.DollarMinimalistic
import dev.chiksmedina.solar.linear.money.Euro
import dev.chiksmedina.solar.linear.money.MoneyBag
import dev.chiksmedina.solar.linear.money.Ruble
import dev.chiksmedina.solar.linear.money.Safe2
import dev.chiksmedina.solar.linear.money.SafeCircle
import dev.chiksmedina.solar.linear.money.SafeSquare
import dev.chiksmedina.solar.linear.money.Sale
import dev.chiksmedina.solar.linear.money.SaleSquare
import dev.chiksmedina.solar.linear.money.Tag
import dev.chiksmedina.solar.linear.money.TagHorizontal
import dev.chiksmedina.solar.linear.money.TagPrice
import dev.chiksmedina.solar.linear.money.TickerStar
import dev.chiksmedina.solar.linear.money.Ticket
import dev.chiksmedina.solar.linear.money.TicketSale
import dev.chiksmedina.solar.linear.money.VerifiedCheck
import dev.chiksmedina.solar.linear.money.WadOfMoney
import dev.chiksmedina.solar.linear.money.Wallet
import dev.chiksmedina.solar.linear.money.Wallet2
import dev.chiksmedina.solar.linear.money.WalletMoney
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
