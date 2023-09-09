package com.chiksmedina.solar.linear.essentionalui

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
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.Sleeping: ImageVector
    get() {
        if (_sleeping != null) {
            return _sleeping!!
        }
        _sleeping = Builder(name = "Sleeping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                verticalLineTo(15.6429f)
                curveTo(22.0f, 13.6479f, 22.0f, 12.6505f, 21.7194f, 11.8486f)
                curveTo(21.2169f, 10.4124f, 20.0876f, 9.2831f, 18.6514f, 8.7806f)
                curveTo(17.8495f, 8.5f, 16.8521f, 8.5f, 14.8571f, 8.5f)
                curveTo(14.0592f, 8.5f, 13.6602f, 8.5f, 13.3394f, 8.6122f)
                curveTo(12.7649f, 8.8133f, 12.3133f, 9.2649f, 12.1122f, 9.8394f)
                curveTo(12.0f, 10.1602f, 12.0f, 10.5592f, 12.0f, 11.3571f)
                verticalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 11.0f)
                curveTo(9.5f, 12.3807f, 8.3807f, 13.5f, 7.0f, 13.5f)
                curveTo(5.6193f, 13.5f, 4.5f, 12.3807f, 4.5f, 11.0f)
                curveTo(4.5f, 9.6193f, 5.6193f, 8.5f, 7.0f, 8.5f)
                curveTo(8.3807f, 8.5f, 9.5f, 9.6193f, 9.5f, 11.0f)
                close()
            }
        }
        .build()
        return _sleeping!!
    }

private var _sleeping: ImageVector? = null
