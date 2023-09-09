package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) {
            return _hanger2!!
        }
        _hanger2 = Builder(name = "Hanger2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5359f, 3.9091f)
                curveTo(9.5359f, 2.8547f, 10.4868f, 2.0f, 11.6599f, 2.0f)
                curveTo(12.8329f, 2.0f, 13.7839f, 2.8547f, 13.7839f, 3.9091f)
                curveTo(13.7839f, 4.4053f, 13.6046f, 4.8573f, 13.2925f, 5.1968f)
                curveTo(12.6948f, 5.8471f, 11.8015f, 6.502f, 11.8015f, 7.3454f)
                verticalLineTo(7.6299f)
                moveTo(11.8015f, 7.6299f)
                curveTo(12.533f, 7.6214f, 13.2674f, 7.8246f, 13.8845f, 8.2406f)
                lineTo(21.317f, 13.2509f)
                curveTo(22.6234f, 14.1315f, 21.9305f, 16.0f, 20.2975f, 16.0f)
                horizontalLineTo(18.0f)
                moveTo(11.8015f, 7.6299f)
                curveTo(11.076f, 7.6383f, 10.3534f, 7.855f, 9.751f, 8.2787f)
                lineTo(2.6553f, 13.27f)
                curveTo(1.3832f, 14.1648f, 2.0872f, 16.0f, 3.7025f, 16.0f)
                horizontalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                curveTo(6.0f, 16.1144f, 6.0f, 15.1716f, 6.5858f, 14.5858f)
                curveTo(7.1716f, 14.0f, 8.1144f, 14.0f, 10.0f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(15.8856f, 14.0f, 16.8284f, 14.0f, 17.4142f, 14.5858f)
                curveTo(18.0f, 15.1716f, 18.0f, 16.1144f, 18.0f, 18.0f)
                curveTo(18.0f, 19.8856f, 18.0f, 20.8284f, 17.4142f, 21.4142f)
                curveTo(16.8284f, 22.0f, 15.8856f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(8.1144f, 22.0f, 7.1716f, 22.0f, 6.5858f, 21.4142f)
                curveTo(6.0f, 20.8284f, 6.0f, 19.8856f, 6.0f, 18.0f)
                close()
            }
        }
        .build()
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
