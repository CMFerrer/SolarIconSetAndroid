package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.money.Banknote
import dev.chiksmedina.solar.boldduotone.money.Banknote2
import dev.chiksmedina.solar.boldduotone.money.Bill
import dev.chiksmedina.solar.boldduotone.money.BillCheck
import dev.chiksmedina.solar.boldduotone.money.BillCross
import dev.chiksmedina.solar.boldduotone.money.BillList
import dev.chiksmedina.solar.boldduotone.money.Card
import dev.chiksmedina.solar.boldduotone.money.Card2
import dev.chiksmedina.solar.boldduotone.money.CardRecive
import dev.chiksmedina.solar.boldduotone.money.CardSearch
import dev.chiksmedina.solar.boldduotone.money.CardSend
import dev.chiksmedina.solar.boldduotone.money.CardTransfer
import dev.chiksmedina.solar.boldduotone.money.Cardholder
import dev.chiksmedina.solar.boldduotone.money.CashOut
import dev.chiksmedina.solar.boldduotone.money.Dollar
import dev.chiksmedina.solar.boldduotone.money.DollarMinimalistic
import dev.chiksmedina.solar.boldduotone.money.Euro
import dev.chiksmedina.solar.boldduotone.money.MoneyBag
import dev.chiksmedina.solar.boldduotone.money.Ruble
import dev.chiksmedina.solar.boldduotone.money.Safe2
import dev.chiksmedina.solar.boldduotone.money.SafeCircle
import dev.chiksmedina.solar.boldduotone.money.SafeSquare
import dev.chiksmedina.solar.boldduotone.money.Sale
import dev.chiksmedina.solar.boldduotone.money.SaleSquare
import dev.chiksmedina.solar.boldduotone.money.Tag
import dev.chiksmedina.solar.boldduotone.money.TagHorizontal
import dev.chiksmedina.solar.boldduotone.money.TagPrice
import dev.chiksmedina.solar.boldduotone.money.TickerStar
import dev.chiksmedina.solar.boldduotone.money.Ticket
import dev.chiksmedina.solar.boldduotone.money.TicketSale
import dev.chiksmedina.solar.boldduotone.money.VerifiedCheck
import dev.chiksmedina.solar.boldduotone.money.WadOfMoney
import dev.chiksmedina.solar.boldduotone.money.Wallet
import dev.chiksmedina.solar.boldduotone.money.Wallet2
import dev.chiksmedina.solar.boldduotone.money.WalletMoney
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
