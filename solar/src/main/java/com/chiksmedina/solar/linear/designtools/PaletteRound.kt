package com.chiksmedina.solar.linear.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.DesignToolsGroup

val DesignToolsGroup.PaletteRound: ImageVector
    get() {
        if (_paletteRound != null) {
            return _paletteRound!!
        }
        _paletteRound = Builder(
            name = "PaletteRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 3.7909f, 3.7909f, 2.0f, 6.0f, 2.0f)
                curveTo(8.2091f, 2.0f, 10.0f, 3.7909f, 10.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 20.2091f, 8.2091f, 22.0f, 6.0f, 22.0f)
                curveTo(3.7909f, 22.0f, 2.0f, 20.2091f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 8.2426f)
                lineTo(13.3137f, 4.9289f)
                curveTo(14.8758f, 3.3668f, 17.4084f, 3.3668f, 18.9705f, 4.9289f)
                curveTo(20.5326f, 6.491f, 20.5326f, 9.0237f, 18.9705f, 10.5858f)
                lineTo(9.3064f, 20.2499f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                curveTo(20.2091f, 22.0f, 22.0f, 20.2091f, 22.0f, 18.0f)
                curveTo(22.0f, 15.7909f, 20.2091f, 14.0f, 18.0f, 14.0f)
                lineTo(15.5f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 18.0f)
                curveTo(7.0f, 18.5523f, 6.5523f, 19.0f, 6.0f, 19.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                curveTo(5.0f, 17.4477f, 5.4477f, 17.0f, 6.0f, 17.0f)
                curveTo(6.5523f, 17.0f, 7.0f, 17.4477f, 7.0f, 18.0f)
                close()
            }
        }
            .build()
        return _paletteRound!!
    }

private var _paletteRound: ImageVector? = null
