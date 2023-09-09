package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.money.Banknote
import com.chiksmedina.solar.outline.money.Banknote2
import com.chiksmedina.solar.outline.money.Bill
import com.chiksmedina.solar.outline.money.BillCheck
import com.chiksmedina.solar.outline.money.BillCross
import com.chiksmedina.solar.outline.money.BillList
import com.chiksmedina.solar.outline.money.Card
import com.chiksmedina.solar.outline.money.Card2
import com.chiksmedina.solar.outline.money.CardRecive
import com.chiksmedina.solar.outline.money.CardSearch
import com.chiksmedina.solar.outline.money.CardSend
import com.chiksmedina.solar.outline.money.CardTransfer
import com.chiksmedina.solar.outline.money.Cardholder
import com.chiksmedina.solar.outline.money.CashOut
import com.chiksmedina.solar.outline.money.Dollar
import com.chiksmedina.solar.outline.money.DollarMinimalistic
import com.chiksmedina.solar.outline.money.Euro
import com.chiksmedina.solar.outline.money.MoneyBag
import com.chiksmedina.solar.outline.money.Ruble
import com.chiksmedina.solar.outline.money.Safe2
import com.chiksmedina.solar.outline.money.SafeCircle
import com.chiksmedina.solar.outline.money.SafeSquare
import com.chiksmedina.solar.outline.money.Sale
import com.chiksmedina.solar.outline.money.SaleSquare
import com.chiksmedina.solar.outline.money.Tag
import com.chiksmedina.solar.outline.money.TagHorizontal
import com.chiksmedina.solar.outline.money.TagPrice
import com.chiksmedina.solar.outline.money.TickerStar
import com.chiksmedina.solar.outline.money.Ticket
import com.chiksmedina.solar.outline.money.TicketSale
import com.chiksmedina.solar.outline.money.VerifiedCheck
import com.chiksmedina.solar.outline.money.WadOfMoney
import com.chiksmedina.solar.outline.money.Wallet
import com.chiksmedina.solar.outline.money.Wallet2
import com.chiksmedina.solar.outline.money.WalletMoney
import kotlin.collections.List as ____KtList

public object MoneyGroup

public val OutlineGroup.Money: MoneyGroup
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
