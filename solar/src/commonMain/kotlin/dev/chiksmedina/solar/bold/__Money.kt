package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.money.Banknote
import dev.chiksmedina.solar.bold.money.Banknote2
import dev.chiksmedina.solar.bold.money.Bill
import dev.chiksmedina.solar.bold.money.BillCheck
import dev.chiksmedina.solar.bold.money.BillCross
import dev.chiksmedina.solar.bold.money.BillList
import dev.chiksmedina.solar.bold.money.Card
import dev.chiksmedina.solar.bold.money.Card2
import dev.chiksmedina.solar.bold.money.CardRecive
import dev.chiksmedina.solar.bold.money.CardSearch
import dev.chiksmedina.solar.bold.money.CardSend
import dev.chiksmedina.solar.bold.money.CardTransfer
import dev.chiksmedina.solar.bold.money.Cardholder
import dev.chiksmedina.solar.bold.money.CashOut
import dev.chiksmedina.solar.bold.money.Dollar
import dev.chiksmedina.solar.bold.money.DollarMinimalistic
import dev.chiksmedina.solar.bold.money.Euro
import dev.chiksmedina.solar.bold.money.MoneyBag
import dev.chiksmedina.solar.bold.money.Ruble
import dev.chiksmedina.solar.bold.money.Safe2
import dev.chiksmedina.solar.bold.money.SafeCircle
import dev.chiksmedina.solar.bold.money.SafeSquare
import dev.chiksmedina.solar.bold.money.Sale
import dev.chiksmedina.solar.bold.money.SaleSquare
import dev.chiksmedina.solar.bold.money.Tag
import dev.chiksmedina.solar.bold.money.TagHorizontal
import dev.chiksmedina.solar.bold.money.TagPrice
import dev.chiksmedina.solar.bold.money.TickerStar
import dev.chiksmedina.solar.bold.money.Ticket
import dev.chiksmedina.solar.bold.money.TicketSale
import dev.chiksmedina.solar.bold.money.VerifiedCheck
import dev.chiksmedina.solar.bold.money.WadOfMoney
import dev.chiksmedina.solar.bold.money.Wallet
import dev.chiksmedina.solar.bold.money.Wallet2
import dev.chiksmedina.solar.bold.money.WalletMoney
import kotlin.collections.List as KtList

object MoneyGroup

val BoldSolar.Money: MoneyGroup
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
