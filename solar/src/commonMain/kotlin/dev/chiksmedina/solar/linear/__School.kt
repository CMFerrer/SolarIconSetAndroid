package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.school.Backpack
import dev.chiksmedina.solar.linear.school.Book
import dev.chiksmedina.solar.linear.school.Book2
import dev.chiksmedina.solar.linear.school.BookBookmark
import dev.chiksmedina.solar.linear.school.BookBookmarkMinimalistic
import dev.chiksmedina.solar.linear.school.BookMinimalistic
import dev.chiksmedina.solar.linear.school.Bookmark
import dev.chiksmedina.solar.linear.school.BookmarkCircle
import dev.chiksmedina.solar.linear.school.BookmarkOpened
import dev.chiksmedina.solar.linear.school.BookmarkSquare
import dev.chiksmedina.solar.linear.school.BookmarkSquareMinimalistic
import dev.chiksmedina.solar.linear.school.Calculator
import dev.chiksmedina.solar.linear.school.CalculatorMinimalistic
import dev.chiksmedina.solar.linear.school.Case
import dev.chiksmedina.solar.linear.school.CaseMinimalistic
import dev.chiksmedina.solar.linear.school.CaseRound
import dev.chiksmedina.solar.linear.school.CaseRoundMinimalistic
import dev.chiksmedina.solar.linear.school.Diploma
import dev.chiksmedina.solar.linear.school.DiplomaVerified
import dev.chiksmedina.solar.linear.school.Document
import dev.chiksmedina.solar.linear.school.Notebook
import dev.chiksmedina.solar.linear.school.NotebookBookmark
import dev.chiksmedina.solar.linear.school.NotebookMinimalistic
import dev.chiksmedina.solar.linear.school.NotebookSquare
import dev.chiksmedina.solar.linear.school.Passport
import dev.chiksmedina.solar.linear.school.PassportMinimalistic
import dev.chiksmedina.solar.linear.school.PlusMinus
import dev.chiksmedina.solar.linear.school.SquareAcademicCap
import dev.chiksmedina.solar.linear.school.SquareAcademicCap2
import kotlin.collections.List as KtList

object SchoolGroup

val LinearSolar.School: SchoolGroup
    get() = SchoolGroup

private var _AllIcons: KtList<ImageVector>? = null

val SchoolGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Backpack,
            Book,
            Bookmark,
            BookmarkCircle,
            BookmarkOpened,
            BookmarkSquare,
            BookmarkSquareMinimalistic,
            Book2,
            BookBookmark,
            BookBookmarkMinimalistic,
            BookMinimalistic,
            Calculator,
            CalculatorMinimalistic,
            Case,
            CaseMinimalistic,
            CaseRound,
            CaseRoundMinimalistic,
            Diploma,
            DiplomaVerified,
            Document,
            Notebook,
            NotebookBookmark,
            NotebookMinimalistic,
            NotebookSquare,
            Passport,
            PassportMinimalistic,
            PlusMinus,
            SquareAcademicCap,
            SquareAcademicCap2
        )
        return _AllIcons!!
    }
