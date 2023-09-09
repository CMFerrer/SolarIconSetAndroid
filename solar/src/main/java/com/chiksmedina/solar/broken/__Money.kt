package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.money.Banknote
import com.chiksmedina.solar.broken.money.Banknote2
import com.chiksmedina.solar.broken.money.Bill
import com.chiksmedina.solar.broken.money.BillCheck
import com.chiksmedina.solar.broken.money.BillCross
import com.chiksmedina.solar.broken.money.BillList
import com.chiksmedina.solar.broken.money.Card
import com.chiksmedina.solar.broken.money.Card2
import com.chiksmedina.solar.broken.money.CardRecive
import com.chiksmedina.solar.broken.money.CardSearch
import com.chiksmedina.solar.broken.money.CardSend
import com.chiksmedina.solar.broken.money.CardTransfer
import com.chiksmedina.solar.broken.money.Cardholder
import com.chiksmedina.solar.broken.money.CashOut
import com.chiksmedina.solar.broken.money.Dollar
import com.chiksmedina.solar.broken.money.DollarMinimalistic
import com.chiksmedina.solar.broken.money.Euro
import com.chiksmedina.solar.broken.money.MoneyBag
import com.chiksmedina.solar.broken.money.Ruble
import com.chiksmedina.solar.broken.money.Safe2
import com.chiksmedina.solar.broken.money.SafeCircle
import com.chiksmedina.solar.broken.money.SafeSquare
import com.chiksmedina.solar.broken.money.Sale
import com.chiksmedina.solar.broken.money.SaleSquare
import com.chiksmedina.solar.broken.money.Tag
import com.chiksmedina.solar.broken.money.TagHorizontal
import com.chiksmedina.solar.broken.money.TagPrice
import com.chiksmedina.solar.broken.money.TickerStar
import com.chiksmedina.solar.broken.money.Ticket
import com.chiksmedina.solar.broken.money.TicketSale
import com.chiksmedina.solar.broken.money.VerifiedCheck
import com.chiksmedina.solar.broken.money.WadOfMoney
import com.chiksmedina.solar.broken.money.Wallet
import com.chiksmedina.solar.broken.money.Wallet2
import com.chiksmedina.solar.broken.money.WalletMoney
import kotlin.collections.List as ____KtList

public object MoneyGroup

public val BrokenGroup.Money: MoneyGroup
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
