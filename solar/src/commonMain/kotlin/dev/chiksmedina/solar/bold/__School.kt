package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.school.Backpack
import dev.chiksmedina.solar.bold.school.Book
import dev.chiksmedina.solar.bold.school.Book2
import dev.chiksmedina.solar.bold.school.BookBookmark
import dev.chiksmedina.solar.bold.school.BookBookmarkMinimalistic
import dev.chiksmedina.solar.bold.school.BookMinimalistic
import dev.chiksmedina.solar.bold.school.Bookmark
import dev.chiksmedina.solar.bold.school.BookmarkCircle
import dev.chiksmedina.solar.bold.school.BookmarkOpened
import dev.chiksmedina.solar.bold.school.BookmarkSquare
import dev.chiksmedina.solar.bold.school.BookmarkSquareMinimalistic
import dev.chiksmedina.solar.bold.school.Calculator
import dev.chiksmedina.solar.bold.school.CalculatorMinimalistic
import dev.chiksmedina.solar.bold.school.Case
import dev.chiksmedina.solar.bold.school.CaseMinimalistic
import dev.chiksmedina.solar.bold.school.CaseRound
import dev.chiksmedina.solar.bold.school.CaseRoundMinimalistic
import dev.chiksmedina.solar.bold.school.Diploma
import dev.chiksmedina.solar.bold.school.DiplomaVerified
import dev.chiksmedina.solar.bold.school.Document
import dev.chiksmedina.solar.bold.school.Notebook
import dev.chiksmedina.solar.bold.school.NotebookBookmark
import dev.chiksmedina.solar.bold.school.NotebookMinimalistic
import dev.chiksmedina.solar.bold.school.NotebookSquare
import dev.chiksmedina.solar.bold.school.Passport
import dev.chiksmedina.solar.bold.school.PassportMinimalistic
import dev.chiksmedina.solar.bold.school.PlusMinus
import dev.chiksmedina.solar.bold.school.SquareAcademicCap
import dev.chiksmedina.solar.bold.school.SquareAcademicCap2
import kotlin.collections.List as KtList

object SchoolGroup

val BoldSolar.School: SchoolGroup
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
