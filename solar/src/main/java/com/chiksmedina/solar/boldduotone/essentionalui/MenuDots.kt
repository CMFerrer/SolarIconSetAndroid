package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

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
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 12.0f)
                curveTo(7.0f, 13.1046f, 6.1046f, 14.0f, 5.0f, 14.0f)
                curveTo(3.8954f, 14.0f, 3.0f, 13.1046f, 3.0f, 12.0f)
                curveTo(3.0f, 10.8954f, 3.8954f, 10.0f, 5.0f, 10.0f)
                curveTo(6.1046f, 10.0f, 7.0f, 10.8954f, 7.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 13.1046f, 20.1046f, 14.0f, 19.0f, 14.0f)
                curveTo(17.8954f, 14.0f, 17.0f, 13.1046f, 17.0f, 12.0f)
                curveTo(17.0f, 10.8954f, 17.8954f, 10.0f, 19.0f, 10.0f)
                curveTo(20.1046f, 10.0f, 21.0f, 10.8954f, 21.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                close()
            }
        }
            .build()
        return _menuDots!!
    }

private var _menuDots: ImageVector? = null
