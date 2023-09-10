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

val EssentionalUiGroup.MenuDots: ImageVector
    get() {
        if (_menuDots != null) {
            return _menuDots!!
        }
        _menuDots = Builder(
            name = "MenuDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 10.4812f, 3.4812f, 9.25f, 5.0f, 9.25f)
                curveTo(6.5188f, 9.25f, 7.75f, 10.4812f, 7.75f, 12.0f)
                curveTo(7.75f, 13.5188f, 6.5188f, 14.75f, 5.0f, 14.75f)
                curveTo(3.4812f, 14.75f, 2.25f, 13.5188f, 2.25f, 12.0f)
                close()
                moveTo(5.0f, 10.75f)
                curveTo(4.3096f, 10.75f, 3.75f, 11.3096f, 3.75f, 12.0f)
                curveTo(3.75f, 12.6904f, 4.3096f, 13.25f, 5.0f, 13.25f)
                curveTo(5.6904f, 13.25f, 6.25f, 12.6904f, 6.25f, 12.0f)
                curveTo(6.25f, 11.3096f, 5.6904f, 10.75f, 5.0f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 10.4812f, 10.4812f, 9.25f, 12.0f, 9.25f)
                curveTo(13.5188f, 9.25f, 14.75f, 10.4812f, 14.75f, 12.0f)
                curveTo(14.75f, 13.5188f, 13.5188f, 14.75f, 12.0f, 14.75f)
                curveTo(10.4812f, 14.75f, 9.25f, 13.5188f, 9.25f, 12.0f)
                close()
                moveTo(12.0f, 10.75f)
                curveTo(11.3096f, 10.75f, 10.75f, 11.3096f, 10.75f, 12.0f)
                curveTo(10.75f, 12.6904f, 11.3096f, 13.25f, 12.0f, 13.25f)
                curveTo(12.6904f, 13.25f, 13.25f, 12.6904f, 13.25f, 12.0f)
                curveTo(13.25f, 11.3096f, 12.6904f, 10.75f, 12.0f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.0f, 9.25f)
                curveTo(17.4812f, 9.25f, 16.25f, 10.4812f, 16.25f, 12.0f)
                curveTo(16.25f, 13.5188f, 17.4812f, 14.75f, 19.0f, 14.75f)
                curveTo(20.5188f, 14.75f, 21.75f, 13.5188f, 21.75f, 12.0f)
                curveTo(21.75f, 10.4812f, 20.5188f, 9.25f, 19.0f, 9.25f)
                close()
                moveTo(17.75f, 12.0f)
                curveTo(17.75f, 11.3096f, 18.3096f, 10.75f, 19.0f, 10.75f)
                curveTo(19.6904f, 10.75f, 20.25f, 11.3096f, 20.25f, 12.0f)
                curveTo(20.25f, 12.6904f, 19.6904f, 13.25f, 19.0f, 13.25f)
                curveTo(18.3096f, 13.25f, 17.75f, 12.6904f, 17.75f, 12.0f)
                close()
            }
        }
            .build()
        return _menuDots!!
    }

private var _menuDots: ImageVector? = null
