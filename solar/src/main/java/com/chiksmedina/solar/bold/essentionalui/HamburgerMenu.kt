package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.HamburgerMenu: ImageVector
    get() {
        if (_hamburgerMenu != null) {
            return _hamburgerMenu!!
        }
        _hamburgerMenu = Builder(name = "HamburgerMenu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
                moveTo(18.75f, 16.0f)
                curveTo(18.75f, 16.4142f, 18.4142f, 16.75f, 18.0f, 16.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 15.25f, 18.75f, 15.5858f, 18.75f, 16.0f)
                close()
                moveTo(18.0f, 12.75f)
                curveTo(18.4142f, 12.75f, 18.75f, 12.4142f, 18.75f, 12.0f)
                curveTo(18.75f, 11.5858f, 18.4142f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 11.25f, 5.25f, 11.5858f, 5.25f, 12.0f)
                curveTo(5.25f, 12.4142f, 5.5858f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(18.0f)
                close()
                moveTo(18.75f, 8.0f)
                curveTo(18.75f, 8.4142f, 18.4142f, 8.75f, 18.0f, 8.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 8.75f, 5.25f, 8.4142f, 5.25f, 8.0f)
                curveTo(5.25f, 7.5858f, 5.5858f, 7.25f, 6.0f, 7.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 7.25f, 18.75f, 7.5858f, 18.75f, 8.0f)
                close()
            }
        }
        .build()
        return _hamburgerMenu!!
    }

private var _hamburgerMenu: ImageVector? = null
