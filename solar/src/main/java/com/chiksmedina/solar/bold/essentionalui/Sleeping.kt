package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Sleeping: ImageVector
    get() {
        if (_sleeping != null) {
            return _sleeping!!
        }
        _sleeping = Builder(name = "Sleeping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 6.0f)
                curveTo(2.75f, 5.5858f, 2.4142f, 5.25f, 2.0f, 5.25f)
                curveTo(1.5858f, 5.25f, 1.25f, 5.5858f, 1.25f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.25f, 18.4142f, 1.5858f, 18.75f, 2.0f, 18.75f)
                curveTo(2.4142f, 18.75f, 2.75f, 18.4142f, 2.75f, 18.0f)
                verticalLineTo(16.75f)
                horizontalLineTo(21.142f)
                verticalLineTo(18.0002f)
                curveTo(21.142f, 18.4144f, 21.4778f, 18.7502f, 21.892f, 18.7502f)
                curveTo(22.3063f, 18.7502f, 22.642f, 18.4144f, 22.642f, 18.0002f)
                verticalLineTo(16.0001f)
                lineTo(22.6429f, 15.643f)
                curveTo(22.6429f, 13.648f, 22.6429f, 12.6506f, 22.3623f, 11.8487f)
                curveTo(21.8597f, 10.4125f, 20.7305f, 9.2832f, 19.2943f, 8.7807f)
                curveTo(18.4924f, 8.5001f, 17.4949f, 8.5001f, 15.5f, 8.5001f)
                horizontalLineTo(15.4977f)
                curveTo(14.7f, 8.5001f, 13.6599f, 8.5001f, 13.3394f, 8.6122f)
                curveTo(12.7649f, 8.8133f, 12.3133f, 9.2649f, 12.1122f, 9.8394f)
                curveTo(12.0f, 10.1602f, 12.0f, 10.5592f, 12.0f, 11.3571f)
                verticalLineTo(15.25f)
                horizontalLineTo(2.75f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.5f)
                curveTo(8.3807f, 13.5f, 9.5f, 12.3807f, 9.5f, 11.0f)
                curveTo(9.5f, 9.6193f, 8.3807f, 8.5f, 7.0f, 8.5f)
                curveTo(5.6193f, 8.5f, 4.5f, 9.6193f, 4.5f, 11.0f)
                curveTo(4.5f, 12.3807f, 5.6193f, 13.5f, 7.0f, 13.5f)
                close()
            }
        }
        .build()
        return _sleeping!!
    }

private var _sleeping: ImageVector? = null
