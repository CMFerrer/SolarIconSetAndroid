package com.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

public val DesignToolsGroup.PaletteRound: ImageVector
    get() {
        if (_paletteRound != null) {
            return _paletteRound!!
        }
        _paletteRound = Builder(name = "PaletteRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 3.7909f, 3.7909f, 2.0f, 6.0f, 2.0f)
                curveTo(8.2091f, 2.0f, 10.0f, 3.7909f, 10.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 20.2091f, 8.2091f, 22.0f, 6.0f, 22.0f)
                curveTo(3.7909f, 22.0f, 2.0f, 20.2091f, 2.0f, 18.0f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.2426f)
                lineTo(13.3137f, 4.9289f)
                curveTo(14.8758f, 3.3668f, 17.4084f, 3.3668f, 18.9705f, 4.9289f)
                curveTo(20.5326f, 6.491f, 20.5326f, 9.0237f, 18.9705f, 10.5858f)
                lineTo(9.3064f, 20.2499f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                lineTo(18.0f, 21.25f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(18.0f, 14.75f)
                lineTo(18.0f, 14.0f)
                close()
                moveTo(22.0f, 18.0f)
                lineTo(21.25f, 18.0f)
                lineTo(22.0f, 18.0f)
                close()
                moveTo(13.0f, 22.75f)
                curveTo(13.4142f, 22.75f, 13.75f, 22.4142f, 13.75f, 22.0f)
                curveTo(13.75f, 21.5858f, 13.4142f, 21.25f, 13.0f, 21.25f)
                lineTo(13.0f, 22.75f)
                close()
                moveTo(17.0f, 21.25f)
                curveTo(16.5858f, 21.25f, 16.25f, 21.5858f, 16.25f, 22.0f)
                curveTo(16.25f, 22.4142f, 16.5858f, 22.75f, 17.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(15.5f, 14.75f)
                lineTo(18.0f, 14.75f)
                lineTo(18.0f, 13.25f)
                lineTo(15.5f, 13.25f)
                lineTo(15.5f, 14.75f)
                close()
                moveTo(21.25f, 18.0f)
                curveTo(21.25f, 19.7949f, 19.7949f, 21.25f, 18.0f, 21.25f)
                lineTo(18.0f, 22.75f)
                curveTo(20.6234f, 22.75f, 22.75f, 20.6234f, 22.75f, 18.0f)
                lineTo(21.25f, 18.0f)
                close()
                moveTo(22.75f, 18.0f)
                curveTo(22.75f, 15.3766f, 20.6234f, 13.25f, 18.0f, 13.25f)
                lineTo(18.0f, 14.75f)
                curveTo(19.7949f, 14.75f, 21.25f, 16.2051f, 21.25f, 18.0f)
                lineTo(22.75f, 18.0f)
                close()
                moveTo(13.0f, 21.25f)
                lineTo(6.0f, 21.25f)
                lineTo(6.0f, 22.75f)
                lineTo(13.0f, 22.75f)
                lineTo(13.0f, 21.25f)
                close()
                moveTo(18.0f, 21.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
