package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.money.Banknote
import dev.chiksmedina.solar.lineduotone.money.Banknote2
import dev.chiksmedina.solar.lineduotone.money.Bill
import dev.chiksmedina.solar.lineduotone.money.BillCheck
import dev.chiksmedina.solar.lineduotone.money.BillCross
import dev.chiksmedina.solar.lineduotone.money.BillList
import dev.chiksmedina.solar.lineduotone.money.Card
import dev.chiksmedina.solar.lineduotone.money.Card2
import dev.chiksmedina.solar.lineduotone.money.CardRecive
import dev.chiksmedina.solar.lineduotone.money.CardSearch
import dev.chiksmedina.solar.lineduotone.money.CardSend
import dev.chiksmedina.solar.lineduotone.money.CardTransfer
import dev.chiksmedina.solar.lineduotone.money.Cardholder
import dev.chiksmedina.solar.lineduotone.money.CashOut
import dev.chiksmedina.solar.lineduotone.money.Dollar
import dev.chiksmedina.solar.lineduotone.money.DollarMinimalistic
import dev.chiksmedina.solar.lineduotone.money.Euro
import dev.chiksmedina.solar.lineduotone.money.MoneyBag
import dev.chiksmedina.solar.lineduotone.money.Ruble
import dev.chiksmedina.solar.lineduotone.money.Safe2
import dev.chiksmedina.solar.lineduotone.money.SafeCircle
import dev.chiksmedina.solar.lineduotone.money.SafeSquare
import dev.chiksmedina.solar.lineduotone.money.Sale
import dev.chiksmedina.solar.lineduotone.money.SaleSquare
import dev.chiksmedina.solar.lineduotone.money.Tag
import dev.chiksmedina.solar.lineduotone.money.TagHorizontal
import dev.chiksmedina.solar.lineduotone.money.TagPrice
import dev.chiksmedina.solar.lineduotone.money.TickerStar
import dev.chiksmedina.solar.lineduotone.money.Ticket
import dev.chiksmedina.solar.lineduotone.money.TicketSale
import dev.chiksmedina.solar.lineduotone.money.VerifiedCheck
import dev.chiksmedina.solar.lineduotone.money.WadOfMoney
import dev.chiksmedina.solar.lineduotone.money.Wallet
import dev.chiksmedina.solar.lineduotone.money.Wallet2
import dev.chiksmedina.solar.lineduotone.money.WalletMoney
import kotlin.collections.List as KtList

object MoneyGroup

val LineDuotoneSolar.Money: MoneyGroup
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
