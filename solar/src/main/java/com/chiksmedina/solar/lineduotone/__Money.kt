package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.money.Banknote
import com.chiksmedina.solar.lineduotone.money.Banknote2
import com.chiksmedina.solar.lineduotone.money.Bill
import com.chiksmedina.solar.lineduotone.money.BillCheck
import com.chiksmedina.solar.lineduotone.money.BillCross
import com.chiksmedina.solar.lineduotone.money.BillList
import com.chiksmedina.solar.lineduotone.money.Card
import com.chiksmedina.solar.lineduotone.money.Card2
import com.chiksmedina.solar.lineduotone.money.CardRecive
import com.chiksmedina.solar.lineduotone.money.CardSearch
import com.chiksmedina.solar.lineduotone.money.CardSend
import com.chiksmedina.solar.lineduotone.money.CardTransfer
import com.chiksmedina.solar.lineduotone.money.Cardholder
import com.chiksmedina.solar.lineduotone.money.CashOut
import com.chiksmedina.solar.lineduotone.money.Dollar
import com.chiksmedina.solar.lineduotone.money.DollarMinimalistic
import com.chiksmedina.solar.lineduotone.money.Euro
import com.chiksmedina.solar.lineduotone.money.MoneyBag
import com.chiksmedina.solar.lineduotone.money.Ruble
import com.chiksmedina.solar.lineduotone.money.Safe2
import com.chiksmedina.solar.lineduotone.money.SafeCircle
import com.chiksmedina.solar.lineduotone.money.SafeSquare
import com.chiksmedina.solar.lineduotone.money.Sale
import com.chiksmedina.solar.lineduotone.money.SaleSquare
import com.chiksmedina.solar.lineduotone.money.Tag
import com.chiksmedina.solar.lineduotone.money.TagHorizontal
import com.chiksmedina.solar.lineduotone.money.TagPrice
import com.chiksmedina.solar.lineduotone.money.TickerStar
import com.chiksmedina.solar.lineduotone.money.Ticket
import com.chiksmedina.solar.lineduotone.money.TicketSale
import com.chiksmedina.solar.lineduotone.money.VerifiedCheck
import com.chiksmedina.solar.lineduotone.money.WadOfMoney
import com.chiksmedina.solar.lineduotone.money.Wallet
import com.chiksmedina.solar.lineduotone.money.Wallet2
import com.chiksmedina.solar.lineduotone.money.WalletMoney
import kotlin.collections.List as ____KtList

public object MoneyGroup

public val LineduotoneGroup.Money: MoneyGroup
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
