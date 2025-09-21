package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.money.Banknote
import dev.chiksmedina.solar.broken.money.Banknote2
import dev.chiksmedina.solar.broken.money.Bill
import dev.chiksmedina.solar.broken.money.BillCheck
import dev.chiksmedina.solar.broken.money.BillCross
import dev.chiksmedina.solar.broken.money.BillList
import dev.chiksmedina.solar.broken.money.Card
import dev.chiksmedina.solar.broken.money.Card2
import dev.chiksmedina.solar.broken.money.CardRecive
import dev.chiksmedina.solar.broken.money.CardSearch
import dev.chiksmedina.solar.broken.money.CardSend
import dev.chiksmedina.solar.broken.money.CardTransfer
import dev.chiksmedina.solar.broken.money.Cardholder
import dev.chiksmedina.solar.broken.money.CashOut
import dev.chiksmedina.solar.broken.money.Dollar
import dev.chiksmedina.solar.broken.money.DollarMinimalistic
import dev.chiksmedina.solar.broken.money.Euro
import dev.chiksmedina.solar.broken.money.MoneyBag
import dev.chiksmedina.solar.broken.money.Ruble
import dev.chiksmedina.solar.broken.money.Safe2
import dev.chiksmedina.solar.broken.money.SafeCircle
import dev.chiksmedina.solar.broken.money.SafeSquare
import dev.chiksmedina.solar.broken.money.Sale
import dev.chiksmedina.solar.broken.money.SaleSquare
import dev.chiksmedina.solar.broken.money.Tag
import dev.chiksmedina.solar.broken.money.TagHorizontal
import dev.chiksmedina.solar.broken.money.TagPrice
import dev.chiksmedina.solar.broken.money.TickerStar
import dev.chiksmedina.solar.broken.money.Ticket
import dev.chiksmedina.solar.broken.money.TicketSale
import dev.chiksmedina.solar.broken.money.VerifiedCheck
import dev.chiksmedina.solar.broken.money.WadOfMoney
import dev.chiksmedina.solar.broken.money.Wallet
import dev.chiksmedina.solar.broken.money.Wallet2
import dev.chiksmedina.solar.broken.money.WalletMoney
import kotlin.collections.List as KtList

object MoneyGroup

val BrokenSolar.Money: MoneyGroup
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
