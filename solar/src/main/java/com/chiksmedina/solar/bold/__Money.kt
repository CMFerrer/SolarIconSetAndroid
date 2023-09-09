package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.money.Banknote
import com.chiksmedina.solar.bold.money.Banknote2
import com.chiksmedina.solar.bold.money.Bill
import com.chiksmedina.solar.bold.money.BillCheck
import com.chiksmedina.solar.bold.money.BillCross
import com.chiksmedina.solar.bold.money.BillList
import com.chiksmedina.solar.bold.money.Card
import com.chiksmedina.solar.bold.money.Card2
import com.chiksmedina.solar.bold.money.CardRecive
import com.chiksmedina.solar.bold.money.CardSearch
import com.chiksmedina.solar.bold.money.CardSend
import com.chiksmedina.solar.bold.money.CardTransfer
import com.chiksmedina.solar.bold.money.Cardholder
import com.chiksmedina.solar.bold.money.CashOut
import com.chiksmedina.solar.bold.money.Dollar
import com.chiksmedina.solar.bold.money.DollarMinimalistic
import com.chiksmedina.solar.bold.money.Euro
import com.chiksmedina.solar.bold.money.MoneyBag
import com.chiksmedina.solar.bold.money.Ruble
import com.chiksmedina.solar.bold.money.Safe2
import com.chiksmedina.solar.bold.money.SafeCircle
import com.chiksmedina.solar.bold.money.SafeSquare
import com.chiksmedina.solar.bold.money.Sale
import com.chiksmedina.solar.bold.money.SaleSquare
import com.chiksmedina.solar.bold.money.Tag
import com.chiksmedina.solar.bold.money.TagHorizontal
import com.chiksmedina.solar.bold.money.TagPrice
import com.chiksmedina.solar.bold.money.TickerStar
import com.chiksmedina.solar.bold.money.Ticket
import com.chiksmedina.solar.bold.money.TicketSale
import com.chiksmedina.solar.bold.money.VerifiedCheck
import com.chiksmedina.solar.bold.money.WadOfMoney
import com.chiksmedina.solar.bold.money.Wallet
import com.chiksmedina.solar.bold.money.Wallet2
import com.chiksmedina.solar.bold.money.WalletMoney
import kotlin.collections.List as ____KtList

public object MoneyGroup

public val BoldGroup.Money: MoneyGroup
  get() = MoneyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MoneyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Banknote, Banknote2, Bill, BillCheck, BillCross, BillList, Card, Cardholder,
        Card2, CardRecive, CardSearch, CardSend, CardTransfer, CashOut, Dollar, DollarMinimalistic,
        Euro, MoneyBag, Ruble, Safe2, SafeCircle, SafeSquare, Sale, SaleSquare, Tag, TagHorizontal,
        TagPrice, TickerStar, Ticket, TicketSale, VerifiedCheck, WadOfMoney, Wallet, Wallet2,
        WalletMoney)
    return __AllIcons!!
  }
