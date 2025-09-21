package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.money.Banknote
import dev.chiksmedina.solar.outline.money.Banknote2
import dev.chiksmedina.solar.outline.money.Bill
import dev.chiksmedina.solar.outline.money.BillCheck
import dev.chiksmedina.solar.outline.money.BillCross
import dev.chiksmedina.solar.outline.money.BillList
import dev.chiksmedina.solar.outline.money.Card
import dev.chiksmedina.solar.outline.money.Card2
import dev.chiksmedina.solar.outline.money.CardRecive
import dev.chiksmedina.solar.outline.money.CardSearch
import dev.chiksmedina.solar.outline.money.CardSend
import dev.chiksmedina.solar.outline.money.CardTransfer
import dev.chiksmedina.solar.outline.money.Cardholder
import dev.chiksmedina.solar.outline.money.CashOut
import dev.chiksmedina.solar.outline.money.Dollar
import dev.chiksmedina.solar.outline.money.DollarMinimalistic
import dev.chiksmedina.solar.outline.money.Euro
import dev.chiksmedina.solar.outline.money.MoneyBag
import dev.chiksmedina.solar.outline.money.Ruble
import dev.chiksmedina.solar.outline.money.Safe2
import dev.chiksmedina.solar.outline.money.SafeCircle
import dev.chiksmedina.solar.outline.money.SafeSquare
import dev.chiksmedina.solar.outline.money.Sale
import dev.chiksmedina.solar.outline.money.SaleSquare
import dev.chiksmedina.solar.outline.money.Tag
import dev.chiksmedina.solar.outline.money.TagHorizontal
import dev.chiksmedina.solar.outline.money.TagPrice
import dev.chiksmedina.solar.outline.money.TickerStar
import dev.chiksmedina.solar.outline.money.Ticket
import dev.chiksmedina.solar.outline.money.TicketSale
import dev.chiksmedina.solar.outline.money.VerifiedCheck
import dev.chiksmedina.solar.outline.money.WadOfMoney
import dev.chiksmedina.solar.outline.money.Wallet
import dev.chiksmedina.solar.outline.money.Wallet2
import dev.chiksmedina.solar.outline.money.WalletMoney
import kotlin.collections.List as KtList

object MoneyGroup

val OutlineSolar.Money: MoneyGroup
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
