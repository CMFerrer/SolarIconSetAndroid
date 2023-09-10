package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.HamburgerMenu: ImageVector
    get() {
        if (_hamburgerMenu != null) {
            return _hamburgerMenu!!
        }
        _hamburgerMenu = Builder(
            name = "HamburgerMenu", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.75f, 7.0f)
                curveTo(20.75f, 7.4142f, 20.4142f, 7.75f, 20.0f, 7.75f)
                lineTo(4.0f, 7.75f)
                curveTo(3.5858f, 7.75f, 3.25f, 7.4142f, 3.25f, 7.0f)
                curveTo(3.25f, 6.5858f, 3.5858f, 6.25f, 4.0f, 6.25f)
                lineTo(20.0f, 6.25f)
                curveTo(20.4142f, 6.25f, 20.75f, 6.5858f, 20.75f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.75f, 12.0f)
                curveTo(20.75f, 12.4142f, 20.4142f, 12.75f, 20.0f, 12.75f)
                lineTo(4.0f, 12.75f)
                curveTo(3.5858f, 12.75f, 3.25f, 12.4142f, 3.25f, 12.0f)
                curveTo(3.25f, 11.5858f, 3.5858f, 11.25f, 4.0f, 11.25f)
                lineTo(20.0f, 11.25f)
                curveTo(20.4142f, 11.25f, 20.75f, 11.5858f, 20.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.75f, 17.0f)
                curveTo(20.75f, 17.4142f, 20.4142f, 17.75f, 20.0f, 17.75f)
                lineTo(4.0f, 17.75f)
                curveTo(3.5858f, 17.75f, 3.25f, 17.4142f, 3.25f, 17.0f)
                curveTo(3.25f, 16.5858f, 3.5858f, 16.25f, 4.0f, 16.25f)
                lineTo(20.0f, 16.25f)
                curveTo(20.4142f, 16.25f, 20.75f, 16.5858f, 20.75f, 17.0f)
                close()
            }
        }
            .build()
        return _hamburgerMenu!!
    }

private var _hamburgerMenu: ImageVector? = null
